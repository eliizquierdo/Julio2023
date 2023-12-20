package ejer1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//a
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		//b
		int suma= num1 + num2;
		int resta= num1 - num2;
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		//c
		if (num1<num2)
			System.out.println("num1 es mayor que num2");
		else
			System.out.println("num2 es mayor que num1");
	}

}
