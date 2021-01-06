package principal;

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.Funcionario;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.print("Quantos empregados serão registrados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("\nEmpregado # " + (i + 1) + ":");

			System.out.print("Digite o id: ");
			Integer id = sc.nextInt();
			sc.nextLine();

			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();

			System.out.print("Digite o salário: ");
			Double salario = sc.nextDouble();

			Funcionario fun = new Funcionario(id, nome, salario);

			list.add(fun);

		}

		System.out.print("\nDigite o id do funcionario que terá o salário aumentado: ");
		sc.nextLine();
		int id = sc.nextInt();
		Integer pos = hasId(list, id);

		if (pos == null) {
			System.out.println("Número ID incorreto!");
		} else {

			System.out.print("Digite a porcentagem de aumento no salário");
			sc.nextLine();
			Double porcentagem = sc.nextDouble();

			list.get(pos).AumentarSalario(porcentagem);
		}

		for (Funcionario i : list) {
			System.out.print(i);
		}

		sc.close();
		System.exit(0);
	}

	public static Integer hasId(List<Funcionario> list, int id) {
		Funcionario Id = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (Id != null) {
			return list.indexOf(Id);
		} else {
			return null;
		}
	}
}
