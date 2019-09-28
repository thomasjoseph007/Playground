import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
      int n,i,j,p=1;
      n = s.nextInt();
      int a  = n;
      for(i=1;i<=n;i++)
      {
        
      for(j=p;j<2*a;j=j+2)
      {
      System.out.printf(j+" ");
      }p= p+2;
      // a = a-1;
        System.out.println("");
      }
	}
}