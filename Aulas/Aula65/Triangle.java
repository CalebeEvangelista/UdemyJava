package Aulas.Aula65;

public class Triangle {

	public double a;
	public double b;
	public double c; 
	
	public double getArea() {
		double p = (this.a + this.b + this.c) / 2.0;
		double areaX = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
		return areaX;
		
	}
}
