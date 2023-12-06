
import java.util.ArrayList;
import java.util.Scanner;


public class Cadastro {

	Scanner sc = new Scanner(System.in);


	ArrayList<Product> users = new ArrayList<Product>();

	public void cadastrar() {
		Product product = new Product();
		System.out.print("Digite o nome do produto: ");
		product.setProductName(sc.nextLine());
		System.out.print("Digite a quantidade: ");
		product.setProductStorage(sc.nextInt());
		System.out.print("Digite o preço de compra: ");
		product.setPurchasePrice(sc.nextDouble());
		System.out.print("Digite a validade: ");
		product.setExpirationDate(sc.nextDouble());
		sc.nextLine();


		users.add(product);
	}

	public void editar() {
		System.out.print("Digite a ID do usuário que deseja editar: ");
		int id = sc.nextInt();
		Product newProduct = users.get(id);
		System.out.print("Digite o nome do produto: ");
		newProduct.setProductName(sc.next());
		System.out.print("Digite a quantidade: ");
		newProduct.setProductStorage(sc.nextInt());
		System.out.print("Digite o preço de compra: ");
		newProduct.setPurchasePrice(sc.nextDouble());
		System.out.print("Digite a validade: ");
		newProduct.setExpirationDate(sc.nextDouble());

		users.set(id,newProduct);

		System.out.println("Processando...");
		System.out.println("Produto editado com sucesso!");
	}

	public void excluir() {
		System.out.print("Digite a ID do produto que deseja excluir: ");
		int id = sc.nextInt();
		users.remove(id);
		System.out.println("Processando...");
		System.out.println("Produto excluído com sucesso!");
	}

	public void listar() {
		for(int i = 0; i < users.size(); i++) {
			System.out.println("ID DO PRODUTO: " + i);
			System.out.printf("PRODUTO: %s%n", users.get(i).getProductName());
			System.out.printf("ESTOQUE: %d%n", users.get(i).getProductStorage());
			System.out.printf("PREÇO DE COMPRA: %.2f%n",users.get(i).getPurchasePrice());
			System.out.printf("DATA DE VALIDADE: %.2f%n", users.get(i).getExpirationDate());
			System.out.println();
		}

	}


}
