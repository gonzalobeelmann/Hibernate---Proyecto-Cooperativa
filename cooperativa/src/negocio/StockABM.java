package negocio;

import dao.StockDao;
import datos.Almacen;
import datos.NotaPedido;
import datos.Pedido;
import datos.Producto;

public class StockABM {

	StockDao dao = new StockDao();
	
	public Almacen traerAlmacen(Producto p) {
		return dao.traerAlmacen(p);
	}
	
	public Pedido traerPedido(Producto producto) {
		return dao.traerPedido(producto);
	}
	
	public int calcularCantidadAPedir(Producto producto) {
		int cantidadAPedir = 0;
		Pedido pedido = this.traerPedido(producto);
		for(NotaPedido notaPedido: pedido.getNotasPedidos()) {
			if(!notaPedido.isEntregado()) cantidadAPedir += notaPedido.getCantidad();
		}
		return cantidadAPedir;
	}
	
}
