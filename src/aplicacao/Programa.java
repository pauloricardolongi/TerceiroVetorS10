package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
/*Fazer um programa para ler um número inteiro N. E a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.
Input:                                      Output:
3
1.72                                      AVERAGE HEIGHT = 1.69
1.56
1.80
 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vetor = new double[n];
		for (int i=0; i<n; i++) {
			vetor[i]= sc.nextDouble();
		}
		double soma= 0;
		for (int i=0; i<n; i++) {
			soma = soma + vetor[i];
		}
		double media = soma / n;
		System.out.printf("A altura média é: %.2f%n",  media);	
		
		sc.close();

	}

}
