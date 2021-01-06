package conta_bancaria;

import java.util.Scanner;

public class Abrir_conta {

	private String nome;
	private String n_conta;
	private double saldo;

	// Constructors
	public Abrir_conta(String nome, String n_conta) {
		this.nome = nome;
		this.n_conta = n_conta;
	}

	public Abrir_conta(String nome, String n_conta, Double deposito) {
		this.nome = nome;
		this.n_conta = n_conta;
		this.saldo += deposito;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getN_conta() {
		return n_conta;
	}

	public double getSaldo() {
		return saldo;
	}

	// Deposit
	public void Depositar() {
		Scanner sc = new Scanner(System.in);
		double valor;

		System.out.print("\n\nPor favor digite o valor do depósito: ");
		valor = sc.nextDouble();

		saldo += valor;
	}

	// Withdraw
	public void Saque() {
		Scanner sc = new Scanner(System.in);
		double valor;

		System.out.print("\n\nPor favor digite o valor do saque: ");
		valor = sc.nextDouble();

		saldo -= (valor + 5);
	}

	public String toString() {
		return "Conta: " 
				+ n_conta 
				+ ", Nome: " 
				+ nome 
				+ ", Saldo R$ " 
				+ String.format("%.2f", saldo);

	}
	
	
}