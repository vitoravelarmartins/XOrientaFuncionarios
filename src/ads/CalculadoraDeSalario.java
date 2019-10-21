package ads;

import static ads.Cargo.*;

public class CalculadoraDeSalario {

	public double calcular(Funcionario funcionario) {
		if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return dezOuVintePorcento(funcionario);
		}
		if(DBA.equals(funcionario.getCargo()) || 
		TESTER.equals(funcionario.getCargo())){
			return quinzerOuVinteCincoPorcento(funcionario);
			
		}
		throw new RuntimeException("Cargo Invalido");
		}

	private double quinzerOuVinteCincoPorcento(Funcionario funcionario) {
		Double salario = funcionario.getSalario();
		if (salario > 3000) {
			return salario *0.8;
		}
		return salario *0.90;
	}

	private double dezOuVintePorcento(Funcionario funcionario) {
		Double salario = funcionario.getSalario();
		if (salario > 5000) {
			return salario *0.75;
		}
		return salario *0.85;
	}

}
