package NGenerator;

import java.util.Random;
public class NumberGenerator
{
	public static int Generator()
	{
		Random r=new Random();
		int a;
		a=r.nextInt(999);
		while(true)
		{
			if(zeros(a))
			{
				if(check(a))
				{
					break;
				}
			}
			a=r.nextInt(999);
		}
		//System.out.println(a);
		return a;
	}
	public static boolean zeros(int a)
	{
		if(a<=122)
		{
			return false;
		}
		int n=a;
		for(int i=0;i<2;i++)
		{
			if(n%10==0)
				return false;
			n=n/10;
			
		}
	
		
		return true;
		
	}
	public static boolean check(int a)
	{
		String s=Integer.toString(a);
		int n=s.length();
		char str[]=new char[5];
		for(int i=0;i<n;i++)
		{
			str[i]=s.charAt(i);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n&&j!=i;j++)
			{
				if(str[i]==str[j])
				{
					return false;
				}
			}
			
		}
		return true;
		
	}
	
}