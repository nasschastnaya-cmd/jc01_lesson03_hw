package jc_les04.hw;

public class Task08 {

	public static void main(String[] args) {
		// Дана длина ребра куба. 
		//Найти площадь грани, площадь полной поверхности и объем этого куба.
		
		double a = 5;
		double S;
		double allS;
		double V;
		
		S = a * a;
		allS = 6 * Math.pow(a, 2);
		V = Math.pow(a, 3);
		
		System.out.println("S грани = " + S);
		System.out.println("S полной поверхности = " + allS);
		System.out.println("V = " + V);
	}

}
