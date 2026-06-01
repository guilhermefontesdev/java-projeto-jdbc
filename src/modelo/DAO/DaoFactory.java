package modelo.DAO;

import db.DB;
import modelo.DAO.impl.VendedorDAOJDBC;

public class DaoFactory {
	
	
	public static VendedorDAO createVendedorDAO() {
		return new VendedorDAOJDBC(DB.getConnection());
	}
}
