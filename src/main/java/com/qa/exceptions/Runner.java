package com.qa.exceptions;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Maths math = new Maths();
		
		try {
			math.multi(5, 4);
		} catch (MultiplyByFiveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
