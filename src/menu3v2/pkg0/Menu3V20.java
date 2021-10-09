
package menu3v2.pkg0;

import java.util.Scanner;
public class Menu3V20 {

	
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

		char continuar = 0;
		int opcao = 0;
		int subopcao = 0;

		do {
			System.out.println("\n\nMENU ATIVADOR v 2.0\n\n"
				+ "(1) - windows 10 \n"
				+ "(2) - windows 8  \n"
				+ "(3) - Windows 7  \n"
				+ "(4) - OFFICE 2010  \n"
				+ "(5) - OFFICE 2007  \n"
				+ "(6) - COREL X5   \n"
				+ "(7) - SAIR  \n"
				+ "TESTE OLA OLA ");
				+ "TESTE OLA DANIEL ");

			System.out.println("Escolha sua OPAçAO : ");
			opcao = entrada.nextInt();

			if (opcao == 1) {
				System.out.println("ATIVADOR windows 10 \n\n");
				System.out.println("ESCOLHA A OPCAO:"
					+ "\n\n(1) - ATIVAR WIN 10 64 bit\n"
					+ "(2) - ATIVAR Win 10 32 bit \n");
				subopcao = entrada.nextInt();
				
				switch (subopcao) {

					case 1:

						if (subopcao == 1) {
							System.out.println("ATIVANDO WIN 10 64 BITS ......");
						}

					case 2:
						if (subopcao == 2) {
							System.out.println("ATIvADO WIN 10 32 BITS ...... ");
						}

						System.out.println("PROGRAMA ATIVADO ..\n"
							+ "\n\nGOSTARIA DE ATIVAR MAIS ALGUM ?  S/N : \n");
				}

			}

			if (opcao == 2) {

				System.out.println("ATIVADOR windwos 8\n");
				System.out.println("\n\nESCOLHA OPCAO: "
					+ "\n\n(1) - ATIVAR WIN 8 64 Bits...\n"
					+ "(2) - ATIVAR WIN 8 32 Bits...\n");

				subopcao = entrada.nextInt();

				switch (subopcao) {

					case 1:

						if (subopcao == 1) {
							System.out.println("\nATIVANDO WIN 8 64 BITS ......\n");
						}

					case 2:
						if (subopcao == 2) {
							System.out.println("\nATIvADO WIN 8 32 BITS ......\n ");
						}

						System.out.println("\nPROGRAMA ATIVADO ..\n"
							+ "\n\nGOSTARIA DE ATIVAR MAIS ALGUM ?  S/N : \n");

				}
			}

			if (opcao == 3) {

				System.out.println("ATIVADOR windwos 7\n");
				System.out.println("\n\nESCOLHA OPCAO: "
					+ "\n\n(1) - ATIVAR WIN 7 64 Bits...\n"
					+ "(2) - ATIVAR WIN 7 32 Bits...\n");

				subopcao = entrada.nextInt();

				switch (subopcao) {

					case 1:

						if (subopcao == 1) {
							System.out.println("\nATIVANDO WIN 7 64 BITS ......\n");
						}

					case 2:
						if (subopcao == 2) {
							System.out.println("\nATIvADO WIN 7 32 BITS ......\n ");
						}

						System.out.println("\nPROGRAMA ATIVADO ..\n"
							+ "\n\nGOSTARIA DE ATIVAR MAIS ALGUM ?  S/N : \n");

				}
			}

			if (opcao == 4) {

				System.out.println("ATIVARDOR  OFFICE 2010\n");
				System.out.println("\n\nESCOLHA OPCAO: "
					+ "\n\n(1) - ATIVAR OFFICE 2010 64 Bits...\n"
					+ "(2) - ATIVAR OFFICE 2010 32 Bits...\n");

				subopcao = entrada.nextInt();

				switch (subopcao) {

					case 1:

						if (subopcao == 1) {
							System.out.println("\nATIVANDO OFFICE 2010  64 BITS ......\n");
						}

					case 2:
						if (subopcao == 2) {
							System.out.println("\nATIvADO OFFICE 2010 32 BITS ......\n ");
						}

						System.out.println("\nPROGRAMA ATIVADO ..\n"
							+ "\n\nGOSTARIA DE ATIVAR MAIS ALGUM ?  S/N : \n");

				}
			}
			if (opcao == 5) {

				System.out.println("ATIVARDOR  OFFICE 2007\n");
				System.out.println("\n\nESCOLHA OPCAO: "
					+ "\n\n(1) - ATIVAR OFFICE 2007 64 Bits...\n"
					+ "(2) - ATIVAR OFFICE 2007 32 Bits...\n");

				subopcao = entrada.nextInt();

				switch (subopcao) {

					case 1:

						if (subopcao == 1) {
							System.out.println("\nATIVANDO OFFICE 2007 64 BITS ......\n");
						}

					case 2:
						if (subopcao == 2) {
							System.out.println("\nATIvADO OFFICE 2007 32 BITS ......\n ");
						}

						System.out.println("\nPROGRAMA ATIVADO ..\n"
							+ "\n\nGOSTARIA DE ATIVAR MAIS ALGUM ?  S/N : \n");

				}
			}
			if (opcao == 6) {

				System.out.println("ATIVARDOR  COREL X5 \n");
				System.out.println("\n\nESCOLHA OPCAO: "
					+ "\n\n(1) - ATIVAR COREL X5 64 Bits...\n"
					+ "(2) - ATIVAR COREL X5 32 Bits...\n");

				subopcao = entrada.nextInt();

				switch (subopcao) {

					case 1:

						if (subopcao == 1) {
							System.out.println("\nATIVANDO COREL X5 64 BITS ......\n");
						}

					case 2:
						if (subopcao == 2) {
							System.out.println("\nATIvADO COREL X5 32 BITS ......\n ");
						}

						System.out.println("\nPROGRAMA ATIVADO ..\n"
							+ "\n\nGOSTARIA DE ATIVAR MAIS ALGUM ?  S/N : \n");

				}
			}

			if (opcao == 7) {

				System.out.println("\n\nVOCE ESCOLHEU SAIR DO ATIVADOR : "
					+ "\n\n(1) - VOLTA \n"
					+ "(2) - SAIR\n\n");
				subopcao = entrada.nextInt();

				switch (subopcao) {

					case 1:
						if (subopcao == 1) {
							System.out.println("PRESIONE [S] para Voltar :  ");
						}
					case 2:
						if (subopcao == 2) {
							System.out.println(" APERTE [N] PARA SAIR !!  ");
						}

				}

			}
			
			continuar = Character.toLowerCase(entrada.next().charAt(0));
		} while (continuar != 'n');

		System.out.println("PROGRAMA FINALIZADO\n\n"
			+ "\n\n---------------------------------"
			+ "\nPrograma ativador 2021\n"
			+ "versao 2.0\n"
			+ "Celso Teofilo\n"
			+ "-----------------------------------");
	}

}


