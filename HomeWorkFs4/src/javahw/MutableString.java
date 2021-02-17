package javahw;

public class MutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		
		s1.append("sachin");
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		
		s1.append(" is a cricketer.");
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		
		s1.append("He is from India");
		System.out.println(s1.capacity());
		System.out.println(s1.length());
	}

}
