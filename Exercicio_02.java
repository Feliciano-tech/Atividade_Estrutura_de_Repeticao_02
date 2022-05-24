package Estrutura_de_Repeticao;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in); // criando objeto de leitura 
		int pt = 0, pl = 0, psdb = 0, pdt = 0, nulo = 0, bran = 0, voto; // declaracao de variaveis 

		for (int i = 0; i < 50; i++) {
			//iniciando laco com o metodo for e declarando condicao onde se "i" for menor que 50 o laco continua.
			System.out.println("--------------------Urna--------------------\n");
			System.out.println("Escolha o numero do partido\n");                   //imprimindo orientacoes para o usuario   
			System.out.println("1-(13)PT         2-(12)PDT");
			System.out.println("3-(22)PL         4-(45)PSDB");
			System.out.println("5-Voto Branco    6-Voto Nulo");                        
			System.out.print("\nDigite o numero escolhido: ");
			voto = ler.nextInt(); // recebendo informacao do usuario pelo teclado

			switch (voto) {
          //utilizando condicional Switch  para que as case seja executado quando o usuario digitar o valor 
			case 1:
				pt++;
				break; // utilizando break para executar apenas a case acima dele 
			case 2:
				pdt++; //utilizando a variavel e "++" para que sempre seja somado +1 sempre que a case for acionada
				break;
			case 3:
				pl++;
				break;
			case 4:
				psdb++;
				break;
			case 5:
				bran++;
				break;
			case 6:
				nulo++;
				break;

			default: // aqui utilizamos default para caso o usuario digite um valor invalido
				System.out.println("\nNumero digitado invalido\nDigite um numero valido\n");

			}
		}
 		System.out.println("---------Total de votos---------");     // imprimindo a soma dos votos  
		System.out.println("PT: " + pt + "     PSDB: " + psdb);     // para o usuario 
		System.out.println("PL: " + pl + "     PDT: " + pdt);       // e fim do programa
		System.out.println("Nulo: " + nulo + "   Branco: " + bran);
		ler.close(); // aqui fechamos a leitura do teclado

	}

}
