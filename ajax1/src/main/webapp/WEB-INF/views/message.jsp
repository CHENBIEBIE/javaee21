<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/24
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <div class="panel page-header">
            <h4>轮询演示</h4>
        </div>
        <a href="javascript:;" id="loadData">
        <div class="alert alert-info"style="display: none"></div>
        </a>
        <div id="message">
            <c:forEach items="${messageList}" var="msg">
                <div class="panel panel-default">
                    <div class="panel-heading">

                            ${msg.author}
                    </div>
                    <div class="panel-body">
                            ${msg.message}
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
    <script src="/static/js/jquery-3.0.0.min.js"></script>
    <script type="kaishengit/template" id="msgTemplate">
        <div class="panel panel-default">
            <div class="panel-heading" style="color: darkred">
                {{author}}
            </div>
            <div class="panel-body">
                {{msg}}
            </div>
        </div>
    </script>
    <script>
        $(function () {
            //从控制器传来，当前最大ID
            var maxId = ${maxId};

            var newData = null;


            //将最新的消息加载到页面
            $("#loadData").click(function(){

                var $message = $("#message");

                //代表不是null不是空
                if (newData){
                    for (var i=newData.length-1;i>=0;i--){
                        var msg = newData[i];
                        var html ='<div class="panel panel-default"><div class="panel-heading">'+msg.author+'</div><div class="panel-body">'+msg.message+'</div></div>';
                        var template = $("#msgTemplate").html();
                        template = template.replace("{{author}}",msg.author);
                        template = template.replace("{{msg}}",msg.message);

                        $message.prepend(template);
                    }

                    maxId = newData[0].id;
                    newData=null;
                    //点击两条信息后显示条消失
                    $(".alert").fadeOut();

                }

            });

            setInterval(function(){

                $.post("/message",{"maxId":maxId},function(data){
                    if (data.length >0){
                        newData = data;
                        console.log("有"+data.length+"条新数据")
                        $(".alert").text("有"+data.length+"条新数据").fadeIn();
                    }

                })

            },3000)
            
        });

    </script>

</body>
</html>
