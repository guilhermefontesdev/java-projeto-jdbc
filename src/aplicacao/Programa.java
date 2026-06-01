package aplicacao;

import java.util.List;

import modelo.DAO.DaoFactory;
import modelo.DAO.VendedorDAO;
import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		
		
		
		
		VendedorDAO vDao = DaoFactory.createVendedorDAO();
		
		System.out.println("=== Teste 1: Vendedor findById ===");
		Vendedor vendedor = vDao.findById(3);
		System.out.println(vendedor);
		
		System.out.println("=== Teste 2: Vendedor findByDepartamento ===");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = vDao.findByDepartamento(departamento);
		
		for(Vendedor v: list) {
			System.out.println(v);
		}

	}

}
