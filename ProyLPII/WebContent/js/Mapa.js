  var map;
  function initMap() {
	map = new google.maps.Map(document.getElementById('map'), {
	  center: {lat: -12.12134, lng: -77.009508},
	  zoomControl: true,
	  zoom: 12
	});
	  map.controls[google.maps.ControlPosition.TOP_CENTER].push(document.getElementById("cabecera"));
	  map.controls[google.maps.ControlPosition.TOP_CENTER].push(document.getElementById("VerTodos"));
  }

