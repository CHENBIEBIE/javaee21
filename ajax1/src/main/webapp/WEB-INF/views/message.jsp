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
    <script src="/static/js/jquery-3.0.0.min.js"></script>
    <script>
        $(function () {

            setInterval(function(){

                console.log("hello" + new Date().getTime());

            },3000)
            
        });

    </script>

</body>
</html>
