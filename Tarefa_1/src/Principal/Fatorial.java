package Principal;

import java.util.Scanner;

public class Fatorial {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int escolha,fat=1,cont=0;
		
		System.out.println("Informe o numero: ");
		escolha=entrada.nextInt();
		
		while(true) {
			
			if(escolha >0) {
				
				for(cont = escolha;cont >=1;cont--) {
					
					fat*=cont;
					
				}
				
				System.out.println("O resultado eh: "+fat);
				
				break;
			
			}else{
				
				System.out.println("Informe um numero diferente de zero: ");
				escolha=entrada.nextInt();
			
			}
			
			
		}
		
		
		
		
	}

}
