package java_practice;

class Calculator4 {
	int add(int a, int b) {
		
		return a+b;
	}
	float add(int a, float b) {
		System.out.println("hello");
		return a+b;
	}
	float add(float a, float b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	double add(int a, float b, double c) {
		return a+b+c;
	}
	double add(float a, float b, float c) {
		return a+b+c;
	}
	float add(int a, int b, float c) {
		return a+b+c;
	}
	double add(double a, double b, double c) {
		return a+b+c;
	}
	float add(float a, int b) {
		System.out.println("hi 2");
		return a+b;
	}
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20, c=30;
		float m=10.5f, n=20.5f, o=30.5f;
		double x=10.55, y=20.55, z=30.55;
		
		Calculator4 calc=new Calculator4();
		System.out.println(calc.add(a, b));
		System.out.println(calc.add(a, m));
		System.out.println(calc.add(a, m, x));
	}

}
