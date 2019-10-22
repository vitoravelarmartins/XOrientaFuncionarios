package ads;

public class DezOuVintePorCento implements RegraDeCalculo {
	@Override
	public Double calcula(Funcionario funcionario) {
		Double salario = funcionario.getSalario();
		if (salario > 3000) {
			return salario * 0.8;
		}
		return salario * 0.9;
	}



}
