package jc_les04.hw;

public class Task04 {

	public static void main(String[] args) {
		// Вычислить длину окружности и площадь круга одного и 
		//того же заданного радиуса R.
		
		double R = 10.0;
		
		double C;
		double S;
		
		C = 2 * Math.PI * R;
		S = Math.PI * Math.pow(R, 2);
		
		System.out.println("C = " + C);
		System.out.println("S = " + S);

	}

}
