

package ar.edu.unlam.tallerweb.triangulo;

import java.util.Scanner;
   public class Triangulo {
   static int area(int base,int altura){
	   
      return (base*altura)/2;
   }
   static int perimetro(int cateto1, int cateto2){
      int hipotenusa = (int) Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
      return cateto1+cateto2+hipotenusa;
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Escribe la base: ");
      int base = sc.nextInt();
      System.out.println("Escribe la altura: ");
      int altura = sc.nextInt();	

      System.out.println("Area: "+area(base,altura));
      System.out.println("Perimetro: "+perimetro(base,altura));
   }
}
