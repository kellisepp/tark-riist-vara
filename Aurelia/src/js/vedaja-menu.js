jQuery(document).ready(function() {
	  
	$(".mobileMenuToggle").click(function() {
		$(this).toggleClass('toggleVisible').toggleClass('toggleHidden');
		$(".header-bar").slideToggle().toggleClass('extra-sticky');
		$(".logo").fadeToggle();
	});	
	
});
$(function() {
	var header = $(".header-bar");
	var headerVisible = $(".header-area").outerHeight()
	
		$(window).scroll(function() {
			if ($(window).width() > 800) {
				var scroll = $(window).scrollTop();
				if (scroll >= headerVisible) {
					header.slideDown().addClass("sticky-header");
				} else {
					if (header.hasClass("extra-sticky")) {} 
					else {
						header.slideUp().removeClass("sticky-header");
					}
				}
			}
		});  
	

}); 