import java.util.*;
 public class ArrayDelete
 {
    public static void main(String x[])
     {
        Scanner m=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[a.length-1];
         int i,j=0;
         
      System.out.println("Enter the elements in array:\n");
      for(i=0;i<a.length;i++)
       {
         a[i]=m.nextInt();
       }
 
     
      System.out.println("Enter the position where to delete element:\n");
      int pos=m.nextInt();
   
      for(i=0;i<a.length;i++)
       {
           
           if(i!=pos)
           {
             b[j]=a[i];
              j++;
            }
        }
        System.out.println("After deleting ele:");
      
    for(i=0;i<b.length;i++)
    {
       System.out.printf("%d\t",b[i]);
    }
}
}