<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/30
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>马香的页面</title>
    <script>
        function shijian(){
            var t=new Date;
            var clock=document.getElementById("time");
            clock.innerText=t.getFullYear()+"年"+(t.getMonth()+1)+"月"+t.getDate()+"号"+"周"+
            t.getDay()+"  "+t.getHours()+"点"+t.getMinutes()+"分"+t.getSeconds()+"秒";
        }
        function kaishi(){
            setInterval("shijian()", 1);
        }
    </script>
</head>
<body>
      <h1>我是登录页面哦</h1>
      <h1 id="time">显示当前时间</h1>
</body>
</html>
