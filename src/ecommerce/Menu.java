package ecommerce;

import java.util.Scanner;

import util.Cores;

public class Menu {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int opcao;
		
		while (true) {
		
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
				+ "-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("                LOJAS GEN                            ");
		System.out.println("                                                     ");
		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("            1 - Listar todos                         ");
		System.out.println("            2 - Lista Id                             ");
		System.out.println("            3 - Cadastrar                            ");
		System.out.println("            4 - Atualizar                            ");
		System.out.println("            5 - Deletar                              ");
		System.out.println("                                                     ");
		System.out.println("-----------------------------------------------------");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     " + Cores.TEXT_RESET);
		
		opcao = leia.nextInt();
		
		if (opcao == 6) {
			System.out.println("\nLojas Gen - Tudo o que você precisa!");
			sobre();
			
			 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Listar todos\n\n");

					break;
				case 2:
					System.out.println("Lista Id\n\n");

					break;
				case 3:
					System.out.println("Cadastrar\n\n");

					break;
				case 4:
					System.out.println("Atualizar\n\n");

					break;
				case 5:
					System.out.println("Deletar\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
 
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Hellmat Gabriel de Arruda Arújo");
		System.out.println("github.com/HellmatGa");
		System.out.println("*********************************************************");
	}
}