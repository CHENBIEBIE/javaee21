<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/js/datatables/css/dataTables.bootstrap.min.css">
    <%--<link rel="stylesheet" href="/static/js/datatables/css/jquery.dataTables.min.css">--%>
</head>
<body>
    <div class="container">
        <div class="page-header">
            <h3>DataTables 演示</h3>
        </div>
        <a href="javascript:;" id="newBookBtn" class="btn btn-primary"  style="margin-bottom: 20px">添加新书籍</a>

        <table id="dataTable" class="table">
            <thead>
            <tr>
                <th>ID</th>
                <th>名称</th>
                <th>作者</th>
                <th>价格</th>
                <th>数量</th>
                <th>出版社</th>
                <th>分类</th>
                <th>#</th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>

    <div class="modal fade" id="newBookModal">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">添加新书籍</h4>
                </div>
                <div class="modal-body">

                    <form id="saveForm">
                        <div class="form-group">
                            <label>书籍名称</label>
                            <input type="text" name="bookname" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>书籍作者</label>
                            <input type="text" name="bookauthor" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>书籍价格</label>
                            <input type="text" name="bookprice" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>书籍数量</label>
                            <input type="text" name="booknum" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>分类</label>
                            <select class="form-control" name="typeid">
                                <c:forEach items="${types}" var="type">
                                    <option value="${type.id}">${type.booktype}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>出版社</label>
                            <select class="form-control" name="pubid">
                                <c:forEach items="${pubs}" var="pub">
                                    <option value="${pub.id}">${pub.pubname}</option>
                                </c:forEach>
                            </select>
                        </div>

                    </form>

                </div>
                <div class="modal-footer text-danger">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-primary" id="saveBtn">保存</button>
                </div>
            </div>
        </div>
    </div>
<script src="http://cdn.bootcss.com/jquery/2.2.2/jquery.min.js"></script>
<script src="/static/js/bootstrap.min.js"></script>
<script src="/static/js/datatables/js/jquery.dataTables.min.js"></script>
<script src="/static/js/datatables/js/dataTables.bootstrap.min.js"></script>
<script src="/static/js/jquery.validate.min.js"></script>
<script>
    $(function(){

        var dataTables= $("#dataTable").DataTable({
            "lengthMenu": [ 5,10, 25, 50, 75, 100 ], //定义每页显示的数量列表
            "serverSide": true, //表示所有的操作都在服务端进行
            "ajax" : "/datatable/data.json", //服务端URL地址
            "order" : [0,'desc'],//增加书籍时改默认排序方式
            "columns" : [ //配置返回的JSON中data属性数据key和表格列的对应关系
                {"data":"id","name":"id"},
                {"data":"bookname"},
                {"data":"bookauthor"},
                {"data":"bookprice","name":"bookprice"},
                {"data":"booknum","name":"booknum"},
                {"data":"publisher.pubname"},
                {"data":"bookType.booktype","name":"typeid"},
                {"data":function(row){
                    //row就是获取的json对象中的一个book对象
                    return "<a href='javascript:;' class='delLink' rel='"+row.id+"'>删除</a>";
                }}
            ],
            "columnDefs":[ //定义列的特征
                {targets: [0], visible: false},
                {targets:[1,2,5,7],orderable:false}
            ],
            "language":{ //定义中文
                "search": "请输入书籍名称:",
                "zeroRecords":    "没有匹配的数据",
                "lengthMenu":     "显示 _MENU_ 条数据",
                "info":           "显示从 _START_ 到 _END_ 条数据 共 _TOTAL_ 条数据",
                "infoFiltered":   "(从 _MAX_ 条数据中过滤得来)",
                "loadingRecords": "加载中...",
                "processing":     "处理中...",
                "paginate": {
                    "first":      "首页",
                    "last":       "末页",
                    "next":       "下一页",
                    "previous":   "上一页"
                },
            }
        });

        //添加新书籍
        $("#saveForm").validate({

            errorElement:"span",
            errorClass:"text-danger",
            rules:{
                bookname:{
                    required:true
                },
                bookauthor:{
                    required:true
                },
                bookprice:{
                    required:true,
                    number:true
                },
                booknum:{
                    required:true,
                    digits:true
                }
            },
            messages:{
                bookname:{
                    required:"请输入书籍名称"
                },
                bookauthor:{
                    required:"请输入作者"
                },
                bookprice:{
                    required:"请输入价格",
                    number:"请输入正确的价格"
                },
                booknum:{
                    required:"请输入数量",
                    digits:"请输入正确的数量"
                }
            },

            submitHandler:function(form){
                $.post("/datatable/new",$(form).serialize())
                        .done(function(data){
                            if (data=="success"){

                                //添加成功是下拉框自动隐藏
                                $("#newBookModal").modal('hide');
                                //自动刷新吧添加的书籍显示最上方
                                dataTables.ajax.reload();
                            }
                        })
                        .fail(function(){
                            alert("请求服务器错误");
                        });
            }
        });


        $("#newBookBtn").click(function(){

            //添加书籍成功后表单重置，还有一种就是添加成功后重置
            $("#saveForm")[0].reset();
            $("#newBookModal").modal({

                show : true,
                backdrop : 'static',//点击其它地方下拉框不会取消
                keyboard : false //点击esc下拉框也不会取消
            });
        })

        //表单提交加验证
        $("#saveBtn").click(function(){

            $("#saveForm").submit();
        })

        //删除书籍（事件委托机制）
        //下面方法执行不了删除，因为异步执行网页是超链接有可能没被绑定上
        /*$(".delLink").click(function(){
            alert("xxx");
        })*/

        $(document).delegate(".delLink","click",function(){
            var id = $(this).attr("rel");
            $.get("datatable/"+id+"/del")
                    .done(function(data){

                    }).fail(function(){

                        alert("请求服务器异常");

                    })
        })


    });
</script>
</body>
</html>