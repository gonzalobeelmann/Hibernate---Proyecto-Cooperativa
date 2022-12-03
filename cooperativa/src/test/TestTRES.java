package test;

import java.util.logging.Level;
import negocio.ProductoABM;
import negocio.StockABM;

public class TestTRES {

	public static void main(String[] args) {
		
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		
		StockABM stockAbm = new StockABM();
		ProductoABM productoAbm = new ProductoABM();
		
		System.out.print("Productos existentes en el Almacen para el producto código '003': ");
		System.out.println(stockAbm.traerAlmacen(productoAbm.traerProducto("003")).cantProductosExistentes() + " unidades.");
		
		
	}

}
