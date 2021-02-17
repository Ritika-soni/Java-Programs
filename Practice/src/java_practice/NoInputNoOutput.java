package java_practice;

class Calculator {
	int a,b,c;
	void add() {
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
}

public class NoInputNoOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		calc.add();
	}

}
