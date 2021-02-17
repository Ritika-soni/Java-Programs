package java_practice;
class Calculate {
	float add(int a, float b) {
		return a+b;
	}
//	float add(float a, int b) {       //will generate ambigious method
//		return a+b;
//	}
	double add(int a, float b, double c) {
		return a+b+c;
	}
}

public class OverloadingNumericPromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate calc=new Calculate();
		System.out.println(calc.add(10,20));
	}

}
