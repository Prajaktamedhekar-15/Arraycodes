import java.util.*;

public class ArrayMissingEle
{
  public static void main(String x[])
  {
       Scanner m=new Scanner(System.in);
	   
	    int a[]=new int[7];
		 
		 System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++)
		{
		     a[i]=m.nextInt();
		}
		//sorting logic
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting:");
		
		for(int i=0;i<a.length;i++)
		{
		     System.out.println(a[i]+"\t");
			 
		}
		System.out.println("missing elements are:");
		int j;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(j=a[i]+1;j<a[i+1];j++)
			{
			    System.out.print(j+"\t");
		    }
		}
  }
}