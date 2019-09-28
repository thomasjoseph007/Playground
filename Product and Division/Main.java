import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int a,b,c,d,e;
      Scanner s = new Scanner(System.in);
      a = s.nextInt();
      b = s.nextInt();
      c = a * b;
      d = a/b;
      e = a % b;
       System.out.println(c);
       System.out.println(d);
       System.out.println(e);
    }
}