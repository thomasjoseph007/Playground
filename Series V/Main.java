import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
      int n,i,z;int a = 11;
      n = s.nextInt();
      for(i=0;i<n;i++)
      {
        
     	 z = a*a;
     	a=a+4;
         System.out.printf(z+" ");
      }
	}
}