package ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import util.Cores;
import model.Ecommerce;
import model.ProdutoEntrega;
import model.ProdutoRetirada;

public class Menu {
	public static void main(String[] args) {
		
		//Teste da class ecommerc
		//Ecommerce ec1 = new Ecommerce(101, 1, "Raphaela");
		//ec1.visualizar();
		
		Ecommerce ec1 = new ProdutoRetirada(102, 2, "Rebeca", "Sexta");
		ec1.visualizar();
		
		Ecommerce ec2 = new ProdutoEntrega(103,1, "Barbara", 5);
		ec2.visualizar();
		
		Scanner leia = new Scanner(System.in);

		int opcao;
		
		while (true) {
		
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
				+ "-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("                LOJAS MATRIX                            ");
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
		System.out.println("        Entre com a opção desejada:                  ");
		System.out.println("                                                     " + Cores.TEXT_RESET);
		
		try {
		opcao = leia.nextInt();
		}catch(InputMismatchException e) {
			System.out.print("\nDigite valores inteiros!");
			leia.nextLine();
			opcao = 0;
		}
		
		if (opcao == 6) {
			System.out.println("\nLojas Matrix - Tudo o que você precisa!");
			sobre();
			
			 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Listar todos\n\n");
					
					keyPress();
					break;
				case 2:
					System.out.println("Lista Id\n\n");
					
					keyPress();
					break;
				case 3:
					System.out.println("Cadastrar\n\n");
					
					keyPress();
					break;
				case 4:
					System.out.println("Atualizar\n\n");
					
					keyPress();
					break;
				case 5:
					System.out.println("Deletar\n\n");
					
					keyPress();
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					keyPress();
					break;
			}
		}
	}
 
	private static void keyPress() {
		// TODO Auto-generated method stub
		
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Hellmat Gabriel de Arruda Arújo");
		System.out.println("github.com/HellmatGa");
		System.out.println("*********************************************************");
	}
}