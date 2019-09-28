import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s  = new Scanner(System.in);
      int n,i,a=6;
      n = s.nextInt();
      //System.out.print(i);
      for(i=0;i<n;i++)
      {
      a = a+(5*i);
          System.out.print(a+" ");
      }
	}
}