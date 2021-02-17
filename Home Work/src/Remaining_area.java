import static java.lang.Math.sqrt;
  
public class Remaining_area {

	public static void main(String[] args) {
		
		int s = 10;
		float ar_circle = 200;
		
		double r = Math.sqrt(((ar_circle)*7)/22);
		
		double ar_triangle = (Math.sqrt(3)/4)*s*s;
		
		double rem_area = ar_circle - ar_triangle;
		
		System.out.println(r);
		System.out.println(rem_area);
	}

}
