
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Cadastro cadastro = new Cadastro();
		int op;
		do {
		System.out.println();
		System.out.println("Escolha uma das opções abaixo \n "
				+ "1 - Cadastrar produto \n "
				+ "2 - Editar produto \n "
				+ "3 - Remover produto \n "
				+ "4 - Listar produtos em estoque \n "
				+ "5 - Fechar o menu");

		op = sc.nextInt();
		if (op == 1) {
			cadastro.cadastrar();
		} else if (op == 2) {
			cadastro.editar();
		} else if (op == 3) {
			cadastro.excluir();
		} else if (op == 4) {
			cadastro.listar();
		}
	}while(op != 5);
		System.out.println("Programa encerrado!");

		sc.close();
	}
}
