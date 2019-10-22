package ads;

import static ads.Cargo.*;

public class Programa {
	public static void main(String[] args) {
		
		Funcionario vitor = new Funcionario(DBA,10000.0);
		System.out.println("Salario: "+ vitor.getSalarioComDesconto());
		
	}
}
