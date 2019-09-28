import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s  = new Scanner(System.in);
      int n,i,a=3;
      n = s.nextInt();
    System.out.print(a+" ");
      for(i=1;i<n;i++)
      {
      a = a*3;
          System.out.print(+a+" ");
      }
	}
}