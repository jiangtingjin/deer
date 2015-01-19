﻿<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/chili-1.7.pack.js"></script>
<script type="text/javascript" src="js/jquery.easing.js"></script>
<script type="text/javascript" src="js/jquery.dimensions.js"></script>
<script type="text/javascript" src="js/jquery.accordion.js"></script>
<script language="javascript">
	jQuery().ready(function(){
		jQuery('#navigation').accordion({
			header: '.head',
			navigation1: true, 
			event: 'click',
			fillSpace: true,
			animated: 'bounceslide'
		});
	});
</script>
<style type="text/css">
<!--
body {
	margin:0px;
	padding:0px;
	font-size: 12px;
}
#navigation {
	margin:0px;
	padding:0px;
	width:147px;
}
#navigation a.head {
	cursor:pointer;
	background:url(images/main_34.gif) no-repeat scroll;
	display:block;
	font-weight:bold;
	margin:0px;
	padding:5px 0 5px;
	text-align:center;
	font-size:12px;
	text-decoration:none;
}
#navigation ul {
	border-width:0px;
	margin:0px;
	padding:0px;
	text-indent:0px;
}
#navigation li {
	list-style:none; display:inline;
}
#navigation li li a {
	display:block;
	font-size:12px;
	text-decoration: none;
	text-align:center;
	padding:3px;
}
#navigation li li a:hover {
	background:url(images/tab_bg.gif) repeat-x;
		border:solid 1px #adb9c2;
}
-->
</style>
</head>
<body>
<div  style="height:100%;">
  <ul id="navigation">
    <li> <a class="head">新闻资讯管理</a>
      <ul>
        <li><a href="AddArticle.php" target="rightFrame">添加新闻</a></li>
        <li><a href="Articles.php" target="rightFrame">查看/修改新闻</a></li>
      </ul>
    </li>
    <li> <a class="head">文化管理</a>
      <ul>
        <li><a href="AddKind.php" target="rightFrame">添加文化</a></li>
        <li><a href="Kinds.php" target="rightFrame">查看/删除文化</a></li>
      </ul>
    </li>
    
    <li> <a class="head">舌尖生活</a>
      <ul>
        <li><a href="AddLink.php" target="rightFrame">添加舌尖</a></li>
        <li><a href="Links.php" target="rightFrame">查看/修改舌尖</a></li>
      </ul>
    </li>
     <li> <a class="head">乡村美景</a>
      <ul>
        <li><a href="AddLink.php" target="rightFrame">添加美景</a></li>
        <li><a href="Links.php" target="rightFrame">查看/修改美景</a></li>
      </ul>
    </li>
        <li> <a class="head">福利政策</a>
      <ul>
        <li><a href="AddKind.php" target="rightFrame">添加福利政策</a></li>
        <li><a href="Kinds.php" target="rightFrame">查看/删除福利政策</a></li>
      </ul>
    </li>
    <li> <a class="head">村委会信息管理</a>
      <ul>
        <li><a href="messages.php" target="rightFrame">添加村干部信息</a></li>
        <li><a href="messages.php" target="rightFrame">查看/删除村干部信息</a></li>
        
      </ul>
    </li>
   
    <li> <a class="head">留言评论管理</a>
      <ul>
        <li><a href="messages.php" target="rightFrame">查看/删除留言</a></li>
        
      </ul>
    </li>
    <li> <a class="head">版本信息</a>
      <ul>
        <li><a href="http://Www.865171.cn" target="_blank">bailu 1.0</a></li>
      </ul>
    </li>
  </ul>
</div>
</body>
</html>