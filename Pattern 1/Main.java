import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n,i,j;
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
      int m = 2*n-1;
      for(i=1;i<=n;i++)
      {
      	for(j=1;j<=m;j++)
        {
        System.out.printf(j+" ");
       
        }
        System.out.println(" ");  m = m-2;
      }
	}
}