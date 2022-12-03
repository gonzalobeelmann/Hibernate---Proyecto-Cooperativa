package test;

import java.util.logging.Level;
import negocio.ProductoABM;
import datos.Producto;

public class TestUNO {

	public static void main(String[] args) {
		
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		
		ProductoABM productoAbm = new ProductoABM();
		
		Producto producto = productoAbm.traerProducto("003");
		
		System.out.println(producto);
		

	}

}
