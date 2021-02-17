package java_practice;
import java.util.Scanner;

public class SwapWithoutVar {
	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Entered numbers are: "+a+b);
		
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("Swapped numbers are: "+a+b);
	}
}
