package edu.facturacion;

public class Producto {
	private double importe;
	private String descripcion;
	private Iva tipoIva;

	public enum Iva {
		SUPERREDUCIDO, REDUCIDO, NORMAL;
		
		public static double getValorIva(Iva tipoIva) {
			switch (tipoIva) {
				case SUPERREDUCIDO:
					return 4.0;
				case REDUCIDO:
					return 10.0;
				case NORMAL:
					return 21.0;
				default:
					return 0;
			}
		}
	}

	public Producto (double importe, String descripcion, Iva tipoIva) {
		this.importe = importe;
		this.descripcion = descripcion;
		this.setTipoIva(tipoIva);
	}
	
	public double getImporte() {
		return importe;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public Iva getTipoIva() {
		return tipoIva;
	}

	public void setTipoIva(Iva tipoIva) {
		this.tipoIva = tipoIva;
	}
	
}
