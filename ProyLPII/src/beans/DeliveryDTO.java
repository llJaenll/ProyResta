package beans;

public class DeliveryDTO {
	private int idDelivery,id_motor;
	private String fecha,dir;
	private double total;
	
	public DeliveryDTO(){
		
	}
	public DeliveryDTO(int idDelivery, int id_motor, String dir, String fecha, double total) {
		super();
		this.idDelivery = idDelivery;
		this.id_motor = id_motor;
		this.dir = dir;
		this.fecha = fecha;
		this.total = total;
	}
	public int getidDelivery() {
		return idDelivery;
	}
	public void setidDelivery(int idDelivery) {
		this.idDelivery = idDelivery;
	}
	public int getid_motor() {
		return id_motor;
	}
	public void setid_motor(int id_motor) {
		this.id_motor = id_motor;
	}
	public String getdir() {
		return dir;
	}
	public void setdir(String dir) {
		this.dir = dir;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	

}
