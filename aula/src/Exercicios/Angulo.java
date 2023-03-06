package Exercicios;
import java.util.Scanner; 
public class Angulo {
	public static void main(String args[]) {
		//instanciar objeto
		   Scanner sc = new Scanner(System.in);

		 //definir as variaveis 
		   double angGraus, angRadianos, seno , cosseno;

		 //ler o valor do angulo
		   System.out.println("Entre com o valor do angulo");
		   angGraus = sc.nextDouble();

		 //converter de graus para radianos (regra de 3)
		   angRadianos = angGraus*Math.PI/180;

		 //calcular o senoe cosseno
		   seno = Math.sin(angRadianos);
		   cosseno = Math.cos(angRadianos);

		 //mostrar o resultado 
		   System.out.printf("sin(%.0f) = %f\n",angGraus, seno);
		   System.out.printf("cos(%.0f) = %f\n",angGraus, cosseno);
		   
		 }
		}

