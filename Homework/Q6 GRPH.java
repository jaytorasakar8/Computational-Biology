package Assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class Q6 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the string: ");
        String s,fs="";
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> al1 = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<String>();
 
        Map<String,String> p = new HashMap<String,String>();
        
        BufferedReader br= new BufferedReader(new FileReader("C:\\Biology\\rosalind_grph.txt"));
        String s1[] = new String[300];
        String s2[] = new String[300];
        
          for(int i=0;(s = br.readLine())!= null;i++)
        {
          al.add(s);
        }
          int k=0,l=0;
          for(int i=0;i<al.size();i=i+2)
          {
             String temp =  al.get(i).toString(); 
             temp = temp.substring(1);
             al1.add(temp);
              
             /*s1[k] = temp;
              System.out.println(s1[k]);
              k++;*/
          }
         //System.out.println(al1);
        
          for(int i=1;i< al.size() ;i=i+2)
          {
              String temp= al.get(i).toString();
              al2.add(temp);
             /* s2[l] = temp;
              System.out.println(s2[l]);
              l++;*/
          }
       // System.out.println(al2);
        
        Set<String> set = new HashSet<String>();
      
        for(int i=0;i<al2.size();i++)
        {
            for(int j=i+1;j<al2.size();j++)
            {
                String temp1= al2.get(i).toString();
                String temp2 = al2.get(j).toString();
                
                /*char[] ch1= temp1.toCharArray();
                char[] ch2= temp2.toCharArray();
                */
                /*for(int x=0;x<ch1.length;x++)
                {
                    for(int y=0;y<ch2.length;y++)
                    {
                        
                    }
                }*/
                
                for(int x=0;x<temp1.length() && ((x+3)< temp1.length());x=x+3)
                {
                    String subs1=temp1.substring(x, x+3);
                    for(int y=temp2.length();y>0  && ((y-3)> 0) ;y=y-3)
                    {
                        String subs2 = temp2.substring(y-3,y);
                        if(subs1.equals(subs2))
                        {
                             set.add(al1.get(i) +" "+ al1.get(j));
                            //System.out.println( al1.get(i) +" "+ al1.get(j));
                            break;
                        }
                    }
                   
                }
                
                  for(int x=temp1.length();x>0 && ((x-3)>0);x=x-3)
                {
                    String subs1=temp1.substring(x-3, x);
                    for(int y=0;y <temp2.length()  && ((y+3) <temp2.length()) ;y=y+3)
                    {
                        String subs2 = temp2.substring(y,y+3);
                        if(subs1.equals(subs2))
                        {
                            set.add(al1.get(i) +" "+ al1.get(j));
                           // System.out.println( al1.get(i) +" "+ al1.get(j));
                            break;
                        }
                    }
                   
                }
                  
                  
                
                
                
                
                
            }
        }
        
        for (String str : set)
        {
          System.out.println(str);
         }
         
         
          
         
        
    }
}