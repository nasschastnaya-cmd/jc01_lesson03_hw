package jc_les04.hw;

public class Task06 {

	public static void main(String[] args) {
		// Найти произведение цифр заданного четырехзначного числа.
		
		int number = 1234;
		int result;
		
		if (number >= 1000 && number <= 9999) {
			
		   int first = number / 1000;
		   int second = (number % 1000) / 100;
		   int three = (number % 100) / 10;
		   int four = (number % 10);
		   
		   result = first * second * three * four;
		   
		   System.out.println("Result = " + result);
		} else {
			System.out.println("Задано не четырехзначное число");
	  
		}

	}

}
