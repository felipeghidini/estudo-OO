package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		System.out.println("Enter width");
		ret.width = sc.nextDouble();
		System.out.println("Enter height");
		ret.height = sc.nextDouble();
		
				
		System.out.printf("AREA = %.2f%n" , ret.area());
		System.out.printf("PERÍMETRO = %.2f%n" , ret.perimeter());
		System.out.printf("DIAGONAL = %.2f%n" , ret.diagonal());

		
		sc.close();
	}

}
