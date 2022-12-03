package dao;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.Almacen;
import datos.Pedido;
import datos.Producto;

public class StockDao {

	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {		
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}	

	private void manejaExcepcion(HibernateException he) throws HibernateException{		
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}
	
	public Almacen traerAlmacen(Producto p) throws HibernateException {
		Almacen almacen = null;
		try {
			this.iniciaOperacion();
			String query = "from Almacen as a inner join fetch a.producto as p where p.idProducto = " + p.getIdProducto();
			almacen = (Almacen) session.createQuery(query).uniqueResult();
			Hibernate.initialize(almacen.getLotes());
		} finally {
			session.close();
		}
		return almacen;
	}
	
	public Pedido traerPedido(Producto producto) throws HibernateException {
		Pedido pedido = null;
		try {
			this.iniciaOperacion();
			String query = "from Pedido as p inner join fetch p.producto as pro where pro.idProducto = " + producto.getIdProducto();
			pedido = (Pedido) session.createQuery(query).uniqueResult();
			Hibernate.initialize(pedido.getNotasPedidos());
		} finally {
			session.close();
		}
		return pedido;
	}
	
	
}
