$(function(){
	$(document).ready(function(){ // On load
		$(".fullscreen").css({"height":(($(window).height()))+"px"});
		$(".footer-padding").css("padding-bottom", $(".footer").outerHeight());
		$("body").flowtype({
		 minimum : 300,
		 maximum : 1860
		});
	});
	$(window).resize(function(){ // On resize
		$(".fullscreen").css({"height":(($(window).height()))+"px"});
		$(".footer-padding").css("padding-bottom", $(".footer").outerHeight());
	});
});