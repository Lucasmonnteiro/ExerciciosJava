package Exercicios;
import java.util.Scanner;
public class Idade {
	public static void main(String args[]) {
		int idade;
		System.out.println("Idade?\n");
		Scanner sc = new Scanner(System.in);
		idade = sc.nextInt();
		if (idade > 17)
			System.out.println("Maior de idade!");
		else
			System.out.println("Menor de idade!");
		

}
}
