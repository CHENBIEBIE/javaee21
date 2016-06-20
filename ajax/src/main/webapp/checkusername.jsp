
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<input type="text" id="username"><span id="help_text"></span>
<script>

    function creatXmlHttp() {

        var xmlhttp = null;

        if (Window.ActiveXObject) {
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        } else {
            xmlhttp = new XMLHttpRequest();
        }
        return xmlhttp;
    }
    document.querySelector("#username").onclick=function(){
        var username = this.value;

        var xmlHttp = creatXmlHttp();

        xmlHttp.open("get","/checkusername?username="+username);

        xmlHttp.onreadystatechange=function(){
            var readyState = xmlHttp.readyState;
            if (readyState==4){

                var httpState = xmlHttp.status;

                if (httpState==200){

                    var result = xmlHttp.responseText;
                    if (result=="yes"){
                        document.querySelector("#help_text").innerText="成功"
                    }else {
                        document.querySelector("#help_text").innerText="账号已存在"
                    }

                }else {
                    alert("服务器异常："+httpState);
                }

            }
        };
        xmlHttp.send();
    };

</script>
</body>
</html>
