package javahw;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][];
		
		int m,n,o;
		System.out.println("Enter the no. of columns in first row: ");
		m=sc.nextInt();
		System.out.println("Enter the no. of columns in second row: ");
		n=sc.nextInt();
		System.out.println("Enter the no. of columns in third row: ");
		o=sc.nextInt();
		
		a[0]=new int[m];
		a[1]=new int[n];
		a[2]=new int[o];
		
		for(int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a[i].length-1; j++) {
				System.out.println("Enter the marks of class "+i+"students "+j);
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a[i].length-1; j++) {
				System.out.println("The marks of class "+i+"students "+j);
				System.out.println(a[i][j]);
			}
		}
	}

}
