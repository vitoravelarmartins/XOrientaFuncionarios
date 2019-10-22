package ads;

public class Funcionario {
	private Cargo cargo;
	private Double salario;

	public Funcionario(Cargo cargo, Double salario) {
		super();
		this.cargo = cargo;
		this.salario = salario;
	}

	public Cargo getCargo() {
		return this.cargo;

	}

	public Double getSalario() {
		return salario;
	}

	public double getSalarioComDesconto() {
		return cargo.getRegra().calcula(this);
	}
}
