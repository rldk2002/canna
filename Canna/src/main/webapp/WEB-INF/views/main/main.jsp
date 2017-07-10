<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/css/jquery.bxslider.css">
<link rel="stylesheet" href="/css/main/main.css">
<script type="text/javascript" src="/js/jquery.bxslider.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$(".bxslider").bxSlider({
		  mode:"fade",
		  speed:2000,
		  auto: true,
		  pager: false,
		  controls: false
	});
})
</script>
</head>
<body>
<!-- 슬라이더 광고 영역 -->
<section class="section-slider--ad">
	<ul class="bxslider">
		<li><a href="#"><img src="/images/bxslider/ad/ocean_world.jpg" title="오션월드에 어서오세요." alt="오션월드에 어서오세요."></a></li>
		<li><a href="#"><img src="/images/bxslider/ad/hamburger_sale.jpg" title="햄버거, 치킨, 피자 한자리에서 즐기자!" alt="햄버거, 치킨, 피자 한자리에서 즐기자!"></a></li>
	</ul>
</section>
<!-- //슬라이더 광고 영역 -->

<!-- 인기 채용 공고 영역 -->
<section class="section-recruit">
	<h3 class="section-recruit__title">인기 채용 공고</h3>
	
</section>
<!-- //인기 채용 공고 영역 -->

</body>
</html>