package test;

import java.util.logging.Level;
import datos.NotaPedido;
import datos.Pedido;
import negocio.ProductoABM;
import negocio.StockABM;

public class TestCUATRO {

	public static void main(String[] args) {
		
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		
		StockABM stockAbm = new StockABM();
		ProductoABM productoAbm = new ProductoABM();
		
		Pedido pedido = stockAbm.traerPedido(productoAbm.traerProducto("003"));
		
		System.out.println("Pedido ID(" + pedido.getIdStock() + ") del producto '" + pedido.getProducto().getProducto() + "'\n");
		if(pedido!=null && !pedido.getNotasPedidos().isEmpty()) {
			System.out.println("Notas pedidos:\n");
			for(NotaPedido notaPedido: pedido.getNotasPedidos()) {
				System.out.println(notaPedido);
			}
		}

	}

}
