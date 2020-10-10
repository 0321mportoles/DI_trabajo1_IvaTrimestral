package edu.gestion;

import java.util.ArrayList;
import java.util.List;
import edu.facturacion.Factura;
import edu.facturacion.Producto;
import edu.facturacion.UtilidadesFactura;
import edu.facturacion.Producto.Iva;

public class Ejercicio2 {
	public static void main(String[] args) {
		
        Producto producto1 = new Producto(0.75, "Leche", Iva.SUPERREDUCIDO);
        Producto producto2 = new Producto(0.50, "Pan", Iva.SUPERREDUCIDO);
        Producto producto3 = new Producto(8.99, "Salmón", Iva.NORMAL);
        Producto producto4 = new Producto(2.95, "Aguacates", Iva.NORMAL);
        Producto producto5 = new Producto(1.20, "Fregasuelos", Iva.REDUCIDO);
        Producto producto6 = new Producto(0.56, "Cerveza", Iva.NORMAL);
        Producto producto7 = new Producto(1.45, "Sandía", Iva.REDUCIDO);
        
        
        List<Producto>ListaProductos=new ArrayList<Producto>();
        ListaProductos.add(producto1);
        ListaProductos.add(producto2);
        ListaProductos.add(producto3);
        ListaProductos.add(producto4);
        ListaProductos.add(producto5);
        ListaProductos.add(producto6);
        ListaProductos.add(producto7);
		
		Factura factura1 = new Factura(1,ListaProductos);
		double precioSinIva = UtilidadesFactura.calcularImporteFactura(factura1);
        System.out.println();
        System.out.println(factura1.toString());
        System.out.println("El precio sin IVA es : " + precioSinIva + " euros");
        double precioDeIva = UtilidadesFactura.calcularIVAFactura(factura1);
        System.out.println("El total del IVA es : " + precioDeIva + " euros");
        double precioDeFacturaConIva = UtilidadesFactura.calcularImporteFacturaConIVA(factura1);
        System.out.println("El total de la factura con IVA es : " + precioDeFacturaConIva + " euros");
        
	}// fin del main
}// fin class
