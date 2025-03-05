import java.util.*;
public class ArrayTargetelement{
  public static void main(String x[]){
     
   Scanner m=new Scanner(System.in);
     int a[],i,tvalue;
     a=new int[6];
    
  boolean flag=false;
    
     System.out.printf("Enter the target value:\n");
      tvalue=m.nextInt();

      System.out.printf("Enter the elements in array:");
    
      for(i=0;i<a.length;i++)
       {
          a[i]=m.nextInt();
       }
         
       for(i=0;i<a.length-1;i++)
      {
         for(int j=i+1;j<a.length;j++)
         {
              if(a[i]+a[j]==tvalue)
             {
                     flag=true;
                         

       System.out.println("Index that gives elements equal to taget-->"+i+" and "+j);
              }
         }
     }
 

        if(!flag)
          {
             System.out.println("no found");
          }
}
}
       
      
 
    
    
  