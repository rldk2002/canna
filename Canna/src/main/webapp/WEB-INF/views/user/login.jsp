<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/css/user/login.css">
<script type="text/javascript">
function getUrlParam(name) {
    var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
    if (results==null){
       return null;
    }
    else{
       return results[1] || 0;
    }
}
$(document).ready(function() {
	var cause = getUrlParam("cause");
	if(cause == 100) {
		alert("InternalAuthenticationServiceException 발생");
	}
	else if(cause == 101) {
		$(".message-err").css({
			fontSize: "12px",
			color: "red"
		}).text("<spring:message code='AbstractUserDetailsAuthenticationProvider.badCredentials' />");
	}
})
</script>
</head>
<body>

<form:form modelAttribute="user" cssClass="section-login">
	<h3 class="section-login__title"><i class="fa fa-unlock-alt" aria-hidden="true"></i> 로그인</h3>
	<ul class="section-login__form">
		<li>
			<form:input path="username" placeholder="아이디" maxlength="20"/>
		</li>
		<li>
			<form:password path="password" placeholder="비밀번호" maxlength="30"/>
		</li>
		<li class="message-err">
		
		</li>
	</ul>
	<form:button class="section-login__submit">로그인</form:button>
</form:form>
<div class="area-user">
	<span>회원이 아니신가요? <a href="/user/join">회원가입</a></span>
</div>

</body>
</html>