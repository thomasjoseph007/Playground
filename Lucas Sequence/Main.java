import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a =0,b=0,c=1,i,n,d=0;
      Scanner s= new Scanner(System.in);
      System.out.print(a+" ");
      System.out.print(b+" ");
      System.out.print(c+" ");
     n = s.nextInt();
      for(i=3;i<n;i++)
      {  
        d =a + b + c;
         System.out.print(d+" ");
       	 a = b;
          b = c;
          c = d;
        
       
      }
    }
}