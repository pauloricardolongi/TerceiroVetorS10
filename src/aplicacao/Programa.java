package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa {
/*Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.

 *Input: Output:                               AVERAGE PRICE = 700.00
3                                      
400.00
Stove
800.00
TV
900.00
Fryer
400.00
Stove
800.00
*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		for (int i=0; i<vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		double soma= 0.0;
		for (int i=0; i<vetor.length; i++) {
			soma = soma + vetor[i].getPreco();
		}
		double media = soma / vetor.length;
		System.out.printf("A  média de preço é: %.2f%n",  media);	
		
		sc.close();

	}

}
