package datos;

import java.time.LocalDate;

public class NotaPedido {

	private int idNotaPedido;
	private LocalDate fecha;
	private int cantidad;
	private Cliente cliente;
	private boolean entregado;
	
	public NotaPedido() {
		super();
	}
	
	
	public int getIdNotaPedido() {
		return idNotaPedido;
	}


	protected void setIdNotaPedido(int idNotaPedido) {
		this.idNotaPedido = idNotaPedido;
	}


	public LocalDate getFecha() {
		return fecha;
	}
	protected void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	@Override
	public String toString() {
		return "NotaPedido [fecha=" + fecha + ", cantidad=" + cantidad + ", entregado=" + entregado + "]";
	}
	
	
	
}
