package solid.v2;

public class Calculator {
	//private enum Operations{ADD, SUBSTRACT, MULTIPLY, DIVIDE};
	
	//private Calculator() {
		
	//}
	/*
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
	*/
	
	public double Calculate (double a, double b, IOperationType op) {
		return op.Calculate(a, b);
	}
}
