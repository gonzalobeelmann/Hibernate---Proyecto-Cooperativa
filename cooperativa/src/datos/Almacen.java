package datos;

import java.util.HashSet;
import java.util.Set;

public class Almacen extends Stock {

	private int cantDeseable;
	private int cantMinima;
	private Set<Lote> lotes = new HashSet<Lote>();
	public Almacen() {
		super();
	}
	public Almacen(Producto producto, int cantDeseable, int cantMinima) {
		super(producto);
		this.cantDeseable = cantDeseable;
		this.cantMinima = cantMinima;
	}
	public int getCantDeseable() {
		return cantDeseable;
	}
	public void setCantDeseable(int cantDeseable) {
		this.cantDeseable = cantDeseable;
	}
	public int getCantMinima() {
		return cantMinima;
	}
	public void setCantMinima(int cantMinima) {
		this.cantMinima = cantMinima;
	}
	public Set<Lote> getLotes() {
		return lotes;
	}
	public void setLotes(Set<Lote> lotes) {
		this.lotes = lotes;
	}
	@Override
	public String toString() {
		return "Almacen [idStock=" + idStock + ", cantDeseable=" + cantDeseable + ", cantMinima=" + cantMinima + "]";
	}
	
	public int cantProductosExistentes() {
		int cantidad = 0;
		for(Lote lote: this.getLotes()) {
			cantidad += lote.getCantExistente();
		}
		return cantidad;
	}
	
}
