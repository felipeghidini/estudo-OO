package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Media;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Media media = new Media();
		
		System.out.print("Aluno: ");
		media.nome = sc.nextLine();
		System.out.print("Digite a nota 1 entre 0 e 30 pontos: ");
		media.nota1 = sc.nextDouble();
		System.out.print("Digite a nota 2 entre 0 e 35 pontos: ");
		media.nota2 = sc.nextDouble();
		System.out.print("Digite a nota 3 entre 0 e 35 pontos: ");
		media.nota3 = sc.nextDouble();
		
		System.out.println("Nota final: " + media.notaFinal());
		
		if(media.notaFinal() < 60) {
			System.out.println("Aluno de exame");
			System.out.printf("Precisa de: %.2f%n " , media.missao());
		}else {
			System.out.println("Aprovado");
		}
		
		
		sc.close();
	}

}
