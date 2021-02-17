package newbatch;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=90;
		int b=60;
		int c=a+b;
		int d=50;
		
		System.out.println(c);
		//a+=b+c;(for 3 variables)
		a+=b+=c+=d;
		a+=b;//a=a+b;
		System.out.println(a);
		
		a-=b;
		System.out.println(a);
		
		a*=b;
		System.out.println(a);
	}

}
