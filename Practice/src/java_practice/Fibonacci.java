package java_practice;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the number: "+n);
		int i=0;
		int j=1;
		System.out.print(i+" "+j);
		for(int a=0;a<n-2;a++) {
			int sum=i+j;
			System.out.print(" "+sum);
			j=sum;
			i=j;
		}
	}

}
