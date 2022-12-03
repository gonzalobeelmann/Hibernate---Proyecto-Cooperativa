package datos;

import java.util.HashSet;
import java.util.Set;

public class Pedido extends Stock {

	private Set<NotaPedido> notasPedidos = new HashSet<NotaPedido>();

	public Pedido() {
		super();
	}

	public Set<NotaPedido> getNotasPedidos() {
		return notasPedidos;
	}

	public void setNotasPedidos(Set<NotaPedido> notasPedidos) {
		this.notasPedidos = notasPedidos;
	}

	@Override
	public String toString() {
		return " ";
	}
	
	
	
}
