package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Entre com as medidas do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Ente com as medidas do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Area do tri�ngulo X: %.4f%n", areaX );
		
		System.out.printf("Area do tri�ngulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Triangulo X tem a maior �rea.");
		}else {
			System.out.println("Triangulo Y tem a maior �rea.");
		}

		
		sc.close();

	}

}
