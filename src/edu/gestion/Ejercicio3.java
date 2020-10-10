package edu.gestion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import edu.facturacion.Factura;
import edu.facturacion.Producto;
import edu.facturacion.UtilidadesFactura;
import edu.facturacion.Producto.Iva;
import edu.facturacion.UtilidadesCalculoIva;

public class Ejercicio3 {
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
		
		Factura factura1 = new Factura(1,ListaProductos, LocalDate.parse("2020-02-20"));
		Factura factura2 = new Factura(2,ListaProductos, LocalDate.parse("2020-05-20"));
		Factura factura3 = new Factura(3,ListaProductos, LocalDate.parse("2020-11-20"));
		Factura factura4 = new Factura(4,ListaProductos, LocalDate.parse("2020-10-20"));
		Factura factura5 = new Factura(5,ListaProductos, LocalDate.parse("2020-10-08"));
		
		List<Factura> listaFacturas = new ArrayList<Factura>();
		listaFacturas.add(factura1);
		listaFacturas.add(factura2);
		listaFacturas.add(factura3);
		listaFacturas.add(factura4);
		listaFacturas.add(factura5);
		
		
		double precioSinIva = UtilidadesFactura.calcularImporteFactura(factura1);
        System.out.println();
//        System.out.println(factura1.toString());
//        System.out.println("El precio sin IVA es : " + precioSinIva + " euros");
//        double precioDeIva = UtilidadesFactura.calcularIVAFactura(factura1);
//        System.out.println("El total del IVA es : " + precioDeIva + " euros");
//        double precioDeFacturaConIva = UtilidadesFactura.calcularImporteFacturaConIVA(factura1);
//        System.out.println("El total de la factura con IVA es : " + precioDeFacturaConIva + " euros");
        
        System.out.println("El IVA trimestral es: " + UtilidadesCalculoIva.calculoIVATrimestral(listaFacturas));
        System.out.println("El IVA de este mes es: " + UtilidadesCalculoIva.calculoIVAMesActual(listaFacturas));
	}// fin del main
}// fin class
