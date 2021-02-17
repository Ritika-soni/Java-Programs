package java_practice;

class Calculator2 {
	int a,b,c;
	int add() {
		a=10;
		b=20;
		c=a+b;
		return c;
	}
}

public class NoInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2 calc=new Calculator2();
		int res=calc.add();
		System.out.println(res);
	}

}
