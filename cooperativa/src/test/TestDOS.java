package test;

import java.util.logging.Level;

import datos.Almacen;
import datos.Lote;
import negocio.ProductoABM;
import negocio.StockABM;

public class TestDOS {

	public static void main(String[] args) {
		
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		
		StockABM stockAbm = new StockABM();
		ProductoABM productoAbm = new ProductoABM();
		
		Almacen almacen = stockAbm.traerAlmacen(productoAbm.traerProducto("003"));
		
		System.out.println(almacen);
		System.out.println("\nLotes:\n");
		for(Lote lote: almacen.getLotes()) {
			System.out.println(lote + "\n");
		}

	}

}
