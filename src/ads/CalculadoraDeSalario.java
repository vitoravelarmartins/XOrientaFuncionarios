package ads;

import static ads.Cargo.*;

public class CalculadoraDeSalario {

	public double calcular(Funcionario funcionario) {
		if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return new DezOuVintePorCento().calcula(funcionario);
		}
		if(DBA.equals(funcionario.getCargo()) || 
		TESTER.equals(funcionario.getCargo())){
		return new QuinzeOuVinteCincoPorCento().calcula(funcionario);
			
		}
		throw new RuntimeException("Cargo Invalido");
		}

	

}
