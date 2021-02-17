package javahw;
import java.util.Scanner;

public class Array3_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[][][]=new int[2][][];
		
		a[0]=new int[3][];
		a[1]=new int[2][];
		
		a[0][0]=new int[3];
		a[0][1]=new int[2];
		a[0][2]=new int[1];
		a[1][0]=new int[3];
		a[1][1]=new int[2];
		
		for(int i=0; i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				for(int k=0;k<=a[i][j].length-1;k++) {
					System.out.println("Enter the marks of school"+i+"class"+j+"students"+k);
					a[i][j][k]=sc.nextInt();
				}
			}
			
		}
		
		for(int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a[i].length-1; j++) {
				for(int k=0; k<=a[i][j].length-1; k++) {
					System.out.println("The marks of school"+i+"class"+j+"students"+k);
					System.out.println(a[i][j][k]);
				}
			}
			
		}
		
		
	}

}
