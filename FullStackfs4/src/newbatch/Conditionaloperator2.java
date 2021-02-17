package newbatch;
import java.util.Scanner;

public class Conditionaloperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		String status;
		System.out.println( "enter:0");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		status=(marks>=70 && marks<=40)?"good":"bad";
		System.out.println(status);
	}

}
