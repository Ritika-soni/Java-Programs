package javahw;

public class String1 {

	public static void main(String[] args) {
		
		String s1="RAMA";
		String s2="RAMA";
		
		//for checking same data
		if(s1.equals(s2)==true)
			System.out.println("Strings are equal");
		else
			System.out.print("Strings are unequal");
		
		//for checking same address
		if(s1==s2)
			System.out.println("References are equal");
		else
			System.out.print("References are unequal");
		
	}

}
