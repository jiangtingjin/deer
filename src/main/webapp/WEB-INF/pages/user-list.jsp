<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<a href="input.do">添加</a>
	<table border="1" cellpadding="0" cellspacing="0" >
		<thead>
			<tr>
				<th>编号</th>
				<th>名称</th>
				<th>性别</th>
				<th>年龄</th>
				<th>生日</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userList }" var="user" varStatus="u">
			<tr>
				<td>${u.index+1 }</td>
				<td>${user.name }</td>
				<td>${user.gender }</td>
				<td>${user.age }</td>
				<td>${user.birthday }</td>
				<td>
					<a href="delete.do?id=${user.id }">删除</a> | 
					<a href="input.do?id=${user.id }">修改</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
		
	</table>
	
</body>
</html>