<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>白鹿埠</title>
</head>
<!-- <frameset rows="127,*,11" frameborder="no" border="0" framespacing="0">
	<frame src="top.jsp" name="topFrame" scrolling="no"
		noresize="noresize" id="topFrame" />
	<frame src="center.jsp" name="mainFrame" id="mainFrame" />
	<frame src="down.jsp" name="bottomFrame" scrolling="no"
		noresize="noresize" id="bottomFrame" />
</frameset> -->

 <frameset rows="127,*,11" frameborder="no" border="0" framespacing="0">
	<frame src="top.jsp" name="topFrame" scrolling="no"
		noresize="noresize" id="topFrame" ><jsp:include page="top.jsp"/></frame>
	<frame src="center.jsp" name="mainFrame" id="mainFrame" ><jsp:include page="center.jsp"/></frame>
	<frame src="down.jsp" name="bottomFrame" scrolling="no"
		noresize="noresize" id="bottomFrame" ><jsp:include page="down.jsp"/></frame>
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>
