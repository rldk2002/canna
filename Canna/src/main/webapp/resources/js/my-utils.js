/**
 * 
 */
// url에서 파라미터 얻기
(function($) {
	$.getUrlParam = function(name) {
	    var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
	    if (results==null){
	       return null;
	    }
	    else{
	       return results[1] || 0;
	    }
	}
	
	$.fn.dropDown = function(selector) {
		$view = $(selector);
		$(this).click(function() {
			$view.css({display: "block"}).animate({top: "0", left: "0"}, 500);
		})
		return this;
	}
	
	$.fn.moveUrl = function() {
		$(this).click(function() {
			document.location.href = $(this).data("href");
		});
		return false;
	} 
		
})(jQuery);
