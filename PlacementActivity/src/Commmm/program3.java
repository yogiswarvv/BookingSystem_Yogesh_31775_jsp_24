package Commmm;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int bin=0;
		int b=1;
		while(n>0)
		{
			int d=n%2;
			bin = bin+b*d;
			b=b*10;
			n/=2;
		}
		
		int temp=bin;
		int count=0;
		while(temp>0)
		{
			int d=temp%10;
			if(d==1)
			{
				count++;
			}
			temp/=10;
		}
		if(count%2==0)
		{
			System.out.println("Binary equivalen: "+bin);
			System.out.println("Number of 1's: "+count);
			System.out.println("It is an Evil Number");
		}
		else
		{
			System.out.println("Binary equivalen: "+bin);
			System.out.println("Number of 1's: "+count);
			System.out.println("It is not an Evil Number");
		}
	}

}
