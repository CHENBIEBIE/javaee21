<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/24
  Time: 17:19
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
    
    <div class="page-header">

        <h3>HandlerBas</h3>
    </div>
    <button id="btn">Load Template</button>

    <div id="message" style="margin-top:20px";></div>
</div>

<script src="/static/js/jquery-3.0.0.min.js"></script>

<script src="/static/js/handlebars-v4.0.5.js"></script>

<script type="kaishengit/template" id="msgTemplate">
    <div class="panel panel-default">
        <div class="panel-heading">

            {{author}}
            {{#if isVip}}
            <span class="text-danger">VIP</span>
            {{else}}
            <span class="text-danger">¤</span>
            {{/if}}
        </div>
        <div class="panel-body">
           <ul>
               {{#each msg}}
                    <li>{{this}}</li>
               {{/each}}
           </ul>
        </div>
    </div>
</script>
<script>

    $(function(){

        $("#btn").click(function(){

            var json = {"author":"李四","msg":["晚上到我家","然后吃个晚饭","一起遛个弯"],"isVip":true};

            //先拿到html
            var source = $("#msgTemplate").html();
            //吧html编译成temelte对象
            var template = Handlebars.compile(source);
            //把json传给temelate
            var html = template(json);

            $("#message").prepend(html);

        })
    })

</script>

</body>
</html>
