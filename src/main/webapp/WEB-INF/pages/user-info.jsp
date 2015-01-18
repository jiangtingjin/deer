<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user-change.jsp</title>
</head>
<body>
	<form action="save.do" method="post">
		<input type="hidden" name="id" value="${user.id }"/><br/>
		姓名：<input type="text" name="name" value="${user.name }" /><br/>
		年龄：<input type="text" name="age" value="${user.age }" /><br/>
		性别：<input type="text" name="gender" value="${user.gender }" /><br/>
		生日：<input type="text" name="birthday" value="${user.birthday }" /><br/>
		<input type="submit" value="确定">
	</form>
</body>
</html>