package principal;

import java.util.Locale;
import java.util.Scanner;

import conta_bancaria.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		N_conta n_conta = new N_conta();

		Abrir_conta conta;
		String Conta;
		double deposito;

		System.out.print("Bem vindo a abertura de contas!\n" + "Digite seu nome: ");
		String nome = sc.nextLine();

		System.out.print("\nDeseja realizar um deposito inicial?(sim/nao): ");
		String depositoInicial = sc.nextLine();

		int option2 = 1;

		do {
			switch (depositoInicial) {

			case "sim":
				System.out.print("\nPor favor digite o valor do depósito inicial: ");
				deposito = sc.nextDouble();

				Conta = n_conta.gerar_N();
				conta = new Abrir_conta(nome, Conta, deposito);
				System.out.println(conta);

				conta.Depositar();
				System.out.println("Valor Atualizado:\n"+ conta);
				conta.Saque();
				System.out.println("Valor Atualizado:\n"+ conta);

				option2 = 0;
				break;

			case "nao":
				Conta = n_conta.gerar_N();
				conta = new Abrir_conta(nome, Conta);
				System.out.println(conta);

				conta.Depositar();
				System.out.println("Valor Atualizado:\n"+ conta);
				conta.Saque();
				System.out.println("Valor Atualizado:\n"+ conta);

				option2 = 0;
				break;

			default:
				System.out.println("Digite novamente sua resposta, exatamente como 'sim' ou 'nao'");
				break;
			}

		} while (option2 != 0);

		sc.close();
	}
}
