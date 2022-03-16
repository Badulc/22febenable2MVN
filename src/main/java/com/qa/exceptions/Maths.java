package com.qa.exceptions;

public class Maths {
	
	public void multi(int a,int b) throws MultiplyByFiveException {
		int result;
		//return;
		
		
		if (a==5 || b ==5) {
			throw new MultiplyByFiveException("exception msg");
		}
		
		result = a*b;
		
		System.out.println(result);
	}
	
	public void div(double a,double b) throws DivException {
		int result;
		//return;
		
		
		if (a==5 || b ==5) {
			throw new DivException("exception msg");
		}
		
		result = double (a/b);
		
		System.out.println(result);
	}

//	public void multi(int a, int b) {
//		// TODO Auto-generated method stub
//		
//	}
	
	

}
