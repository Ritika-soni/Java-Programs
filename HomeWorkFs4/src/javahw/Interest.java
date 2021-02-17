package javahw;

public class Interest {
	
	public void simple_interest() {
		double p=20000;
		double r=10;
		double t=5;
		
		double si=(p*r*t)/100;
		
		System.out.println("Simple Interest: "+si);
	}
	
	public static void compound_interest() {
		double p=20000;
		double r=10;
		double n=5;
		
		double a= p*Math.pow((1+(r/100)),n);
		double ci= a-p;
		
		System.out.println("Compound Interest: "+ci);
	}

	public static void main(String[] args) {
		Interest it = new Interest();
		
		it.simple_interest();
		compound_interest();
	}

}