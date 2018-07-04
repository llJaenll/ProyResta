  var map;
  function initMap() {
	  var directionsDisplay = new google.maps.DirectionsRenderer;
        var directionsService = new google.maps.DirectionsService;
	map = new google.maps.Map(document.getElementById('map'), {
		center: {lat: -34.397, lng: 150.644},
		zoomControl: true,
		zoom: 8
	});
	   directionsDisplay.setMap(map);
	 
			geocoder=new google.maps.Geocoder;
			// Try HTML5 geolocation.
			if (navigator.geolocation) {
			  navigator.geolocation.getCurrentPosition(function(position) {
				var pos = {
				  lat: position.coords.latitude,
				  lng: position.coords.longitude
				};
				 var pos2 = {
				  lat: -12.109059,
				  lng:-77.032548
				};
				 console.log(pos.lat);
				  geocoder.geocode({'location':pos},function(results,status){
						if(status=='OK'){
							if(results[1]){
									/*var infowindow = new google.maps.InfoWindow({
										content: results[1].formatted_address+""
								  	});
								 	var marker = new google.maps.Marker({
										position: pos,
										map: map,
										title: results[1].formatted_address+""
								 	});
									var marker2 = new google.maps.Marker({
										position: pos2,
										map: map,
										title: results[1].formatted_address+""
									});
									
									var heading = google.maps.geometry.spherical.computeDistanceBetween(
            									new google.maps.LatLng(pos.lat, pos.lng), new google.maps.LatLng(pos2.lat, pos2.lng));			
									console.log((heading)/1000);
								 	marker.addListener('click', function() {
										infowindow.open(map, marker);
								 	});*/
								 directionsService.route({
								  origin: {lat:  -12.109059, lng: -77.032548}, 
								  destination: {lat:pos.lat, lng:pos.lng}, 
								  travelMode: google.maps.TravelMode['WALKING']
								}, function(response, status) {
								  if (status == 'OK') {
									directionsDisplay.setDirections(response);
								  } else {
									window.alert('Directions request failed due to ' + status);
								  }
								});
								
								
							}
						}
				});
				
				map.setCenter(pos);
			  }, function() {
				handleLocationError(true, infoWindow, map.getCenter());
			  });
			
			} else {
			  // Browser doesn't support Geolocation
			  handleLocationError(false, infoWindow, map.getCenter());
			}
	  
  }

