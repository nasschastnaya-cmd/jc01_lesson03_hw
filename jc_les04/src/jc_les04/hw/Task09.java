package jc_les04.hw;

public class Task09 {

	public static void main(String[] args) {
		// Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы
		//вписанной и описанной окружностей.
		
		double a = 9;
		double S;
		double Sr;
		double SR;
		
		S = (Math.pow(a, 2) * Math.sqrt(3))/4;
		
	    Sr = (Math.PI * Math.pow(a,2))/ 3;
	    SR = (Math.PI * Math.pow(a,2)) / 12;
	    
		
		System.out.println("S треугольника = " + S);
		System.out.println("S вписанной окр. = " + Sr);
		System.out.println("S описанной окр. = " + SR);

	}

}
