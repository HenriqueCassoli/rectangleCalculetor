package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x;
		x = new Rectangle();
		
		System.out.print("Enter rectangle width and height:");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		double areaRectangle = x.area();
		double perimetroRectangle = x.Perimeter();
		double diagonalRectangle = x.Diagonal();
		
		System.out.printf("Area = %.2f%n", areaRectangle);
		
		System.out.printf("perimetro = %.2f%n ", perimetroRectangle );
		
		System.out.printf("diagonal = %.2f%n ",diagonalRectangle );
		
         sc.close();
	}

}
