package ro.ase.acs;

public class Calculator {
	private enum Operations{ADD, SUBSTRACT, MULTIPLY, DIVIDE};
	
	private Calculator() {
		
	}
	
	public double calculate (double a, double b, int i) {
		switch(i) {
		case 1:
			return a+b;
		case 2:
			return a-b;
		default:
			return 0;
				
		}
	}
}
