package Assignment1;

import java.util.*;
public class Q2 
{
    public static void main(String[] args)
    {
      long a,b,c,d,n;
      
     Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the protein string: ");
      String s = scanner.next();   
     
       long r=1;
      for(int i=0;i<s.length();i++)
      {
          char ch = s.charAt(i);
         
         if(ch =='F' || ch =='Y' || ch =='C' || ch =='Q' || ch =='H' || ch =='N' || ch =='K' || ch =='D' || ch =='E')
             r = r*2;
         
         if(ch =='I')
             r = r*3;
         
         if(ch == 'P' || ch =='T' || ch =='V' || ch =='A' ||  ch =='G' )
             r=r*4;
         
         if(ch == 'L' || ch =='S' || ch =='R' )
             r=r *6;
         
         else
            r = r*1;
            
         r = r %1000000;
      }
      long stop= 3;
      long result = (r*stop) %1000000 ;
      System.out.println(result);
    }
}