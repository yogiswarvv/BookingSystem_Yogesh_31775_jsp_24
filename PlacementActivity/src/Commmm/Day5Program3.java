package Commmm;

import java.util.Scanner;

public class Day5Program3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sp=0;
		int star=6;
		for(int r=1;r<=n;r++)
		{
			if(r<=6)
			{
				for(int i=0;i<sp;i++)
				{
					System.out.print(" ");
				}
				for(int i=0;i<star;i++)
				{
					System.out.print((r+i)+" ");
				}
			}
			else
			{
				for(int i=0;i<sp;i++)
				{
					System.out.print(" ");
				}
				for(int i=star;i>0;i--)
				{
					System.out.print((7-i)+" ");
				}
			}
			System.out.println();
			if(r<((n+1)/2))
			{
				sp++;
				star--;
			}
			else
			{
				sp--;
				star++;
			}
		}
		
	}

}
