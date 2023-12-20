package ejer3;
import java.util.Scanner;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		//a
		Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10]; // Crear un array para almacenar los números
        double suma = 0; // Variable para almacenar la suma de los números

        // Pedir al usuario que ingrese los valores
        System.out.println("Ingresa 10 números:");
        // Leer los valores y almacenarlos en el array
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
            suma += numeros[i];
        }
        // Calcular el promedio
        double promedio = suma / 10;
        // Mostrar el promedio
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}

