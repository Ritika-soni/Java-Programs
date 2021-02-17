package javahw;

public class String5 {

	public static void main(String[] args) {
		String s1="SAURAV";
		String s2="SACHIN";
		
		if(s1.compareTo(s2)>0)
			System.out.println("s1 is greater");
		
		else if(s1.compareTo(s2)<0)
			System.out.println("s2 is greater");
		
		else
			System.out.println("s1 & s2 are equal");
	}

}
