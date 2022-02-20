package capgemini;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);			
		
		String[] maiusculas = {"A", "B", "c", "D", "E", "F", "G", "H",
								"I", "J", "K", "L", "M", "N", "O", "P", 
								"Q", "R", "S", "T", "U", "W", "X", "Y", "Z"}; 
		
		String[] minusculas = {"a", "b", "c", "d", "e", "f", "g", "h",
								"i", "j", "k", "l", "m", "n", "o", "p", 
								"q", "r", "s", "t", "u", "w", "x", "y", "z"}; 
		
		String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		
		String[] especiais = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"};
		
		int count = 0;
	
		int upperLength = maiusculas.length;
		int lowerLength = minusculas.length;
		int numberLength = numeros.length;
		int caracLength = especiais.length;
		
		int op1 = (int) (Math.random() * upperLength);
		int op2 = (int) (Math.random() * lowerLength);
		int op3 = (int) (Math.random() * numberLength);
		int op4 = (int) (Math.random() * caracLength);
	
		
		System.out.println("Digite sua senha: ");
		String senhaCompleta = entrada.nextLine();		
			
			if (senhaCompleta.length() >= 6) {
							
				if ((senhaCompleta == maiusculas[op1]) || 
						(senhaCompleta == minusculas[op2]) || 
						(senhaCompleta == numeros[op3]) || 
						(senhaCompleta == especiais[op4])) {
					
				} else {
					
					System.out.println("A senha deve ter caracteres distintos");
				}
				
				System.out.println("Acesso permitido!");
				
					} else {
						System.out.println("Acrescente no m�nimo " + (6 - senhaCompleta.length()));
					}



		
		//if ((senha[count] == maiusculas[count]) || (senha[count] == minusculas[count]) || (senha[count] == numeros[count] || (senha[count] == especiais[count]))) {
			


		}			

	}

