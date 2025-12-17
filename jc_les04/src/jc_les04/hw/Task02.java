package jc_les04.hw;

public class Task02 {
	
	public static void main(String[] args) {
		
	// Вычислить расстояние между двумя точками 
	//с данными координатами (х1, у1)и (x2, у2).
		
		double x1;
		double y1;
		
		double x2;
		double y2;
		
	    double AB;
	    
	    x1 = 8;
	    y1 = 9;
	    
	    x2 = 16;
	    y2 = 17;
	    
	    AB = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
	    
	    System.out.println("Расстояние между точками = "+ AB);
	}

}
