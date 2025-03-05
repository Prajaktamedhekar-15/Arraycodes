import java.util.*;

public class ArrayMaxOrMin
{
  public static void main(String x[])
  {
     Scanner m=new Scanner(System.in);
	 int a[]=new int[5];
	 
	 //taking input from user

	 System.out.println("Enter array elements:");
	 for(int i=0;i<a.length;i++)
	 {
	    a[i]=m.nextInt();
	 }
	 int max=0;  // initial max values
	 
	 for(int i=0;i<a.length;i++)
	 {
		 if(max<a[i])
		 {
			 max=a[i];
		 }
	 }
	 System.out.println("Maximum value is:"+max);
	  
	  int min=a[0];  // initial min values
	  
	 for(int i=0;i<a.length;i++)
	 {
		 if(min>a[i])
		 {
			 min=a[i];
		 }
	 }
	 	System.out.println("Minimum value is:"+min);

	 
  }
}
	  