package capgemini;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		int i, j, n;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de n: ");
		n = entrada.nextInt();
		
		for (i = 1; i <= n; i++) {
			for (j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		
		

		


	}

}
