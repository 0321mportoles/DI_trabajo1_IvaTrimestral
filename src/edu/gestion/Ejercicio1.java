package edu.gestion;

import java.util.ArrayList;
import java.util.List;

import edu.facturacion.Factura;
import edu.facturacion.Producto;

public class Ejercicio1 {
	public static void main(String[] args) {
		
        Producto producto1=new Producto(0.75, "Leche");
        Producto producto2=new Producto(0.50, "Pan");
        Producto producto3=new Producto(8.99, "Salmón");
        Producto producto4=new Producto(2.95, "Aguacates");
        Producto producto5=new Producto(1.20, "Fregasuelos");
        Producto producto6=new Producto(0.56, "Cerveza");
        Producto producto7=new Producto(1.45, "Sandía");
        
        
        List<Producto>ListaProductos=new ArrayList<Producto>();
        ListaProductos.add(producto1);
        ListaProductos.add(producto2);
        ListaProductos.add(producto3);
        ListaProductos.add(producto4);
        ListaProductos.add(producto5);
        ListaProductos.add(producto6);
        ListaProductos.add(producto7);
		
		Factura factura1 = new Factura(1,ListaProductos);
        
        System.out.println(factura1.toString());
       
	}// fin del main
}// fin class
