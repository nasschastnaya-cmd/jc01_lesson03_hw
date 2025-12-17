package jc_les04.hw;

public class Task10 {

	public static void main(String[] args) {
		// Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
		
		double C = 18;
		
	    double S;
	    
	    S = Math.pow(C,2) / (4 * Math.PI);
	    
	    System.out.println("Площадь круга = " + S);

	}

}
