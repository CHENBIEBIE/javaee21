<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <c:choose>

            <c:when test="${param.code == 1001}">
                <div class="alert alert-danger">
                    验证码错误
                </div>
            </c:when>
        </c:choose>


        <form action="/login" method="post">

            <div class="form-group">
                <lable>账号</lable>
                <input type="text" class="form-control" name="username">
            </div>
            <div class="form-group">
                <lable>密码</lable>
                <input type="text" class="form-control" name="password">
            </div>
            <div class="form-group">
                <lable>验证码</lable>
                <input type="text" class="form-control" name="captcha">
                <a href="javascript:;" id="changePic"><img id="captcha" src="/captcha.png" alt=""></a>
            </div>
            <button class="btn btn-primary">登陆</button>
        </form>
        
    </div>


    <script src="/static/js/jquery-3.0.0.min.js"></script>
    <script>

        $(function(){
            $("#changePic").click(function(){
              $("#captcha").attr("src","/captcha.png?t="+new Date().getTime());
            });

        });
    </script>
</body>
</html>
