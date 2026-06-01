package aplicacao;

import modelo.DAO.DaoFactory;
import modelo.DAO.VendedorDAO;
import modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		
		
		
		
		VendedorDAO vDao = DaoFactory.createVendedorDAO();
		
		
		Vendedor vendedor = vDao.findById(3);
		System.out.println(vendedor);

	}

}
