package Aula65;

import java.util.Scanner;

public class Index {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.getArea();
		System.out.println(areaX);
		
		double areaY = y.getArea();
		System.out.println(areaY);
		
		sc.close();
	} 

}
