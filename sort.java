import java.io.*;
import java.util.*;
public class sort{
    public static void main(String args[])
    {
        String str;
        Scanner s=new Scanner(System.in);
        str=s.next();
        char p[]=str.toCharArray();
    ArrayList ts=new ArrayList();
    int a[]=new int[str.length()];
    for(int i=0;i<str.length();i++)
    {
      a[i]=Character.getNumericValue(p[i]);
       // System.out.println(a[i]);
        ts.add(a[i]);
        Collections.sort(ts);
    }
    Iterator it=ts.iterator();
    while(it.hasNext())
    {
    System.out.print(it.next());
    }
    
}}
