package Exercicios;
import java.util.Scanner;
public class Imposto {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double renda;
        System.out.println("Renda?");
        renda = sc.nextDouble();
        if(renda >= 2640)
        System.out.println("Pagara o imposto!");
        else
        System.out.println("Não pagara imposto!");
}
}
