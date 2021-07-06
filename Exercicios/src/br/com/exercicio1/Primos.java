package br.com.exercicio1;

import java.util.Scanner;

public class Primos {
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		int numero = num.nextInt();
		
		if(numero==1 || numero == 0) {
			System.out.println("Numero Composto");
		} else {
			if(numero>2 && numero%2==0) {
				System.out.println("Numero Composto");
			} else {
				if(numero>3 && numero%3==0) {
					System.out.println("Numero Composto");
				} else {
					if(numero>5 && numero%5==0) {
						System.out.println("Numero Composto");
					} else {
						if(numero>7 && numero%7==0) {
							System.out.println("Numero Composto");
						} else {
							System.out.println("Numero Primo");
						}
					}
				}
			}
		}
		
		
		
	}
	
	

}
