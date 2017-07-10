<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="/css/reset.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<title>${title}</title>
</head>
<body>

<div id="wrap">

	<!-- header 영역 -->
	<section id="header">
		<tiles:insertAttribute name="header"/>
	</section>
	<!-- //header 영역 -->
	
	<!-- container 영역 -->
	<section id="container">
		<tiles:insertAttribute name="container"/>
	</section>
	<!-- // container 영역 -->

	<!-- footer 영역 -->
	<section id="footer">
		<tiles:insertAttribute name="footer"/>
	</section>
	<!-- // footer 영역 -->
	
</div>

</body>
</html>