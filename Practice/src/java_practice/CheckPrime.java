package java_practice;
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=true;
		
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Prime number: "+n);
		}
		else{
			System.out.println("Not a Prime number: "+n);
		}
	}

}
