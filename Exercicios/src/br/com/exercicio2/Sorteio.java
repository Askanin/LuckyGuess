package br.com.exercicio2;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		int valor = aleatorio.nextInt(100) + 1;
		
		System.out.println("-------------- *** Palpite da Sorte *** ------------------");
		System.out.println("Tente descobrir qual o número da sorte. Escolha um número entre 1 e 100.");
		System.out.println("Para sair do jogo digite ZERO (0)");
		System.out.print("Digite um numero: ");
		Scanner num = new Scanner(System.in);
		int palpite = num.nextInt();
		int pontos = 100;
		
		while((palpite>0 || palpite<=100) && palpite != valor) {
			if((palpite<0 || palpite>100)) {
				System.out.println("Numero inválido. Dê um palpite entre 1 e 100");
				num = new Scanner(System.in);
				palpite = num.nextInt();
			} else if (palpite == 0){
				System.out.println("Obrigado por jogar!");
				pontos = 0;
				break;
			} else {
				if(palpite < valor) {
					System.out.println("Numéro menor. Tente novamente!");
					num = new Scanner(System.in);
					palpite = num.nextInt();
				} else{
					System.out.println("Numero maior. Tente novamente!");
					num = new Scanner(System.in);
					palpite = num.nextInt();
				}
				
			} 
			if(pontos>=95) {
				pontos -= 1;
			} else if (pontos>=75 && pontos<95) {
				pontos -= 2;
			} else if (pontos>=50 && pontos<75) {
				pontos -= 5;
			} else {
				pontos -= 10;
			}
		} 
		
		if(palpite!=0) {
			System.out.println("Parabéns, você acertou!!! Numero gerado: " + valor);
			if(pontos==100) {
				System.out.println("Você é o Pika das Galaxias");
			} else if(pontos>=80 || pontos<100) {
				System.out.println("Você é foda!!!");
			} else if(pontos>=65 || pontos<80) {
				System.out.println("Você está no caminho...");
			} else if(pontos>=35 || pontos <65) {
				System.out.println("Você é fraco!");
			} else {
				System.out.println("Você perdeu um tempo precioso da sua vida para nada.");
			}
		}
		
		System.out.println("Sua pontuação foi: " + pontos);
	
		

	}

}
