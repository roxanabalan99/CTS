package solid.v2;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		IOperationType add = new AddOperation();
		
		System.out.println(calc.Calculate(12, 21, add));
	}

}
