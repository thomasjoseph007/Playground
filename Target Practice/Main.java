import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int sum=0,f=1;
     do{
     int a=s.nextInt();
   
   

       sum=sum+a;
     
       if(sum>=n)
       {
         System.out.println("The number of turns is "+f);

       }
       else
       {
         f++;
       }    
 
     }while(sum<n);
       // fill the code;
   }
}