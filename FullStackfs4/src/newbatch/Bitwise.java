package newbatch;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;
		int b=15;
		int c;
		
		c=a&b;
		System.out.println("ans of and gate "+c);
		
		c=a|b;
		System.out.println("ans of or gate "+c);
		
		c=a^b;
		System.out.println("ans of xor gate "+c);
		
		c=b<<3;
		System.out.println("ans of left shift gate "+c);
		
		c=b>>5;
		System.out.println("ans of right shift gate "+c);
	}

}
