package br.com.exercicio3;

import java.util.Scanner;

public class Permuta {

	public static void main(String[] args) {
		
		System.out.println("Digite o primeiro numero: ");
		Scanner input = new Scanner(System.in);
		String num1 = input.nextLine();
		
		System.out.println("Digite o segundo numero: ");
		Scanner input2 = new Scanner(System.in);
		String num2 = input2.nextLine();
		
		try {
			int teste1 = Integer.parseInt(num1);
			int teste2 = Integer.parseInt(num2);
			
			System.out.println("OK");
			 
			int tam1 = num1.length();
			int tam2 = num2.length();
			System.out.println(tam1);
			
			char c[] = num1.toCharArray();
			char d[] = num2.toCharArray();
			
			for(int i = 0; i<tam1; i++) {
				for(int x = 0; x<tam2; x++) {
					
				}
			}
			
		} catch (Exception ex) {
			System.out.println("Fudeu");
		}
		
		

	}

}
