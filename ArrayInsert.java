import java.util.*;
public class ArrayInsert
{
 public static void main(String x[])
 {
  Scanner m=new Scanner(System.in);
   int a[],i;
   a=new int[6];
  
   System.out.println("Enter elements in array: ");
   for(i=0;i<a.length-1;i++)
    {
       a[i]=m.nextInt();
    }
  
   System.out.println("Enter the index:");
   int index=m.nextInt();
  
   System.out.println("Enter the value which inserting on that index:");
   int Ivalue=m.nextInt();

 
    System.out.println("After inserting value:");
    for(i=a.length-1;i>index;i--)
    {
   
        a[i]=a[i-1];
    }

     a[index]=Ivalue;

    for(i=0;i<a.length;i++)
    {
       System.out.print(a[i]+"\t");
   }
}
}
        