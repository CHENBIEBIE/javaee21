<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/23
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>
<script src="/static/js/jquery-3.0.0.min.js"></script>
<div class="container">
    <button id="But1">get json</button>
    <button id="But2">ajax method</button>
    <img src="/static/img/load.gif"  id="loadImg" style="display: none">
</div>
<script>

    $(function(){

        $("#But2").click(function(){

            var $this = $(this);

            $.ajax({

                url:"/user.json",
                type:"get",
                data:{"name":"tom"},
                timeout:10000,
                success:function(data){
                    console.log("success function");
                    alert("^_^");

                },
                error:function(){
                    alert("请求异常")
                },
                complete: function () {
                    console.log("complete funccccc");
                    $this.text("ajax method").removeAttr("disabled");
                    $("#loadImg").hide();
                },
                beforeSend:function(){
                    $this.text("sending...").attr("disabled","disabled");
                    $("#loadImg").show();

                }



            });


        });

        $("#But1").click(function(){

            $.getJSON("/user.json")
                    .done(function(data){
                        console.log(data);
                    })

                    .fail(function(){
                        alert("请求异常");
                    })
                    .always(function(){
                        console.log("二哈哈哈");
                    })


        })
        
    });



</script>

</body>
</html>
