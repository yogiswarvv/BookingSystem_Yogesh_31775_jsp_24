package Commmm;

import java.util.Scanner;

public class Day5Program1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int [] a=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int temp=size;
		int j=0;
		int k=0;
		int [] b=new int[size];
		while(temp>0)
		{
			int pro=1;
			for(int i=0;i<a.length;i++)
			{
				if(i!=j)
				{
					pro=pro*a[i];
				}
			}
			b[k++]=pro;
			temp--;
			j++;
		}
		System.out.print("{ ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.print(" }");
	}
	
	

}
