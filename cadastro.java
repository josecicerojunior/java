import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("####### CADASTRO DE PRODUTOS ########");
		System.out.println("Digite o nome do produto! ");
		String produto = sc.nextLine();
		
		System.out.println("Digite o valor do produto: ");
		double preco = sc.nextDouble();
		
		System.out.println("Produto: " + produto);
		System.out.println("Preço: " + preco);
		
		sc.close();

	}

}
