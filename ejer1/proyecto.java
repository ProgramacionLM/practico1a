package ejer1;

import java.util.Scanner;

public class proyecto {
	Scanner sc = new Scanner(System.in);
	
	int edad;
	double altura;
	int cedula;
	String apellido;
	
		public void Iniciar() {
		cargar();
		imprimir();
		
		}
		
		private void cargar() {
			
			
			System.out.println("Ingrese un apellido");
			apellido= sc.nextLine();
			System.out.println("Ingrese su edad");
			edad= sc.nextInt();
			System.out.println("Ingrese altura");
			altura= sc.nextDouble();
			System.out.println("Ingrese cedula");
			cedula= sc.nextInt();	
			
		}
		
		private void imprimir(){
			System.out.println("Su apellido es" + apellido);
			System.out.println("Su edad es" + edad);
			System.out.println("Su altura es" + altura);
			System.out.println("Su cedula es" + cedula);
			
		}
		
	}
	
	
