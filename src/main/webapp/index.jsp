<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h2>Hello World!</h2>
	<a href="user/info.do?id=1">getUserInfo</a>
	<form action="user/save.do" method="post">
		<input type="text" name="gender" value="男"/>
		<input type="text" name="age" value="22"/>
		<input type="text" name="name" value="哈哈"/>
		<input type="text" name="birthday" value="1991-09-28"/>
		<input type="submit" value="提交"/>
	</form>
	<a href="user/list.do">list user</a>
</body>
</html>
