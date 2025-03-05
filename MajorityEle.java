import java.util.*;

public class MajorityEle
{
  public static void main(String x[])
  {
    Scanner m=new Scanner(System.in);
	int a[]=new int[8];
	
	 System.out.println("Enter array elements:");
	 for(int i=0;i<a.length;i++)
	 {
	    a[i]=m.nextInt();
	 }
	 int b=0,c=0;
	 
	 for(int i=0;i<a.length;i++)
	 {
       //c=0;
	   for(int j=i+1;j<a.length;j++)
	   {
	        if(a[i]==a[j])
			{
			  c++;
			  b=a[i];
			}
	    }
	 }
	  if(c>(a.length-1)/2)
	  {
            System.out.println(" majority element in array is:"+b);
	  }
       else
	   {
            System.out.println(" There is no majority elementin array");
	   }
	 
  }
}  
	 
	  
			   