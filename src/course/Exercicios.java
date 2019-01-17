package course;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número maior ou igual a 1 e menor ou igual a 1000: ");
		int x = sc.nextInt();
		
		int quant = 0;
		int soma = 0;
		double media = 0.0;
		double produto = 1.0;
		double a = 0.0;
		
		
		for (int i = 1; i <= x; i = i + 2) {
			
			quant ++;
			soma = i + soma;
			media = soma / quant;
			a = i;
			produto = a * produto;
			
			

			System.out.println(i);
			

		}
		System.out.println("Quantidade de números ímpares: "+ quant);
		System.out.println("A soma dos números ímpares: " + soma);
		System.out.println("Média dos números ímpares: " + media);
		System.out.println("Produto dos números ímpares: " + produto);
		sc.close();
	}

}
