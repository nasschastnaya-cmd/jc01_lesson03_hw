package jc_les04.hw;

public class Task01 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double S;
		double P;
		
		a = 4.0;
		b = 6.0;
		c = Math.sqrt(Math.pow(a,2) * Math.pow(b,2));
		S = (a * b)/2;
		P = a + b + c;
		
		System.out.println("Площадь треугольнака = " + S);
		System.out.println("Перимерт треугольника = " + P);
		
	}

}
