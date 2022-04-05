
public class Atividade_1 {
		
	public static void main(String[] args) {
		
		
		/* Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
			(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
			(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
			(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
			(d) Mostre na tela cada valor do vetor A, um em cada linha.*/				

	int[] a = new int[6];
		
	int b, x = 0;	
		
a[0] = 1; a[1] = 0; a[2] = 5; a[3] = -2; a[4] = -5; a[5] = 7; 		
		
b = a[0] +	a[1] + a[5];
		
a[3] = 100;		
		
System.out.println("O resultado foi");		
		
		for(x = 0; x < 6; x++) {
			
		System.out.println(a[x]);
		
		}
		System.out.println("\nA soma dos valores em a[0], a[1] e a[5]"+b);
				
	}

}
