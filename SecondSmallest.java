import java.util.*;

public class SecondSmallest
{
  public static void main(String x[])
  {
    Scanner m=new Scanner(System.in);
	int a[]=new int[5];
	
	System.out.println("Enter elements:");

	for(int i=0;i<a.length;i++)
	{
	   a[i]=m.nextInt();
	}
	
	int i,j;
   int  min=Integer.MAX_VALUE;
   int temp=Integer.MAX_VALUE;
  
        for(i=0;i<a.length;i++)
	    {
            for(j=i+1;j<a.length;j++)
      		{
                if(a[i]<min)
            	{
                	temp=min;
                 	min=a[i];
           		 }
				else if(a[i]<temp&&a[i]!=min)
		   		{
					temp=a[i];
				}
			}
  	   }
	   
	 System.out.println("second smallest:"+temp);
	   
    }
}