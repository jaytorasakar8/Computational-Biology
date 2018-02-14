package Assignment1;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Q4 
{
    String string;
    public static void main(String[] args) throws Exception
    {
       Scanner sc = new Scanner(System.in);
        String s;
  
        BufferedReader br= new BufferedReader(new FileReader("C:\\Biology\\a.txt"));
        String s1,s2;
        String fs ="";
        while((s = br.readLine())!= null)
        {
           fs = fs +s;
        }
     
      ArrayList<String> al = new ArrayList<String>();
      ArrayList<String> al1 = new ArrayList<String>();
      ArrayList<String> al2 = new ArrayList<String>();
        for (String t1 : fs.split(">"))
        {
            if(!(t1.equals(""))) //Since we are intializing the string fs with "" it is giving an extra array element - space.
            {
              al.add(t1);
            }
        }
        
        for( String x : al)
        {
            String x1 = x.substring(0,11);   //////////////////////////////////////////////////change here to 13
            al1.add(x1);
            String x2= x.substring(11);      ////////////////////////////////////////////////////////////change here to 13
            al2.add(x2);
            // System.out.println("x1: "+x1+ "  ---  x2:" +x2);
            
        }
        //Reading of input is completed here. 
        
        
        Q4 q = new Q4();
        
        for(int i=0;i<al2.size();i++)
        {
           for(int j=i+1;j<al2.size();j++)
            {
                 String temp1 = al2.get(i);
                 String temp2 = al2.get(j);
                 int result = q.overlap(temp1,temp2);
                
            }
        }
        
        
        
    }
    
    public int overlap(String s1,String s2)
    {
        for(int i=1; ;i++)
        {
            String subs1= s1.substring(s1.length()-i , s1.length());
            String subs2= s2.substring(0 , i);
                if(subs1.equals(subs2))
                {
                    
                }
        }
        
        return 1;
    }
}