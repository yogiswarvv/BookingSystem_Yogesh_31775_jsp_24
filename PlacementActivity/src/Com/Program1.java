package Com;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		int [] a=new int [size];
		System.out.println("Enter the elements one by one");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		int pos=0;
		int zero=0;
		int neg=0;
		
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				pos++;
			}
			else if(a[i]==0)
			{
				zero++;
			}
			else
			{
				neg++;
			}
		}
		
		if(pos==a.length)
		{
			int l=Integer.MAX_VALUE;
			int slno=0;
			while(true)
			{
				int ld=Integer.MIN_VALUE;
				for(int i =0;i<a.length;i++)
				{
					if(a[i]>ld && a[i]<l)
					{
						ld=a[i];
					}
				}
				l=ld;
				slno++;
				if(slno==2)
				{
					System.out.println("secong largert is"+l);
					break;
				}
			}
		}
		else if(zero!=0)
		{
			System.out.println("Array having zeros");
		}
		else if(neg!=0)
		{
			System.out.println("Array have negative values");
		}
	}

}
