package java_practice;

public class Swapp {
	public static void swap(int x,int y) {
		y=x+y;
		x=y-x;
		y=y-x;
		System.out.println("Swapped no.s are"+x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("Entered no.s are"+a+b);
		swap(a,b);
	}

}
