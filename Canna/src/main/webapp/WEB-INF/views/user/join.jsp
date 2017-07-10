<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/css/user/join.css">
<script type="text/javascript">
$(document).ready(function() {
	$(".nav-category--join > ul > li").click(function() {
		var index = $(this).index();
		$(this).addClass("nav-category--selected");
		$(this).nextAll().removeClass("nav-category--selected");
		$(this).prevAll().removeClass("nav-category--selected");
		
		if(index == 0) {
			$(".section-user__company").css("display", "none");
			$(".section-user__personal").css("display", "block");
			$("#authority1").prop("checked", true);
		} else {
			$(".section-user__company").css("display", "block");
			$(".section-user__personal").css("display", "none");
			$("#authority2").prop("checked", true);
		}
	})
}) 
</script>
</head>
<body>

<nav class="nav-category--join">
	<ul>
		<li class="nav-category--selected">개인회원 가입</li>
		<li>기업회원 가입</li>
	</ul>
</nav>

<section class="section-user">
	<form:form modelAttribute="user">
		<h3 class="section-user__title">가입정보입력</h3>
		<div class="section-user__common">
			<ul>
				<li class="must">
					<form:input path="id" placeholder="아이디" maxlength="20"/>
					<div class="must-info">4~20자의 영문,숫자만 사용가능합니다.</div>
				</li>
				<li class="must">
					<form:password path="password" placeholder="비밀번호" maxlength="30"/>
					<div class="must-info">8~30자의 영문,숫자,특수문자를 조합하세요.</div>
				</li>
				<li class="must">
					<input type="password" id="password2" placeholder="비밀번호 확인" maxlength="30"/>
				</li>
				<li class="must">
					<form:input path="userName" placeholder="이름" maxlength="20"/>
					<div class="must-info">이름에는 특수문자를 사용할수 없습니다.</div>
				</li>
				<li class="must">
					<form:input path="nickName" placeholder="별명" maxlength="10"/>
				</li>
				<li class="must">
					<form:input path="email" placeholder="이메일" maxlength="40"/>
					<div class="must-info">유효한 이메일 주소를 입력해주세요</div>
				</li>
				<li class="must">
					<form:input path="tel" placeholder="연락처" maxlength="12"/>
					<div class="must-info">'-'을 제외하고 숫자만 입력해주세요</div>
				</li>
				<li class="must" style="display: none;">
					<form:radiobutton path="authority" label="개인" value="0" checked="checked"/>
					<form:radiobutton path="authority" label="기업" value="1"/>
				</li>
			</ul>
		</div>
		<div class="section-user__personal">
			<ul>
				<li class="must">
					<form:input path="birthday" placeholder="생년월일"/>
					<div class="must-info">예시) 20170709</div>
				</li>
				<li class="must area-gender">
					<span>성별</span>
					<form:radiobutton path="gender" label="남" value="0"/>
					<form:radiobutton path="gender" label="여" value="1"/>
				</li>
			</ul>
		</div>
		<div class="section-user__company">
			<ul>
				<li class="must"><form:input path="companyName" placeholder="회사명"/></li>
				<li class="must"><form:input path="address" placeholder="주소지"/></li>
			</ul>
		</div>
		<div class="section-user__submit">
			<form:button>가입하기</form:button>
		</div>
	</form:form>
</section>

</body>
</html>