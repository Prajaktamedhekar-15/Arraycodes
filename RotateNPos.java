import java.util.*;

public class RotateNPos
{
  public static void main(String x[])
  {
    Scanner m=new Scanner(System.in);
	int a[]=new int[11];
	

	System.out.println("Enter elements:");
	for(int i=0;i<a.length;i++)
	{
	   a[i]=m.nextInt();
	}
	System.out.println("Enter the position want to reverse:");
	int ind=m.nextInt();

	int b[]=new int[a.length];
	int k=0;

	for(int i=ind;i<a.length;i++)
	{
		b[k]=a[i];
		k++;
	}
	for(int i=0;i<ind;i++)
	{
		b[k]=a[i];
		k++;
	}
	System.out.println("after rotating from "+ ind +" position the array is:");
	
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]+"\t");
	}
  }
}