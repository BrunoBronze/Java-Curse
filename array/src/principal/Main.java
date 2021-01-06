package principal;

import java.util.Scanner;
import Util.Quartos;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Quartos[] aluguel = new Quartos[10];

		for (int y = 0; y < 10; y++) {
			aluguel[y] = new Quartos((y + 1), "", "", true);
		}

		int n;

		do {

			System.out.print("Quantos quartos serão alugados? ");
			n = sc.nextInt();

			if (n < 1 || n > 10) {
				System.out.println("\nNumero de quarto inválido, quartos disponiveis 1 a 10");
			} else {
				int j = 0;
				do {
					sc.nextLine();
					System.out.println("\nAluguel #" + (j + 1));
					System.out.print("Digite o nome do locador: ");
					String nome = sc.nextLine();

					System.out.print("Digite o email do locador: ");
					String email = sc.nextLine();

					System.out.print("Digite o quarto desejado: ");
					int quarto = sc.nextInt();

					if (aluguel[quarto - 1].getSituacao() == true) {
						aluguel[quarto - 1].setLocador(nome);
						aluguel[quarto - 1].setEmail(email);
						aluguel[quarto - 1].setQuarto(quarto);
						aluguel[quarto - 1].setSituacao(false);
						j++;
					} else {
						System.out.println("\nQuarto alugado!!!");
					}
				} while (j < n);
			}

		} while (n < 1 || n > 10);

		for (int y = 0; y < aluguel.length; y++) {
			if (aluguel[y].getSituacao() == false) {
				System.out.println("Quartos ocupados:" + aluguel[y]);
			}
		}
		sc.close();
	}

}
