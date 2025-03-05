import java.util.*;

public class ArrayOccur
{
   public static void main(String x[])
   {
      Scanner m=new Scanner(System.in);
	  
	  int a[]=new int[7];
	  
	  System.out.println("Enter array");
	   for(int i=0;i<a.length;i++)
	   {
	       a[i]=m.nextInt();
		 
		}
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
		
		int j;
		for(int i=0;i<a.length;i++) // 1 1 1 1 2 2 2 3 3 
		{
			int count=1;
			
			for( j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
                    count++;
                }
				else
				{
					break;
				}
			}
			System.out.println(a[i]+"----->"+count);
			i=j-1;  
		}
   }
}

			
				
		
		
		