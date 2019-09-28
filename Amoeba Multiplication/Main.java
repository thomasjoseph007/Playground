import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3=0,i,n;
      Scanner s =new Scanner(System.in);
      n = s.nextInt();
      for(i=2;i<n;i++)
      {
        n3 = n1+n2;
        n1= n2;
          n2 = n3;
      }
      System.out.println(n3);
    }
}