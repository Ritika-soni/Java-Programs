package javahw;

public class ImmutableStrings {

	public static void main(String[] args) {
		String s1="SITA";
		System.out.println(s1);

		s1.concat("RAVANA");
		System.out.println(s1);
		
		String s2="GITA";
		System.out.println(s1.concat(s2));
	}

}
