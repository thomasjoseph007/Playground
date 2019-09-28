import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int b=a*a;
     int r=0,c=10,q=0,l=10,f=0;
    do{
       r=b%c;
       q=b/l;
      c=c*10;
      l=l*10;
       if((r+q)==a)
       {
         f=1;
       }
    }while(q>0);
      if(f==1)
       System.out.println("Kaprekar Number");
     else
       System.out.println("Not A Kaprekar Number");
       // fill your code;
       
   }
}