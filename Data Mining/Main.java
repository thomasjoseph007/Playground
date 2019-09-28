import java.util.*; 
class Main { 
	public static void main(String args[]) 
	{ 
		int n ; 
		int sumOdd = 0, sumEven = 0, c = 1; 
Scanner s = new Scanner(System.in);
      n = s.nextInt();
		while (n != 0) { 

			if (c % 2 == 0) 
				sumEven += n % 10; 
			else
				sumOdd += n % 10; 
			n /= 10; 
			c++; 
		}
      if(sumOdd == sumEven)
		System.out.println("Yes" );
      else
		System.out.println("No"); 
	} 
} 

