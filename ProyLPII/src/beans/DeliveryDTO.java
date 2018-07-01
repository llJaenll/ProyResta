package beans;

public class DeliveryDTO {
	private int idDelivery,id_motor;
	private String fecha,dir,nomDel,dniDel,obsDel,pagoDel;
	private double total;
	
	public DeliveryDTO(){
		
	}

	public DeliveryDTO(int idDelivery, int id_motor, String fecha, String dir, String nomDel, String dniDel,
			String obsDel, String pagoDel, double total) {
		super();
		this.idDelivery = idDelivery;
		this.id_motor = id_motor;
		this.fecha = fecha;
		this.dir = dir;
		this.nomDel = nomDel;
		this.dniDel = dniDel;
		this.obsDel = obsDel;
		this.total = total;
		this.pagoDel = pagoDel;
	}

	public String getPagoDel() {
		return pagoDel;
	}

	public void setPagoDel(String pagoDel) {
		this.pagoDel = pagoDel;
	}

	public int getIdDelivery() {
		return idDelivery;
	}

	public void setIdDelivery(int idDelivery) {
		this.idDelivery = idDelivery;
	}

	public int getId_motor() {
		return id_motor;
	}

	public void setId_motor(int id_motor) {
		this.id_motor = id_motor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getNomDel() {
		return nomDel;
	}

	public void setNomDel(String nomDel) {
		this.nomDel = nomDel;
	}

	public String getDniDel() {
		return dniDel;
	}

	public void setDniDel(String dniDel) {
		this.dniDel = dniDel;
	}

	public String getObsDel() {
		return obsDel;
	}

	public void setObsDel(String obsDel) {
		this.obsDel = obsDel;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	

}
