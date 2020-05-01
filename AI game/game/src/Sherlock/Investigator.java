package Sherlock;

public class Investigator 
{
	public static int h[][]=new int[3][8];
	public static int d[]=new int[20];
	public static int pr[]=new int[8];
	public static int thanos[]=new int[4];
	public static int i=0,j=0,k=0,count=0,ind=0,u=0;
	
	public static int storedetect(int a,int r)//hash table filler
	{
		
		switch(r)
		{
		case 0:h[r][++i]=a;count++;break;	
		case 1:h[r][++j]=a;count++;break;
		case 2:h[r][++k]=a;count++;break;
		
		}
		if(count<7)
		{
			//System.out.println("Count="+count);
			return 0;
		}
			
		else 
		{
			if(j==7)
				return 7;
			return optimizer();
		}
	}
	public static int optimizer()
	{
		for(int p=1;p<=i;p++)
		{
			Extract(h[0][p]);
		}
		int q=0;
		/*while(d[++q]!=0)
			System.out.print(d[q]+"  ");
		System.out.println();
		
		*/
		delete();
		/*System.out.println();
		for(int p=0;p<3;p++)
		{
			for(int m=0;m<4;m++)
			
				System.out.print(h[p][m]+" ");
				
			System.out.println();
		}*/
		
		if(q>0)
			return q;
		else	
		 return getConfirmedDigit();
	}
	public static void Extract(int b)
	{
		int z;
		/*if(d[1]==0)
			while(b!=0)
			{
				d[q++]=b%10;
				b=b/10;
			}*/
		while(b!=0)
		{
			z=b%10;
			/*if(Distinct(z))
			{
				d[q++]=z;
			}*/
			addtod(z);
			b=b/10;
		}
		
	}
	/*public static boolean Distinct(int z)
	{
		int q=1;
		while(d[q]!=0)
		{
			if(d[q]==z)
				return false;
			q++;
		}
		return true;
			
	}*/
	public static void delete()
	{
		int m;
		for(m=1;m<=j;m++)
		{
			h[1][m]=truncate(h[1][m]);
		}
		for(m=1;m<=k;m++)
		{
			h[2][m]=truncate(h[2][m]);
		}
	}
	public static int truncate(int t)
	{
		int m=0,sum=0,n;
		int tr[]=new int[4];
		while(t!=0)
		{
			tr[++m]=t%10;
			t=t/10;
		}
		for(m=1;m<=3;m++)
		{
			for(n=1;d[n]!=0;n++)
			{
				if(tr[m]==d[n])
					tr[m]=0;
			}
		}
		n=1;
		for(m=1;m<=3;m++)
		{
			if(tr[m]!=0)
			{
				sum=sum+(tr[m]*n);
				n=n*10;
			}
		}
		return sum;
	}
	public static void getperm(String ps,int start,int end)
	{
		if(start==end-1)
		{
			
			pr[++ind]=Integer.parseInt(ps);
			//System.out.println(pr[ind]+"  "+ind);
			
		}
		else
		{
			for(int m=start;m<end;m++)
			{
				ps=swap(ps,start,m);
				getperm(ps,start+1,end);
				ps=swap(ps,start,m);
			}
		}
			
		
	}
	public static String swap(String ps,int start,int end)
	{
		char[] ch=ps.toCharArray();
		char chr;
		chr=ch[start];
		ch[start]=ch[end];
		ch[end]=chr;
		return String.valueOf(ch);
		
	}
	public static int[] Permutation(int a)
	{
		getperm(Integer.toString(a),0,3);
		return pr;
	}
	public static int getConfirmedDigit()
	{
		int m,n;
		/*for(int p=0;p<3;p++)
		{
			for( m=0;m<=6;m++)
			
				System.out.print(h[p][m]+" ");
				
			System.out.println();
		}*/
		try{
		for(m=1;m<=j;m++)
		{
			if(h[1][m]>0)
				if(1==Integer.toString(h[1][m]).length())
				{
					addtothnos(h[1][m]);
					addtod(thanos[u]);
					destroy(thanos[u],1);
					delete();
					
				}
		}
		
		//for(int p=0;p<4;p++)
			//System.out.println(thanos[p]);
			
		for(n=1;n<=k;n++)
		{
			if(2==Integer.toString(h[2][n]).length())
			{
				addtothnos(Integer.toString(h[2][n]).charAt(0)-'0');
				addtod(thanos[u]);destroy(thanos[u],1);destroy(thanos[u],2);
				//addtothnos(Integer.toString(h[2][n]).charAt(1)-'0');
				//addtod(thanos[u]);		System.out.print(thanos[u]+"kk  "+u);destroy(thanos[u],j,k,1);destroy(thanos[u],j,k,2);
				delete();
			}
		}
		if(u>2)
		{
			int sum=0;
			n=100;
			//q=0;
			//while(d[++q]!=0)
			//	System.out.print(d[q]+"  ");
			//for(m=1;m<=z;m++)
			//System.out.print(thanos[m]+"  ");
			/*for(int p=0;p<3;p++)
			{
				for( m=0;m<4;m++)
				
					System.out.print(h[p][m]+" ");
					
				System.out.println();
			}*/
			for(m=1;m<=u;m++)
			{
				sum=sum+(thanos[m]*n);
				n=n/10;
			}
			return sum;
		}
		}
		catch(Exception e)
		{
			System.out.println("Sorry to say this that I won the match without your knowledge because of your erroneous responses");
			System.out.println("Failure is because of your negligence towards small things which your counterpart did to taste success");
			System.exit(0);
		}
		
		return getConfirmedDigit();
		
	}
	public static void destroy(int a,int c)
	{
		int m,n,q=1;
		while(d[q]!=0)
			q++;
		if(c==1)
		{	
		if(a<10)
		{
			for(m=1;m<=j;m++)
			{
				if(h[1][m]==a)
					h[1][m]=0;
				if(h[1][m]>10 & h[1][m]<100)
				{
					if((Integer.toString(h[1][m]).charAt(0)-'0')==a || (Integer.toString(h[1][m]).charAt(1)-'0')==a)
					{
						
						if((Integer.toString(h[1][m]).charAt(0)-'0')==a)
						{
							addtod((Integer.toString(h[1][m]).charAt(1))-'0');
						}
						else
						{
							addtod((Integer.toString(h[1][m]).charAt(0))-'0');
						}
						h[1][m]=0;
					}
				}
				if(3==Integer.toString(h[1][m]).length())
				{
					if((Integer.toString(h[1][m]).charAt(0)-'0')==a || (Integer.toString(h[1][m]).charAt(1)-'0')==a || (Integer.toString(h[1][m]).charAt(2)-'0')==a)
					{
						if((Integer.toString(h[1][m]).charAt(0)-'0')==a)
						{
							addtod(Integer.toString(h[1][m]).charAt(1)-'0');
							addtod(Integer.toString(h[1][m]).charAt(2)-'0');
							h[1][m]=0;
						}
						else if((Integer.toString(h[1][m]).charAt(1)-'0')==a)
						{
							addtod(Integer.toString(h[1][m]).charAt(0)-'0');
							addtod(Integer.toString(h[1][m]).charAt(2)-'0');
							h[1][m]=0;
						}
						else
						{
							addtod(Integer.toString(h[1][m]).charAt(0)-'0');
							addtod(Integer.toString(h[1][m]).charAt(1)-'0');
							h[1][m]=0;
						}
					}
					
				}
				
			}
			for(m=1;m<=k;m++)
			{
				
				if(h[2][m]>122)
				{
					if((Integer.toString(h[2][m]).charAt(0)-'0')==a || (Integer.toString(h[2][m]).charAt(1)-'0')==a || (Integer.toString(h[2][m]).charAt(2)-'0')==a)
					{
						n=1;
						while(true)
						{
							if(h[1][n]==0)
							{
								h[1][n]=truncate(h[2][m]);
								if(n>j)
									j++;
								break;
							}
							n++;
						}
						h[2][m]=0;
					}
				}
				
				else if(h[2][m]<100 & h[2][m]>0)
				{
					if((Integer.toString(h[2][m]).charAt(0)-'0')==a || (Integer.toString(h[2][m]).charAt(1)-'0')==a)
					{
						
						if((Integer.toString(h[2][m]).charAt(0)-'0')==a)
						{
							n=1;
							while(true)
							{
								if(h[1][n]==0)
								{
									h[1][n]=(Integer.toString(h[2][m]).charAt(1))-'0';
									if(n>j)
										j=j+1;
									break;
								}
								n++;
							}
							h[2][m]=0;
						}
						else
						{
							if((Integer.toString(h[2][m]).charAt(1)-'0')==a)
							{
								n=1;
								while(true)
								{
									if(h[1][n]==0)
									{
										h[1][n]=(Integer.toString(h[2][m]).charAt(0))-'0';
										if(n>j)
											j=j+1;
										break;
									}
									n++;
								}
								h[2][m]=0;
							}
							
						}
						
					}
				}
			}
			
		}
		}
		else
		{
			for(m=1;m<=j;m++)
			{
				if(h[1][m]>0)
				{
					if(2==Integer.toString(h[1][m]).length())
					{
						if((Integer.toString(h[1][m]).charAt(0)-'0')==a || (Integer.toString(h[1][m]).charAt(1)-'0')==a)
						{
							if((Integer.toString(h[1][m]).charAt(0)-'0')==a)
							{
								addtod(Integer.toString(h[1][m]).charAt(1)-'0');
								h[1][m]=0;
							}
							else
							{
								addtod(Integer.toString(h[1][m]).charAt(0)-'0');
								h[1][m]=0;
							}
						}
						
					}
					if(3==Integer.toString(h[1][m]).length())
					{
						if((Integer.toString(h[1][m]).charAt(0)-'0')==a || (Integer.toString(h[1][m]).charAt(1)-'0')==a || (Integer.toString(h[1][m]).charAt(2)-'0')==a)
						{
							if((Integer.toString(h[1][m]).charAt(0)-'0')==a)
							{
								addtod(Integer.toString(h[1][m]).charAt(1)-'0');
								addtod(Integer.toString(h[1][m]).charAt(2)-'0');
								h[1][m]=0;
							}
							else if((Integer.toString(h[1][m]).charAt(1)-'0')==a)
							{
								addtod(Integer.toString(h[1][m]).charAt(0)-'0');
								addtod(Integer.toString(h[1][m]).charAt(2)-'0');
								h[1][m]=0;
							}
							else
							{
								addtod(Integer.toString(h[1][m]).charAt(0)-'0');
								addtod(Integer.toString(h[1][m]).charAt(1)-'0');
								h[1][m]=0;
							}
						}
						
					}
				}
			}
		}
	}
	public static void addtod(int a)
	{
		int q=1;
		while(d[q]!=0)
		{
			if(d[q]==a)
				return;
			q++;
		}
		d[q]=a;
	}
	public static void addtothnos(int a)
	{
		int q=1;
		while(thanos[q]!=0)
		{
			if(thanos[q]==a)
				return;
			q++;
		}
		thanos[++u]=a;
	}
	
}
