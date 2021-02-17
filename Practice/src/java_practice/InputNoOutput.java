package java_practice;

class Calculator1 {
	int temp;
	void add(int a,int b) {
		temp=a+b;
		System.out.println(temp);
	}
}

public class InputNoOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 calc=new Calculator1();
		int x=10; 
		int y=20;
		calc.add(x, y);
	}

}
