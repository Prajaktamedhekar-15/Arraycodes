import java.util.*;
public class ArrayAscending
{
  public static void main(String x[])
  {
    Scanner m=new Scanner(System.in);
    int a[],i,j,temp;
    a=new int[5];
   
 
    System.out.println("Enter the elements:\n");
    for(i=0;i<a.length;i++)
   {
     a[i]=m.nextInt();
   }
  
    System.out.println("Before Ascending order:");
  
    for(i=0;i<a.length;i++)
   {
    System.out.printf("%d",a[i]);
    }
   
  System.out.println("\nAfter Ascending order:");
  
    
    for(i=0;i<a.length;i++)
   {
        for(j=i+1;j<a.length;j++)
       {
             if(a[i]>a[j])
             {
              temp=a[i];
              a[i]=a[j];
               a[j]=temp;
              }
          }
  }
 
    for(i=0;i<a.length;i++)
    {
    System.out.printf("%d",a[i]);
    }
}
}
  


    