package course;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero maior ou igual a 1 e menor ou igual a 1000: ");
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
		System.out.println("Quantidade de n�meros �mpares: "+ quant);
		System.out.println("A soma dos n�meros �mpares: " + soma);
		System.out.println("M�dia dos n�meros �mpares: " + media);
		System.out.println("Produto dos n�meros �mpares: " + produto);
		sc.close();
	}

}
