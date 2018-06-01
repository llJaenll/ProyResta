    google.charts.load("current", {packages:['corechart']});
    google.charts.setOnLoadCallback(drawChart);
    function drawChart() {
      var data = google.visualization.arrayToDataTable([
        ["Producto", "cantidad", { role: "style" } ],
        ["chaufa", 84, "#b87333"],
        ["Arroz con Pollo", 100, "silver"],
        ["Lomo Saltado", 50, "gold"],
        ["Tallarines", 200, "color: #e5e4e2"]
      ]);

      var view = new google.visualization.DataView(data);
      view.setColumns([0, 1,
                       { calc: "stringify",
                         sourceColumn: 1,
                         type: "string",
                         role: "annotation" },
                       2]);

      var options = {
        title: "Productos Vendidos",
        width: 400,
        height:"100%",
        bar: {groupWidth: "100%"},
        legend: { position: "none" },
      };
      var chart = new google.visualization.ColumnChart(document.getElementById("artgraficobarra"));
      chart.draw(view, options);
  	}

 
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart1);

      function drawChart1() {

        var data = google.visualization.arrayToDataTable([
          ['distrito', 'Cantidad de Pedidos'],
          ['villa Maria',     11],
          ['Surco',      2],
          ['Miraflores',  2],
          ['San juan', 2],
          ['Villa el Salvador',    7]
        ]);

        var options = {
          title: 'Ventas por distrito',
		  width: 400,
		legend: { position: "none" },
        };

        var chart = new google.visualization.PieChart(document.getElementById('artgraficopie'));

        chart.draw(data, options);
      }
 