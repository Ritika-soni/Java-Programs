package javahw;

public class Immutable2 {

	public static void main(String[] args) {
		String s1="RajaRamMohanRoy";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("Raja"));
		System.out.println(s1.startsWith("Rani"));
		System.out.println(s1.endsWith("Roy"));
		System.out.println(s1.endsWith("Boy"));
		System.out.println(s1.contains("Mohan"));
		System.out.println(s1.contains("Sohan"));
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.length());
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4,7));
		
		//System.out.println(s1[5]);
		char[]a=s1.toCharArray();
		for(int i=0; i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
	}

}
