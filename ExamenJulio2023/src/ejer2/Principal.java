package ejer2;
import java.util.Scanner;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		//a
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2;
		do {
			System.out.println("Ingrese un nro menor de 10:");
			valor1=teclado.nextInt();
		}while(10 <valor1);
		//b
		Random azar = new Random();
		valor2 = azar.nextInt(51)+50;
		//c
		for (int i=valor1; i<valor2; i++)
			System.out.print(i+" ");
		}
		

}
