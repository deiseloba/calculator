package br.com.dio;

import java.util.Scanner;

public class Calculadora {

	
	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          double a, b;
          
          System.out.println("Digite o primeiro valor:   " );
          a  = scan.nextDouble();
          System.out.println("Digite o segundo valor:    ");
          b = scan.nextDouble();

        double soma = soma( double a, double b);
        double subtracao = subtracao( double a,double b );
        double multiplicacao = multiplicacao( double a, double b) ;
        double divisao = divisao( double a, double b) ;

          System.out.println(soma);
          System.out.println(subtracao);
          System.out.println(multiplicacao);
          System.out.println(divisao);
	}
     public static double soma(double  a,double b )       {

        return a + b;
     }	 
    	 public static double subtracao(double a,  double b )       {

        return a - b;
    	 }	 
    		 public static double divisao(double a,  double b )       {

        return a / b;
    		 }		 
    			 public static double multiplicacao(double a,  double  b )       {

        return a * b;
     }
}
