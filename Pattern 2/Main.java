import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
      	int n,i,j,f=0;
      n = s.nextInt();
      for(i=1;i<=n;i++)
      {
      for(j=1;j<=i;j++)
      {  
      if(f==0)
            {
               System.out.printf(0+" ");
        f=1;
            }
            else{
                System.out.printf(1+" ");
              f=0;
            }
      }  System.out.printf("\n");
      }
	}
}