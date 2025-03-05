import java.util.*;

public class ArrayReverse
{
   public static void main(String x[])
   {
      Scanner m=new Scanner(System.in);
	   int a[]=new int[5];
	   
	   System.out.println("Enter array elements:");
	   
	   for(int i=0;i<a.length;i++)
	   {
	      a[i]=m.nextInt();
		}
	 
	    int mid=a.length/2;
		int end=a.length-1;
		int temp;
		
		for(int i=0;i<mid;i++,end--)
		{
			temp=a[end];
			a[end]=a[i];
			a[i]=temp;
		}
		
		System.out.println("After reversing:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
   }
}

		
	    
		