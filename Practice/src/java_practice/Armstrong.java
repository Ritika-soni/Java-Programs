package java_practice;
import java.util.Scanner;

public class Armstrong {
	public void Armstrong(){
		System.out.println("Enter  ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the no: "+n);
		int x=n;
		int r,sum=0;
		while(n!=0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==x) {
			System.out.println("Armstrong no. ");
		}
		else {
			System.out.println("Not an Armstrong no");
		}
	}

}
