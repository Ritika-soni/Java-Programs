package java_practice;
import java.util.*;

public class FibonacciPlusPrime {
	
	void fibonacci(int n) {
		int a = 0, b = 1, next;
	    //the below code is for fibonacci series till nth position
	    for (int i = 1; i<=n; i++)
	    {
	        next = a + b;
	        a = b;
	        b = next;
	    }

	    //will print a not b or next as they are stored to calculate next  and next to next term
	    System.out.println(a);
	}
	
	void prime(int n) {
		 int i, j, flag, count =0;
		    //as prime numbers in given question start from 2
		    for (i=2; i<=n; i++)
		    {
		        flag = 0;
		        //to check if divisible apart from 1 & itself
		        //loop starts from 2 to ignore divisibilty by 1 & ends before the number itself
		        for (j=2; j<i; j++)
		        {
		            if(i%j == 0)
		            {
		                //number is not prime
		                flag = 1;
		                break;
		            }
		        }
		        //is prime
		        if (flag == 0){
		            //if found the nth prime number
		            if(++count == n)
		            {
		            	System.out.println(i);
		                break;
		            }
		        }
		    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the value for n: "+n);
		FibonacciPlusPrime fp=new FibonacciPlusPrime();
	   
	    
	    /*if n is odd
	        nth number in main series will be found at (n/2 + 1) position 
	        in fibonacci sub series
	    else 
	        if n is even then it will be found in (n/2) position in prime sub series */
	    
	    if(n%2 == 1) 
	        fp.fibonacci(n/2 + 1);
	    else 
	        fp.prime(n/2);
	}
}
