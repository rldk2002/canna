<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no">
<link rel="stylesheet" href="/css/font-awesome.min.css">
<link rel="stylesheet" href="/css/user/join.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$(".nav-join-category > ul > li").click(function() {
		var index = $(this).index();
		$(this).addClass("skin-selected");
		$(this).nextAll().removeClass("skin-selected");
		$(this).prevAll().removeClass("skin-selected");
		
		if(index == 0) {
			$(".area-company").css("display", "none");
			$(".area-personal").css("display", "block");
			$("#authority1").prop("checked", true);
		} else {
			$(".area-company").css("display", "block");
			$(".area-personal").css("display", "none");
			$("#authority2").prop("checked", true);
		}
	})
}) 

</script>
<title><tiles:getAsString name="title"/></title>
</head>
<body>

<div id="wrap">
	<header class="header">
		<a class="nav-back" href="/"><i class="fa fa-angle-left" aria-hidden="true"></i></a>
		<h2>회원가입</h2>
	</header>
	
	<h1 class="logo">
		<img src="/images/logo.png" width="315px" height="84px" title="칸나 프로젝트" alt="칸나 프로젝트, 모든 채용정보를  알아보세요">
	</h1>
	
	<div id="container">
		<nav class="nav-join-category">
			<ul>
				<li class="skin-selected">개인회원 가입</li>
				<li>기업회원 가입</li>
			</ul>
		</nav>
		
		<div class="area-user">
			<form:form modelAttribute="user">
				<h3 class="area-user-title">가입정보입력</h3>
				<div class="area-common">
					<ul>
						<li><form:input path="id" placeholder="아이디"/></li>
						<li><form:input path="password" placeholder="비밀번호"/></li>
						<li><input type="password" id="password2" placeholder="비밀번호 확인"/></li>
						<li><form:input path="userName" placeholder="이름"/></li>
						<li><form:input path="nickName" placeholder="별명"/></li>
						<li><form:input path="email" placeholder="이메일"/></li>
						<li><form:input path="tel" placeholder="연락처"/></li>
						<li style="display: none;">
							<form:radiobutton path="authority" label="개인" value="0" checked="checked"/>
							<form:radiobutton path="authority" label="기업" value="1"/>
						</li>
					</ul>
				</div>
				<div class="area-personal">
					<ul>
						<li><form:input path="birthday" placeholder="생년월일"/></li>
						<li class="area-gender">
							<span>성별</span>
							<form:radiobutton path="gender" label="남" value="0"/>
							<form:radiobutton path="gender" label="여" value="1"/>
						</li>
					</ul>
				</div>
				<div class="area-company">
					<ul>
						<li><form:input path="companyName" placeholder="회사명"/></li>
						<li><form:input path="address" placeholder="주소지"/></li>
					</ul>
				</div>
				<div class="area-submit">
					<form:button>전송</form:button>
				</div>
			</form:form>
		</div>
		
	</div>
</div>


</body>
</html>