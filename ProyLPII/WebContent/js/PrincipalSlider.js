var lista=[
		"img/banner1.jpg",
		"img/banner2.jpg",
		"img/banner3.jpg",
		"img/banner4.jpg"];
var i=1;
function cambio(){

	$( "#imgBan" ).animate({
    opacity: 0.5
	  }, 3000, function() {
		if(i>3){
			i=0;
		}
		console.log(lista[i],i);
		$("#imgBan").attr("src",lista[i]);
		$("#imgBan").css("opacity","1");

	
		i++;
	  });
	
	
}
$(document).ready(function(){
	
	
	cambio();
	setInterval(cambio,3000);
	
});