package ejer2;
import java.util.Scanner;
import java.util.Random;

public class Programa {
	Random azar= new Random();
	Scanner teclado = new Scanner(System.in);
	int num1;
	int num2;
	int i;
	public void Iniciar() {
		generar();
		comparar();
		
	
	}
	
	private void generar() {
		num1= azar.nextInt(100)+1;
		
		
	}
	
	private void comparar() {
		do{
			
			System.out.println("Ingrese un numero:  ");
			num2= teclado.nextInt();
		    if (num1==num2) {
		    System.out.println("Has ganado");
		    
		    	
		    }
			
		    else if(num2>num1) {
		    	System.out.println("El numero es muy grande, ingrese otro numero");
		    	
		  
		    }
		    	
		    else if(num2<num1) {
		    	System.out.println("Tu numero es muy pequeño, ingrese otro");
		    	
		    	
		    }
		    
			
		}while(num2!=num1);
		
		
		
	}
	
	
	
}


	
