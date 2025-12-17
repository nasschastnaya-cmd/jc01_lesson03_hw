package jc_les04.hw;

public class Task03 {

	public static void main(String[] args) {
		// Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). 
		//Найти его периметр и площадь.
		
		double x1 = 8;
		double y1 = 9;
		
		double x2 = 17;
		double y2 = 16;
		
		double x3 = 19;
		double y3 = 21;
		
		double a;
		double b;
		double c;
		
		double P;
		double S;
		
		a = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		b = Math.sqrt(Math.pow((x3 - x2),2) + Math.pow((y3 - y2),2));
		c = Math.sqrt(Math.pow((x1 - x3),2) + Math.pow((y1 - y3),2));
	
		P = a + b + c;
		S = Math.sqrt(P*(P-a)*(P-b)*(P-c));
		
		System.out.println("P = " + P);
		System.out.println("S = " + S);

	}

}
