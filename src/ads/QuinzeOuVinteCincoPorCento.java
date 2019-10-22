package ads;

public class QuinzeOuVinteCincoPorCento implements RegraDeCalculo {
	@Override
	public Double calcula(Funcionario funcionario) {
		Double salario = funcionario.getSalario();
		if (salario > 2000) {
			return salario * 0.75;
		}
		return salario * 0.85;
	}

}
