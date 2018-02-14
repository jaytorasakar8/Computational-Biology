package Assignment1;
import java.util.*;

public class Q3
{
    public static void main(String[] args) 
    {
        Map<String,String> p = new HashMap<String,String>();
        p.put ("UUU", "F");
        p.put ("UUC", "F");
        p.put ("UUA", "L");
        p.put ("UUG", "L");
        p.put ("UCU", "S");
        p.put ("UCC", "S");
        p.put ("UCA", "S");
        p.put ("UCG", "S");
        p.put ("UAU", "Y");
        p.put ("UAC", "Y");
        p.put ("UGU", "C");
        p.put ("UGC", "C");
        p.put ("UGG", "W");
        
        p.put ("CUU", "L");
        p.put ("CUC", "L");
        p.put ("CUA", "L");
        p.put ("CUG", "L");
        p.put ("CCU", "P");
        p.put ("CCC", "P");
        p.put ("CCA", "P");
        p.put ("CCG", "P");
        p.put ("CAU", "H");
        p.put ("CAC", "H");
        p.put ("CAA", "Q");
        p.put ("CAG", "Q");
        p.put ("CGU", "R");
        p.put ("CGC", "R");
        p.put ("CGA", "R");
        p.put ("CGG", "R");
        
        p.put ("AUU", "I");
        p.put ("AUC", "I");
        p.put ("AUA", "I");
        p.put ("AUG", "M");
        p.put ("ACU", "T");
        p.put ("ACC", "T");
        p.put ("ACA", "T");
        p.put ("ACG", "T");
        p.put ("AAU", "N");
        p.put ("AAC", "N");
        p.put ("AAA", "K");
        p.put ("AAG", "K");
        p.put ("AGU", "S");
        p.put ("AGC", "S");
        p.put ("AGA", "R");
        p.put ("AGG", "R");
        
        p.put ("GUU", "V");
        p.put ("GUC", "V");
        p.put ("GUA", "V");
        p.put ("GUG", "V");
        p.put ("GCU", "A");
        p.put ("GCC", "A");
        p.put ("GCA", "A");
        p.put ("GCG", "A");
        p.put ("GAU", "D");
        p.put ("GAC", "D");
        p.put ("GAA", "E");
        p.put ("GAG", "E");
        p.put ("GGU", "G");
        p.put ("GGC", "G");
        p.put ("GGA", "G");
        p.put ("GGG", "G");
        
        p.put("UAA", "0");
        p.put("UAG", "0");
        p.put("UGA", "0");
        
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter the DNA string : ");
       String s = sc.next();
       String s1,ns1="";
        /*System.out.println("Enter the String 1: ");
        String s1=sc.next();
        
        System.out.println("Enter the String 2");
        String s2=sc.next();
        */
        System.out.println("Enter the number of introns:");
        int introns= sc.nextInt();
        
        for(int i=1;i<=introns;i++)
        {
            System.out.println("Enter the intron "+i+":");
            s1=sc.next();
            s=s.replaceAll(s1, "");
        }
        
        //int i1= s.indexOf(s1);
       /*while (i1 >= 0) 
       {  
          i1 = s.indexOf(s2, i1 + 1);
          s= s.replace(s1, "");
        }*/
       /*
       String ns1= s.replaceAll(s1, "");
       String ns2= ns1.replaceAll(s2, "");
       
       ns2= ns2.replaceAll("T", "U"); //making the dna into an rna
        System.out.println(ns2);
       */
        String ns2 = s.replaceAll("T", "U");//making the dna into an rna
        String result="";
        char c[]= ns2.toCharArray();
       
        
        for(int i=0;i<ns2.length() &&((i+3)<ns2.length());i=i+3)
        {
           String temp = "" +c[i]+c[i+1]+c[i+2];
           for(String key: p.keySet())
           {
               if(key.equals(temp))
                   result=result +  p.get(key);
           }
            
        }
        
        System.out.println(result);
       
        
          
    }
    
}