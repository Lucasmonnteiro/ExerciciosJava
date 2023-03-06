package Exercicios;
import java.util.Scanner;
import java.math.*;
public class Raiz {
     public static void main(String args[]) {
    	//declarando a variavel
    	 double valor;
    	 
    	//solicitando o valor ao usuario
    	 System.out.println("Valor?");
    
    	//instanciando um objeto de classe Scanner 
    	 Scanner sc = new Scanner(System.in);
    	
    	//lendo um valor do teclado usando o metodo de classe Scanner
    	 valor = sc.nextDouble();
    	 
    	//realizando o calculo e mostrand0 o resultado 
    	 System.out.println("raiz = "+Math.sqrt(valor));
}
}