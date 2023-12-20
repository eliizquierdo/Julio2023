package ejer4;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int suma = 0; // Variable para almacenar la suma de los números
	
	    Scanner teclado = new Scanner(System.in);
	
	    // Pedir al usuario que ingrese los números
	    System.out.println("Ingresa números (ingresa 0 para finalizar):");
	
	    // Leer los números y sumarlos hasta que se ingrese un cero
	    int numero = teclado.nextInt();
	    while (numero != 0) {
	        suma += numero;
	        numero = teclado.nextInt();
	    }
	
	    // Mostrar la suma de los números
	    System.out.println("La suma de los números ingresados es: " + suma);
	}
}

