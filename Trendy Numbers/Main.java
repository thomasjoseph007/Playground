import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,q =0,a=0;
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
     a = (n /10)%10;
     //System.out.println(a);
      if(a/3==0)
        System.out.println("Not a Trendy Number");
      else
      
        System.out.println("Trendy Number");
 
    }
}