  var map;
  function initMap() {
	map = new google.maps.Map(document.getElementById('map'), {
	  center: {lat: -12.046315, lng: -77.02694197654404},
	  zoomControl: true,
	  zoom: 10
	});
	  map.controls[google.maps.ControlPosition.TOP_CENTER].push(document.getElementById("cabecera"));
	  map.controls[google.maps.ControlPosition.TOP_CENTER].push(document.getElementById("VerTodos"));
  }

