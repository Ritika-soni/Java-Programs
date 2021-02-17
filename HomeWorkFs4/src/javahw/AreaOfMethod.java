package javahw;
import static java.lang.Math.sqrt;

public class AreaOfMethod {
	
	public void semicircle() {
		int r=3;
		double pi=3.14;
		
		double area= (pi*r*r)/2;
		
		System.out.println("Area of SemiCircle= "+area);
	}
	
	public void triangle() {
		int a=10;
		int b=12;
		int c=13;
		
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
				
		System.out.println("Area of Triangle= "+area);
	}
	
	public static void cone() {
		int r=5;
		int h=20;
		double pi=3.14;
		
		double volume =(pi*r*r*h)/3;
		
		System.out.println("Volume of Cone= "+volume);
	}
	
	public static void main(String[] args) {
		AreaOfMethod am = new AreaOfMethod();
		am.semicircle();
		am.triangle();
		cone();
	}

}
