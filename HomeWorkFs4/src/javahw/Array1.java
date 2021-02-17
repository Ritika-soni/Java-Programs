package javahw;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		for(int i=0; i<=4; i++) {
			System.out.println("Enter the marks of the Student: ");
			a[i]=sc.nextInt();
		}
		
		System.out.println("The Entererd marks are: ");
		for(int i=0; i<=4; i++) {
			System.out.print(a[i] + "|");
		}
	}

}
