package Commmm;

import java.util.Scanner;

public class Program2 {
	public static boolean isPos(int [] a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				count++;
			}
		}
		if(count==a.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isNeg(int [] b)
	{
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]<0)
			{
				count++;
			}
		}
		if(count!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isZero(int [] a)
	{
		int count=0;
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				count++;
			}
		}
		if(count==a.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		int[] b=new int[size];
		
		System.out.println("Enter the 1st array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the 2st array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		if(isZero(a) || isZero(b))
		{
			System.out.println("{ Array contains Zero Elements }");
		}
		else if(isNeg(a) || isNeg(b))
		{
			int c1=0;
			int c2=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<0)
				{
					c1++;
				}
				if(b[i]<0)
				{
					c2++;
				}
			}
			
			int [] c=new int[c1+c2];
			int k=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<0)
				{
					c[k++]=a[i];
				}
			}
			for(int i=0;i<b.length;i++)
			{
				if(b[i]<0)
				{
					c[k++]=b[i];
				}
			}
			System.out.print("[ ");
			System.out.print("{");
			for(int i=0;i<c.length;i++)
			{
				System.out.print(c[i]);
			}
			System.out.print("}");
			System.out.println(" ]");
		}
		else if (isPos(a) || isPos(b)) {
		    int[] d = new int[a.length + b.length];
		    int k = 0;
		    for (int i = 0; i < a.length; i++) {
		        d[k++] = a[i];
		    }
		    for (int i = 0; i < b.length; i++) {
		        d[k++] = b[i];
		    }
		    System.out.print("[ ");
		    for (int i = 0; i < d.length; i++) {
		        System.out.print(d[i] + " ");
		    }
		    System.out.println("]");
		}

		
		
		
		
		
		
		}

}
