package java_practice;

class Calculator3 {
	int temp;
	int add(int a,int b) {
		temp=a+b;
		return temp;
	}
}

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator3 calc=new Calculator3();
		int x=10;
		int y=20;
		int res=calc.add(x,y);
		System.out.println(res);
	}

}
