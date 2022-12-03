package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Producto;

public class ProductoDao {

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
	
	public Producto traerProducto(String codigo) throws HibernateException {
		Producto producto = null;
		try {
			this.iniciaOperacion();
			String query = "from Producto where codigo = '" + codigo + "'";
			producto = (Producto) session.createQuery(query).uniqueResult();
		} finally {
			session.close();
		}
		return producto;
	}
	
}
