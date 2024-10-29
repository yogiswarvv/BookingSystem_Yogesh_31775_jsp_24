package Com;

import java.util.Scanner;

public class Program3 {
	
	public static boolean isPrime(int n)
	{
		boolean isPrime=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter athe number");
		int n=s.nextInt();
		if(isPrime(n))
		{
			if(isPrime(reverse(n)))
			{
				System.out.println("Twisted");
			}
			else
			{
				System.out.println("Not twisted");
			}
			
		}
		else
		{
			System.out.println("Not twsited");
		}
	}
}
