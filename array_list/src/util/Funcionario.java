package util;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;

	public Funcionario() {
	}

	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void AumentarSalario(double porcentagem) {
		salario += ( (salario * porcentagem) / 100);
	}

	public String toString() {
		return "\nFuncionario [id = " + id + ", nome = " + nome + ", salario = " + salario + "]";
	}

}
