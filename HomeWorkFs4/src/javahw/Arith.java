package javahw;
import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {
		int x,y;
		double z,m;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of x: ");
		x=sc.nextInt();
		
		System.out.println("Enter the value of y: ");
		y=sc.nextInt();
		
		z=(x*x)+(y*y)+(2*x*y);
		System.out.println("Z: "+z);
		
		m=(((x*x)+(y*y))/(z-10));
		System.out.println("M: "+m);
	}

}
