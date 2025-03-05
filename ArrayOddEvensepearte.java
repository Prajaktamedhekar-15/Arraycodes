import java.util.*;
public class ArrayOddEvensepearte
{
   public static void main(String x[])
   {
    Scanner m=new Scanner(System.in);
     int a[]=new int[10];
     
     int i,j;
 
   System.out.println("Enter elements in array:");
   for(i=0;i<a.length;i++)
   {
     a[i]=m.nextInt();
    }
   

    //for even elements
    System.out.println("even Array:");
    for(i=0;i<a.length;i++)
    {
       if(a[i]%2==0)
       {
          System.out.printf("%d\t",a[i]);
        
        }
    }
     
    
    System.out.println("\n odd array:");
  
    for(j=0;j<a.length;j++)
    {
      if(a[j]%2!=0)
      {
        System.out.printf("%d\t",a[j]);
      }
    
  }

}
}