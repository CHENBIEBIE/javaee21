<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>CHENBIE-CRM | Starter</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="/static/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="/static/plugins/fontawesome/css/font-awesome.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="/static/dist/css/AdminLTE.min.css">
    <link rel="stylesheet" href="/static/dist/css/skins/skin-blue.min.css">
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <%@include file="../include/mainHeader.jsp"%>
    <%@include file="../include/mainSide.jsp"%>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->

        <section class="content">

            <div class="box box-primary">
                <div class="box-header with-border">
                    <div class="box-title">机会列表</div>
                    <div class="box-tools">
                        <button class="btn btn-xs btn-success" id="newBtn"><i class="fa fa-plus"></i> 新增机会</button>
                    </div>
                </div>
                <div class="box-body">
                    <table class="table" id="customerTable">
                        <thead>
                        <tr>

                            <th>机会名称</th>
                            <th>关联客户</th>
                            <th>价值</th>
                            <th>当前进度</th>
                            <th>最后跟进时间</th>
                            <th>所属员工</th>
                        </tr>
                        </thead>
                        <tbody></tbody>
                    </table>
                </div>
            </div>

        </section>

    </div>
    <!-- /.content-wrapper -->
</div>

<div class="modal fade" id="newModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">新增机会</h4>
            </div>
            <div class="modal-body">
                <form id="newForm">

                    <div class="form-group">
                        <label>机会名称</label>
                        <input type="text" class="form-control" name="name">
                    </div>
                    <div class="form-group">
                        <label>价值</label>
                        <input type="text" class="form-control" name="tel" >
                    </div>
                    <div class="form-group">
                        <label>关联客户</label>
                        <select name="level" class="form-control">
                            <option value=""></option>
                            <option value="★">张三</option>
                            <option value="★★">李四</option>
                            <option value="★★★">王大锤</option>
                        </select>
                    </div>

                    <div class="form-group" id="companyList">
                        <label>当前进度</label>
                        <%--<select name="companyid" class="form-control"></select>--%>
                        <select name="level" class="form-control">
                            <option value=""></option>
                            <option value="初次接触">初次接触</option>
                            <option value="洽谈成功">洽谈成功</option>
                            <option value="交涉合同">交涉合同</option>
                            <option value="交易搁置">交易搁置</option>
                            <option value="交易成功">交易成功</option>
                        </select>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="saveBtn">保存</button>
            </div>
        </div>
    </div>
</div>

<script src="/static/plugins/jQuery/jQuery-2.2.0.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="/static/bootstrap/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="/static/dist/js/app.min.js"></script>

<script>
    $(function(){
        $("#newBtn").click(function(){
            //重置表单
            $("#newForm")[0].reset();

            //使用Ajax加载最新的公司列表
            /*$.get("/customer/company.json").done(function(data){
                var $select = $("#companyList select");
                $select.html("");
                $select.append("<option></option>");
                if(data && data.length) {
                    for(var i = 0;i < data.length;i++) {
                        var company = data[i];
                        var option = "<option value='"+company.id+"'>"+company.name+"</option>";
                        $select.append(option);
                    }
                }
            }).fail(function(){
                alert("服务器异常");
            });*/


            $("#companyList").show();

            $("#newModal").modal({
                show:true,
                dropback:'static',
                keyboard:false
            });

        });
    });
</script>


</body>
</html>
