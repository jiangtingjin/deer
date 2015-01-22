<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>白鹿埠管理系统</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>
<link title="style1" rel="stylesheet" href="${pageContext.request.contextPath}/css/rightstyle.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/chili-1.7.pack.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easing.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.dimensions.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.accordion.js"></script>
<script language="javascript">
	jQuery().ready(function(){
		 var height=screen.height;
		 $(".mycenter").height(height-127-11-127);
		 
		  jQuery('#navigation').accordion({
			header: '.head',
			navigation1: true, 
			event: 'click',
			fillSpace: true,
			animated: 'bounceslide'
		});  
				 		
	});
</script>
</head>
<body>
<%@include file="top.html" %>
<%@include file="center.html" %>
<%@include file="down.html" %>
</body>
</html>