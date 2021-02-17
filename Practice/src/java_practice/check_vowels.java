package java_practice;
import java.util.Scanner;

public class check_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				System.out.println("The string contains vowels:"+s1.charAt(i));
			}
		}
	}

}
