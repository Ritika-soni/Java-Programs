package java_practice;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,x;
		
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		
		System.out.println("before swapping: "+a+b);
		
		x=a;
		a=b;
		b=x;
		
		System.out.println("after swapping: "+a+b);
	}

}
