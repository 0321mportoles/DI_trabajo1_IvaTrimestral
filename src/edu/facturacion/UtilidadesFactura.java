package edu.facturacion;

import java.util.Iterator;
import java.util.List;

import edu.facturacion.Producto.Iva;

public class UtilidadesFactura {

	
	//Calcula el importe SIN IVA de la factura
	public static double calcularImporteFactura(Factura f) {
		double precio = 0.0;
    	Iterator<Producto> iter = f.getProductos().iterator();
    	
    	while(iter.hasNext()){
			Producto producto = (Producto) iter.next(); 
			precio = precio +  producto.getImporte(); 
		}
		
		return precio;
	}
    
	//Calcula el IVA total de la factura
	public static double calcularIVAFactura(Factura f) { 
		double precio = 0.0;
		Iterator<Producto> iter = f.getProductos().iterator();
		
		while(iter.hasNext()){
			Producto producto = (Producto) iter.next(); 
			precio = precio +  (producto.getImporte() * Iva.getValorIva(producto.getTipoIva())/ 100); 
		}
		
		return precio;
	}
	
	public static double calcularImporteFacturaConIVA(Factura f) {
		double precio = 0.0;
		Iterator<Producto> iter = f.getProductos().iterator();
		
		while(iter.hasNext()){
			Producto producto = (Producto) iter.next(); 
			precio = precio +  producto.getImporte() + (producto.getImporte() * Iva.getValorIva(producto.getTipoIva())/ 100); 
		}
		
		return precio;	
	} 

}
