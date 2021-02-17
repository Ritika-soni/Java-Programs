package javahw;

public class String3 {

	public static void main(String[] args) {
		
		String s1="RAMA";
		String s2="rama";
		
		//for checking same data
		if(s1.equalsIgnoreCase(s2)==true)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are unequal");
		
		//for checking same address
		if(s1==s2)
			System.out.println("References are equal");
		else
			System.out.println("References are unequal");
	}

}
