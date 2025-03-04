import java.util.*;
public class ArrayDecending
{
 public static void main(String x[])
 {
  Scanner m=new Scanner(System.in);
   int a[],b[],c[],i,j,temp,k=0;
    a=new int[3];
    b=new int[3];
    c=new int[6];
 
  System.out.println("Enter elements in first array:\n");
   for(i=0;i<a.length;i++)
    {
       a[i]=m.nextInt();
        //c[k]=a[i];
        //k++;
     }

  System.out.println("Enter elements in second array:\n");
   for(j=0;j<a.length;j++)
    {
       b[j]=m.nextInt();
       //c[k]=b[j];
        //k++;
     }
   
   for(i=0;i<a.length;i++)
     {
        c[k]=a[i];
         k++;
     
      }
    for(j=0;j<a.length;j++)
      {
         c[k]=b[j];
          k++;
    }

 System.out.println("After merging:");
 for(i=0;i<c.length;i++)
 {
    System.out.printf("%d\t",c[i]);
 }
 
  System.out.println("\nAfter decending order:");
   for(i=0;i<c.length;i++)
    {
       for(j=i+1;j<c.length;j++)
       {
         if(c[i]<c[j])
          {
           temp=c[i];
             c[i]=c[j];
             c[j]=temp;
      }
     }
    }
 
     for(i=0;i<c.length;i++)
      {
           System.out.printf("%d\t",c[i]);
       }
}
}
   
