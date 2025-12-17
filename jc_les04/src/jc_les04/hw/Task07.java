package jc_les04.hw;

public class Task07 {

	public static void main(String[] args) {
		// Даны два числа. Найти среднее арифметическое кубов этих чисел и 
		//среднее геометрическое модулей этих чисел.

		double n = 7;
		double m = 9;
		
		double srArithmCubs;
		double srGeomModul;
		
		srArithmCubs = (Math.pow(n,3) + Math.pow(m,3))/2;
		srGeomModul = Math.sqrt((Math.abs(n) * Math.abs(m)));
		
		System.out.println("Среднее арифметическое кубов = " + srArithmCubs);
		System.out.println("Среднее геометрическое модулей = " + srGeomModul);
		
		
		
		
		
	}

}
