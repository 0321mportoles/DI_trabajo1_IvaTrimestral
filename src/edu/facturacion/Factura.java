package edu.facturacion;

import java.util.Iterator;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class Factura {
	private int numero;
	private List<Producto> productos;
	private LocalDate fechaFactura;
	
	public Factura(int numero, List<Producto> productos) {
		super();
		this.numero = numero;
		this.productos = productos;
	}
	
	public Factura(int numero, List<Producto> productos, LocalDate fechaFactura) {
		super();
		this.numero = numero;
		this.productos = productos;
		this.fechaFactura = fechaFactura;
	}
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public LocalDate getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(LocalDate fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    @Override
	public String toString() {
    	String cadena = "";
    	Iterator<Producto> iter = productos.iterator();
    	cadena = "La factura (" + this.getNumero() + ") tiene estos productos: \n\n";
		while(iter.hasNext()){
			Producto producto = (Producto) iter.next(); 
			cadena = cadena + String.format(producto.getDescripcion() + " ==> " + producto.getImporte() + "\n"); 
		}
		
		return cadena;
	}

	public int getTrimestre()
	{
		return UtilidadesCalculoIva.getTrimestreFecha(fechaFactura);
	}
   
   
}
