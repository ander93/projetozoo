package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TesteComparable {
	public static void main(String[] args) {
		System.out.println(CargoEnum.DESEMVOLVEDOR.getCodigo());
		List<Funcionario> empresa = new ArrayList<>();
		Funcionario f2 = new Funcionario("Ciclano", 2000.0, CargoEnum.DESEMVOLVEDOR);
		Funcionario f1 = new Funcionario("Fulano", 3000.0, CargoEnum.DESEMVOLVEDOR);
		
		
	empresa.add(f2);
	empresa.add(f1);
		
	System.out.println("Antes:" + empresa);
	
	Collections.sort(empresa);
	
	System.out.println("Depois" + empresa);
	

		
		
	}

}
