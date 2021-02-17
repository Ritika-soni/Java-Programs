package newbatch;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		int r;
		
		System.out.println("enter the radius: ");
		
		Scanner dog=new Scanner(System.in);
		r=dog.nextInt();
		
		double ans=3.14*r*r;
		System.out.println("Answer: "+ans);
	}

}
