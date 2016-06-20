<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>

<input type="text" id="username"><span id="help_text"></span>

<script>
    function createXmlHttp() {
        var xmlHttp = null;
        //ie < 9
        if(window.ActiveXObject) {
            xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
        } else {

            xmlHttp = new XMLHttpRequest();
        }
        return xmlHttp;
    }
    document.querySelector("#username").onchange = function(){
        var username = this.value;

        var xmlHttp = createXmlHttp();

        xmlHttp.open("get","/checkusername?username="+username);

        xmlHttp.onreadystatechange = function(){

            var readyState = xmlHttp.readyState;
            if(readyState == 4) {

                var httpState = xmlHttp.status;
                if(httpState == 200) {

                    var result = xmlHttp.responseText;
                    if(result == "yes") {
                        document.querySelector("#help_text").innerText = "创建账号成功";
                    } else {
                        document.querySelector("#help_text").innerText = "账号已被占用";
                    }
                } else {
                    alert("服务器请求异常:" + httpState);
                }
            }
        };

        xmlHttp.send();
    };
</script>

</body>
</html>