
import java.util.*;
public class print_Array
{
  public static void main(String x[])
  {
	  Scanner m=new scanner(System.in);
	  
	  int a[]=new int[5];
	  
	  System.out.println("Enter ele");
	    for(int i=0;i<a.length;i++)
	   {
		    a[i]=m.nextInt();
	    }
		
		System.out.println("after printing:");
		  for(int i=0;i<a.length;i++)
	   {
		    System.out.println(a[i]+"\t");
	    }
  }
}