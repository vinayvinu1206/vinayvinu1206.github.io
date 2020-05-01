package Responser;

public class Accept 
{
	public static void Response(int a,int b)
	{
		String sn,un;
		sn=Integer.toString(a);
		un=Integer.toString(b);
		char aa[]=new char [5];
		int n,count=0;
		n=un.length();
		for(int i=0;i<n;i++)
		{
			aa[i]=un.charAt(i);
		}
		for(int i=0;i<n;i++)
		{
			char p=sn.charAt(i);
			for(int x:aa)
			{
				if(p==x)
				{
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("NULL");
		}
		else if(count==1)
		{
			System.out.println("GALLUS");
		}
		else if(count==2)
		{
			System.out.println("TAURUS");
		}
		else if(count==3)
		{
			System.out.println("GALLUS AND TAURUS");
		}
		
		return;
	}
}
