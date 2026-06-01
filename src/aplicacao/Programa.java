package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		
		
		Departamento obj = new Departamento(1,"Computadores");
		
		System.out.println(obj);
		
		
		Vendedor vendedor = new Vendedor(3, "Jonas", "Jonas@gmail.com" , LocalDate.parse("22/06/2007" , DateTimeFormatter.ofPattern("dd/MM/yyyy")) , 3000.00, obj);
		System.out.println(vendedor);

	}

}
