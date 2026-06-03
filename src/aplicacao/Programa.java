package aplicacao;

import java.util.Date;
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
		
		System.out.println("=== Teste 3: Vendedor findAll ===");
		
		list = vDao.findAll();
		
		for(Vendedor v: list) {
			System.out.println(v);
		}
		
		System.out.println("==== Teste 4 INSERT =====");
		Vendedor newVendedor = new Vendedor(null, "Joao", "joao@gmail.com", new Date(), 4000.00, departamento);
		vDao.insert(newVendedor);
		System.out.println("Inserido!, ID: " + newVendedor.getId());
		
		System.out.println("==== Teste 5 UPDATE =====");
		Vendedor vendedor1 = vDao.findById(1);
		vendedor1.setNome("Marcos marcos");
		vDao.update(vendedor1);
		System.out.println("update concluido!");

	}

}
