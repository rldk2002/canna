<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="/css/header/header-main.css">
<script type="text/javascript">
$(document).ready(function() {
	$(".gnb__menu--open").on("click", function() {
		$(".gnb__menu").show();
		$(".gnb__menu").css({
			width: "260px",
			height: $(document).height()
		}).animate({right:0}, 300);
		$(".gnb__menu--bg").css({
			width: window.innerWidth,
			height: $(".gnb__menu").height()
		}).fadeIn(300);
	});	
	$(".gnb__menu--bg").on("click", function() {
		$(this).fadeOut(300);
		$(".gnb__menu").animate({right:-260}, 300);
		setTimeout(function() {
			$(".gnb__menu").hide();
		}, 300);
	})	
})
</script>
<header class="gnb">
	<h1 class="gnb__logo">
		<a href="/" title="칸나 프로젝트">
			<img src="/images/logo.png" width="195px" height="52px" title="칸나 프로젝트" alt="칸나 프로젝트, 모든 채용정보를  알아보세요">
		</a>
	</h1>
	<button class="gnb__menu--open"><i class="fa fa-bars" aria-hidden="true"></i></button>
	<div class="gnb__menu--bg">
		<div class="gnb__menu--close"><i class="fa fa-times" aria-hidden="true"></i></div>
	</div>
	<section class="gnb__menu">
		<div class="gnb__area-account">
			<button class="gnb__btn-account" title="회원가입" onclick="location.href='/user/join'"><i class="fa fa-user-plus gnb__icon--visible" aria-hidden="true"></i>회원가입</button>
			<button class="gnb__btn-account" title="로그인" onclick="location.href='/user/login'"><i class="fa fa-sign-in gnb__icon--visible" aria-hidden="true"></i>로그인</button>
		</div>
		<ul class="gnb__nav-shortcut">
			<li><a href="/"><i class="fa fa-bullhorn gnb__icon--visible" aria-hidden="true"></i>채용공고</a></li>
			<li><a href="#"><i class="fa fa-calendar gnb__icon--visible" aria-hidden="true"></i>채용달력</a></li>
 			<li><a href="#"><i class="fa fa-paperclip gnb__icon--visible" aria-hidden="true"></i>이력서</a></li>
 			<li><a href="#"><i class="fa fa-pencil-square-o gnb__icon--visible" aria-hidden="true"></i>자기소개서</a></li>
  			<li><a href="#"><i class="fa fa-paper-plane gnb__icon--visible" aria-hidden="true"></i>커뮤니티</a></li>
		</ul>
	</section>
</header>
<section class="gnb__search-section">
	<h1 class="gnb__logo">
		<a href="/" title="칸나 프로젝트">
			<img src="/images/logo.png" width="225px" height="60px" title="칸나 프로젝트" alt="칸나 프로젝트, 모든 채용정보를  알아보세요">
		</a>
	</h1>
	<div class="gnb__searchBox--bg">
		<input class="gnb__searchBox-input" type="search" id="keyword" title="검색 키워드" placeholder="기업, 채용공고를 검색하세요">
		<button class="gnb__searchBox-btn"><i class="fa fa-search" aria-hidden="true"></i></button>
	</div>
</section>