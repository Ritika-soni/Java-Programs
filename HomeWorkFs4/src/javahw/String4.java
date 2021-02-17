package javahw;

public class String4 {

	public static void main(String[] args) {
		
		String s1="RAMA";
		String s2="SITA";
		String s3=s1+s2;
		String s4=s1+s2;
		
		//for checking same data
		if(s3.equals(s4)==true)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are unequal");
		
		//for checking same address
		if(s3==s4)
			System.out.println("References are equal");
		else
			System.out.println("References are unequal");

	}

}