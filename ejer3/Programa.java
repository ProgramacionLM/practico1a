package ejer3;
import java.util.Random;
import java.util.Scanner;

public class Programa {
Scanner scanner= new Scanner(System.in);


	
	void iniciar(){
		String or1, or2;
		
		or1=cargarString();
		or2=cargarString();
		menu(or1,or2);
	}
	
	//carga de teclado dos String
	String cargarString(){
		System.out.println("Ingrese una linea de texto");
		String cadena=scanner.next();
		
		return cadena;
		
			 
	}
	
	//despliega menu
	void menu(String a, String b){
		int cadena1= a.length();
		int cadena2= b.length();
		int opciones;
		System.out.println("Presione 1:  Imprimir ambas cadenas y su largo");
		System.out.println("Presione 2: Comparar igualdad y quien es menor");
		System.out.println("Presione 3: Cambiar una cadena a todo mayúsculas y otra a todo minúsculas");
		System.out.println("Presione 4: Cargar nuevamente ambos String");
		System.out.println("Presione 0: Salir");
			opciones=scanner.nextInt();
			switch(opciones) {
		
			case 1: 
				System.out.println("El largo de la cadena es : "+(cadena1));
				System.out.println(" El Largo de la cadena es : "+(cadena2));
		    break;
			case 2:
				if(cadena1==cadena2) {
					System.out.println("Las cadenas tienen la misma cantidad de caracteres");
				}
				else if (cadena1>cadena2) {
					System.out.println("La primera cadena es mas grande que la segunda");
				}
				else if (cadena1<cadena2)
					System.out.println("La segunda cadena es mas grande que la primera");
			break;
			case 3:
				Random azar=new Random();
				int num1=azar.nextInt(2);
				if(num1==1) {
					System.out.println(a.toLowerCase());
					System.out.println(b.toLowerCase());
				}
					
			break;
			case 4:
					iniciar();
					
			break;
			
		    
		    
			
			
			}
					
	}

	
	
	
	
	
	
	
	
	
}

