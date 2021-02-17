package javahw;

public class String2 {

	public static void main(String[] args) {
		
		String s1=new String("RAMA");
		String s2=new String("RAMA");
		
		//for checking same data
		if(s1.equals(s2)==true)
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
