import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Banco bco = new Banco();

		for (int n = 1; n <= 10; n++) {
			bco.addCaixa(new Caixa(n));
		}

		Scanner scanner = new Scanner(System.in);
		String opcao = "";
		String cliente_nome;
		int cliente_idade;
		int numero_caixa;

		while (!opcao.equals("3")) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Retirar Senha");
			System.out.println("2 - Atender Cliente");
			System.out.println("3 - Sair");

			opcao = scanner.next();

			switch (opcao) {
			case "1":
				System.out.print("Nome do cliente: ");
				cliente_nome = scanner.next();
				System.out.print("Idade do cliente: ");
				cliente_idade = scanner.nextInt();
				bco.addCliente(new Cliente(cliente_nome, cliente_idade));
				break;
			case "2":
				System.out.print("Número do caixa: ");
				numero_caixa = scanner.nextInt();
				bco.getCaixas().get(numero_caixa).atenderCliente(bco.getClientes());
				break;
			}
		}

	}
}