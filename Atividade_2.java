import java.util.Scanner;

public class Atividade_2 {



	public static void main(String[] args) {
		
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			� Os n�meros pares digitados;  
			� A soma dos n�meros pares digitados; 
			� Os n�meros �mpares digitados; 
			� A quantidade de n�meros �mpares digitados.*/

		
	Scanner leia = new Scanner(System.in);	
	int[] numeros = new int[6];	
	int[] pares = new int[6];		
	int[] impares = new int[6];		
	
	int x, par = 0, impar = 0, somapar = 0;	
		
		System.out.println("Digite 6 numeors inteiros");
		for(x = 0; x <6; x++) {
	System.out.print(x+1+"� numero: ");	
	numeros[x] = leia.nextInt();		
			
		if(numeros[x] % 2 == 0) {
			pares[par] = numeros[x];
		    par++;
		    somapar += numeros[x];
		}else{
			impares[impar] = numeros[x];
			impar++;
		}
			
			
		}
				
	System.out.println("Os numeros pares foram: ");	
		
		for(x = 0; x < par; x++) {
			System.out.print(pares[x]+", ");
		}

	System.out.println("\nA soma dos numeros pares foi de: "+somapar);
	
	System.out.println("Os numeros impares foram: ");
	
	for(x = 0; x < impar; x++) {
		System.out.print(impares[x]+", ");
	}
	System.out.println("\nAquantidade de numeros impares foi de: "+impar);
	
	}

}



