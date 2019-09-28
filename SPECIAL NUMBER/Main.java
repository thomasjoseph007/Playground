import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner ss = new Scanner(System.in);
      int n,a=0,b=0,p=0,s=0,i,z;
      n = ss.nextInt();
      z = ss.nextInt();
      for(i=n;i<=z;i++)
      {
      a = i % 10;
      b = i /10; 
        p =(a * b)+( a + b);
    
        if(p==i) 
          System.out.println(i);
      }
    
       
    }
}