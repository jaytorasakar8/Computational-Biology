import java.util.*;

public class Solution
{
   public String solve(String s)
    {
        int [] array = new int[100];
        int c1=0,c2=0,c3=0,c4=0;
        
        for( int i=0;i<s.length();i++)
        {
        char a = s.charAt(i);    
        switch(a)
        {
            case 'A': c1++;break;
            case 'C': c2++;break;
            case 'G': c3++;break;
            case 'T': c4++;break;
            default: System.out.println("Some mistake");
        }
        }
        String s1;
        s1=c1+" "+c2+" "+c3+" "+c4;
       return s1;
       
    }
    
    
}