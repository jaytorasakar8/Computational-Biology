package Assignment2;

import java.util.*;

public class Q8 {

	public static void main(String[] args)
        {
		
                Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of months n= ");
		int n = sc.nextInt();
		
		System.out.print(" Enter number of months they will live m = ");
		int m = sc.nextInt();
		
		/************
		 * Careful, here we have to use long instead of int;
		 */
		//2nd, calculate the rabbits left at nth month;
		long[] F = new long[n+1];
		long[] rabit = new long[m];
		rabit[0] = 1;
		F[1] = 1;
		
		for(int i=2; i<=n; i++)
                {	
			
			long[] next = new long[m];
			for(int j=1; j<m; j++){
				next[j] = rabit[j-1];
				next[0] += rabit[j];
			}
					
			for(int k=0; k<m; k++){
				rabit[k] = next[k];
				F[i] += rabit[k];
			}
			
			//System.out.print(" " +F[i]);
		}
		
		          System.out.println("\nAt "+n+"th month, there are rabbits = "+F[n]);
	}//end main();
}//end of everything in MortalFibonacciRabbits class;