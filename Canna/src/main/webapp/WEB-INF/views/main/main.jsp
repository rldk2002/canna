<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no">
<link rel="stylesheet" href="/css/font-awesome.min.css">
<link rel="stylesheet" href="/css/jquery.bxslider.css">
<link rel="stylesheet" href="/css/main/main.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<script type="text/javascript" src="/js/jquery.bxslider.min.js"></script>
<script type="text/javascript" src="/js/my-utils.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$(".btn-open-menu").on("click", function() {
		$(".menu").show();
		$(".menu").css({
			width: "260px",
			height: $(document).height()
		}).animate({right:0}, 300);
		$(".bg-menu").css({
			width: window.innerWidth,
			height: $(".menu").height()
		}).fadeIn(300);
	});	
	$(".bg-menu").on("click", function() {
		$(this).fadeOut(300);
		$(".menu").animate({right:-260}, 300);
		setTimeout(function() {
			$(".menu").hide();
		}, 300);
	})	
	
	$(".bxslider").bxSlider({
		  mode:"fade",
		  speed:2000,
		  auto: true,
		  pager: false,
		  controls: false
	});
})
</script>
<title><tiles:getAsString name="title"/></title>
</head>
<body>

<div id="wrap">
	
	<!-- 헤더 영역 -->
	<div id="header">
		<header class="gnb">
			<h1 class="logo">
				<a href="/" title="칸나 프로젝트">
					<img src="/images/logo.png" width="195px" height="52px" title="칸나 프로젝트" alt="칸나 프로젝트, 모든 채용정보를  알아보세요">
				</a>
			</h1>
			<button class="btn btn-open-menu"><i class="fa fa-bars" aria-hidden="true"></i></button>
			<div class="bg-menu">
				<div class="btn-close-menu"><i class="fa fa-times" aria-hidden="true"></i></div>
			</div>
			<div class="menu">
				<div class="area-account">
					<button class="btn btn-account" title="회원가입" onclick="location.href='/user/join'"><i class="fa fa-user-plus icon-account" aria-hidden="true"></i>회원가입</button>
					<button class="btn btn-account" title="로그인"><i class="fa fa-sign-in icon-account" aria-hidden="true"></i>로그인</button>
				</div>
				<ul class="nav-shortcut">
					<li><a href="/"><i class="fa fa-bullhorn icon-shortcut" aria-hidden="true"></i>채용공고</a></li>
					<li><a href="#"><i class="fa fa-calendar icon-shortcut" aria-hidden="true"></i>채용달력</a></li>
		 			<li><a href="#"><i class="fa fa-paperclip icon-shortcut" aria-hidden="true"></i>이력서</a></li>
		 			<li><a href="#"><i class="fa fa-pencil-square-o icon-shortcut" aria-hidden="true"></i>자기소개서</a></li>
		  			<li><a href="#"><i class="fa fa-paper-plane icon-shortcut" aria-hidden="true"></i>커뮤니티</a></li>
				</ul>
			</div>
		</header>
		
		<section class="section-search">
			<h1 class="logo">
				<a href="/" title="칸나 프로젝트">
					<img src="/images/logo.png" width="225px" height="60px" title="칸나 프로젝트" alt="칸나 프로젝트, 모든 채용정보를  알아보세요">
				</a>
			</h1>
			<div class="bg-searchbox">
				<input class="input-txt-search" type="search" id="keyword" title="검색 키워드" placeholder="기업, 채용공고를 검색하세요">
				<button class="btn btn-search"><i class="fa fa-search" aria-hidden="true"></i></button>
			</div>
		</section>
		
	</div>
	<!-- //헤더 영역 -->
	
	<div id="container">
		<!-- 슬라이더 광고 영역 -->
		<section class="section-slider-ad">
			<ul class="bxslider">
				<li><a href="#"><img src="/images/bxslider/ad/ocean_world.jpg" title="오션월드에 어서오세요." alt="오션월드에 어서오세요."></a></li>
				<li><a href="#"><img src="/images/bxslider/ad/hamburger_sale.jpg" title="햄버거, 치킨, 피자 한자리에서 즐기자!" alt="햄버거, 치킨, 피자 한자리에서 즐기자!"></a></li>
			</ul>
		</section>
		<!-- //슬라이더 광고 영역 -->
		
		<!-- 인기 채용 공고 영역 -->
		<section class="section-popular-recruit">
			<h3 class="title">인기 채용 공고</h3>
			
		</section>
		<!-- //인기 채용 공고 영역 -->
		
	</div>
	
	<!-- 푸터 영역 -->
	<footer id="footer">
		<ul class="nav-guide">
			<li><a href="#">이용약관</a>&nbsp; | &nbsp;</li>
			<li><a href="#">개인정보처리방침</a>&nbsp; | &nbsp;</li>
			<li><a href="#">공지사항</a>&nbsp; | &nbsp;</li>
			<li><a href="#">FAQ</a>&nbsp; | &nbsp;</li>
			<li><a href="#">문의하기</a></li>
		</ul>
		<div class="area-info">
			Tel : 02-123-4567 | Fax : 02-123-4568 | Email : canna@gmail.com<br/>
			ⓒ Copyright Canna Project. All rights reserved.
		</div>
	</footer>
	<!-- //푸터 영역 -->

</div>

</body>
</html>