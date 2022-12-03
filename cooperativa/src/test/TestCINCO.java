package test;

import java.util.logging.Level;

import negocio.ProductoABM;
import negocio.StockABM;

public class TestCINCO {

	public static void main(String[] args) {
		
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		
		StockABM stockAbm = new StockABM();
		ProductoABM productoAbm = new ProductoABM();

		System.out.print("Cantidad pendiente de entrega del producto COD(003): ");
		System.out.println(stockAbm.calcularCantidadAPedir(productoAbm.traerProducto("003")) + " unidades.");
		
	}

}
