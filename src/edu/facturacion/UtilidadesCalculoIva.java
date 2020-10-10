package edu.facturacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.facturacion.Producto.Iva;

public class UtilidadesCalculoIva {
	
	//Calculo 3 meses anteriores 1 del mes al actual
	public static double calculoIVATrimestral( List<Factura> facturas) {
		double importeIva = 0.0;
		int trimestreActual  = getTrimestreActual();
		
		Iterator<Factura> iter = facturas.iterator();
		while(iter.hasNext()){
			Factura factura = (Factura) iter.next();
			if (factura.getTrimestre()  == trimestreActual) { 
				importeIva = importeIva +  UtilidadesFactura.calcularIVAFactura(factura);
			}
		}

		return importeIva;
	}

	private static int getTrimestreActual() {
		return UtilidadesCalculoIva.getTrimestreFecha(LocalDate.now());
	}
	
	public static int getTrimestreFecha(LocalDate fecha) 
	{
		int mes = fecha.getMonthValue();
		
		switch (mes) {
			case 1:
			case 2:
			case 3:
				return 1;
			case 4:
			case 5:
			case 6:
				return 2;
			case 7:
			case 8:
			case 9:
				return 3;
			case 10:
			case 11:
			case 12:
				return 4;
		}
		
		return 0;
	}
	
	
	public static double calculoIVAMesActual(List<Factura> facturas) 
	{
		double importeIva = 0.0;
		LocalDate fechaActual = LocalDate.now();
		
		Iterator<Factura> iter = facturas.iterator();
		while(iter.hasNext()){
			Factura factura = (Factura) iter.next();
			if (factura.getFechaFactura().getMonth()  == fechaActual.getMonth()) { 
				importeIva = importeIva +  UtilidadesFactura.calcularIVAFactura(factura);
			}
		}

		return importeIva;
	}
	

}
