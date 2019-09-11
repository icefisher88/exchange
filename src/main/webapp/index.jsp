<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="/message/go">准备跳转......</a>
<div>
    用户名：<input type="text" id="userName" name="userName"/>
    <input type="button" value="查找用户"   onclick="Search()"/>
</div>
<h2>form----------------------------</h2>
<form id="reportGet" action="/message/report1" method="get">
    Begin:<input type="text" name="begin"><br>
    End:<input type="text" name="end"><br>
    <input type="submit" value="Get查找报表">
</form>
</body>
<script>

    function Search()
    {
        window.open("/message/detail/data="+document.getElementById("userName").value);
    }
</script>
</html>
