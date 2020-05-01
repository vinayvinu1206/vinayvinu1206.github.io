package game;
import java.util.*;
import NGenerator.*;
import Sherlock.*;
import Responser.*;
import Winners.*;

public class GamePlay 
{
	static int i=0,k=0,x=0,e=0,sn,un,cr=0,y=0;
	static int a[]=new int [10];
	static int ag[]={0,156,237,489,00,00,00};
	static NumberGenerator ng=new NumberGenerator();
	static Investigator inv=new Investigator();
	static Accept acc=new Accept();
	static missionaccomplished mi =new missionaccomplished();
	static Scanner in=new Scanner(System.in);
	static int fr[]=new int[8];
	static String rp;
	
	
	public static void Instruction()
	{
		System.out.println("Read the instructions carefully!!!");
		System.out.println("-------------------------------------------------------------"); 
		System.out.println("1.While keeping the number,\n\ta)Don't keep a number having repeated digits.\n\tb)Don't think of Aryabhata's digit while keeping your secret code.");
		System.out.println("2.While playing with me, if you don't respond properly, you're busted!");
		System.out.println("3.Each one get a chance alternatively to guess their opponent's number,so be patient!!!" );
		System.out.println("4.If one digit match say GALLUS."); System.out.println("5.If two digits match say TAURUS.");
		System.out.println("6.If all the 3 digits are matched, say gallus_and_taurus");
		System.out.println("7.If I'm the winner,type win/won or anything with win!!!"); 
		System.out.println("8.The last most important point is,\n\tIf you've found my number,Don't overact and cause noise pollution.");
		System.out.println("ALL THE BEST"); 
		System.out.println("Shall we start the game........?[y/n]"); 
		String c=in.next(); 
		if(c.equals("n"))
			System.exit(0);
		else{ 
			try{ Thread.sleep(5000); 
			System.out.println("THE GAME BEGINS IN...");
			Thread.sleep(1000);
			System.out.println("3");
			Thread.sleep(1000); 
			System.out.println("2"); 
			Thread.sleep(1000); 
			System.out.println("1"); 
			Thread.sleep(1000);
			}
		catch(Exception e){} } 

	}
	public static void Trashtalk()
	{
		Random r=new Random();
		Scanner scan=new Scanner(System.in);
		String ans; 
		int t=r.nextInt(10);
		switch(t) 
		{ 
		case 10 :System.out.println("That was some serious potato aim.Get wrecked");break;
		case 9:System.out.println("You are not the only one cursed with knowledge!");break;
		case 7 :System.out.println("I'm just seeing who's gonna finish second");break;
		case 6:System.out.println("Don't touch me,I'll beat your brains out.");break;
		case 5 :System.out.println("Get your popcorn ready because i'm gonna put on a show");break;
		case 4 :System.out.println("You think season is over?");break;
		default : return;
		} 
		return; 
	}	
	public static void main(String[] args) 
	{
		
		
		Instruction();
		
		sn=ng.Generator();
		randomizer();
		while(true)
		{
			if(cr==0)
			ComputerEnd();
			else if(cr==2)
				allgs();
			else
				FinalDestination();
			Trashtalk();
			Userend();
		}
		
	

	}	
	public static void ComputerEnd()
	{
		if(k==0)
		{
			x=0;		
			System.out.println("Is your number, " + a[++i]);
			rp=in.next();
			int j=reval(rp);
			switch(j)
			{
			case 0:x=inv.storedetect(a[i],j);break;
			case 1:x=inv.storedetect(a[i],j);break;
			case 2:x=inv.storedetect(a[i],j);break;
			case 3:getfr(a[i]);cr=1;e=1;
			}
			if(x==7)
			{
				allgs();
				return;
			}
			if(x>0)
			{
				k=x;
				getfr(x);
			}
		}
		else
				FinalDestination();
	
		return;
	}
	public static int reval(String rm)
	{
		if(rm.length()>10)
			return 3;
		if(rm.charAt(0)=='G' || rm.charAt(0)=='g')
			return 1;
		if(rm.charAt(0)=='T'|| rm.charAt(0)=='t')
			return 2;
		if(rm.charAt(0)=='N'|| rm.charAt(0)=='n')
			return 0;
		if(rm.equals("won") || rm.equals("win"))
		{
			mi.CWinner(sn);
			return(1);
		}
		else
		{
			System.out.println("Where are you lost?");
			System.out.println("Re-enter your response properly!!");
			String s=in.next();
			return reval(s);
		}
	}
	public static void getfr(int z)
	{
		cr=1;
		fr=inv.Permutation(z);
		return;
	}
	public static void FinalDestination()
	{		
		int y;
		String r;
		
		System.out.println("Is your number, "+fr[++e]);
		
		r=in.next();
		A : while(true)
		{
			//y=reval(r);
			
			if(r.equals("won") || r.equals("win"))
			{
				mi.CWinner(sn);
			}
			else if(reval(r)==3)
			{
				break;
			}
			else
			{
				if(reval(r)<3)
					System.out.println("Am I a joke to you?");
				else
					System.out.println("Are you scared?");
				System.out.println("Re-enter your response properly!!");
				r=in.nextLine();
				break A;
			}
		}
		return;
			
		
	}
    public static void Userend()
    {
    	try{
    	System.out.println("Cual es tu numero ..?");
    	un=in.nextInt();
    	
    	if(!ng.zeros(un) || !ng.check(un))
    	{
    		System.out.println("Am I a joke to you?");
    		System.out.println("Re-enter your response properly!!");
    		un=in.nextInt();
    		if(!ng.zeros(un) || !ng.check(un))
    		{
    			System.out.println("You are BUSTED");
    			System.out.println("I won by Disqualification.");
    			System.exit(0);
    		}
    	}
    	}catch(Exception e)
    	{
    		System.out.println("Since you're sleepy, I, myself, ending the game and declaring myself as winner");
    		mi.CWinner(sn);
    	}

    	
    	if(un==sn)
    		mi.UWinner();
    	acc.Response(sn,un);
    	return;
    }
    public static void allgs()
    {
    	cr=2;
    	System.out.println("Is your number, " + ag[++y]);
		rp=in.next();
		//System.out.println(rp+reval(rp)+rp.length());
    	if(reval(rp)==3)
    	{ 
    		
    		getfr(ag[y]);
    		cr=1;
    		e=1;
    		return;
    	}
    	return;
    }
    public static void randomizer()
    {
    	Random r=new Random();
    	int w=r.nextInt(7);
    	int j;
    	switch(w)
    	{
    	case 0 :seekler(0);break;
    	case 1 :seekler(1);break;
    	case 2 :seekler(2);break;
    	case 3 :seekler(3);break;
    	case 4 :seekler(4);break;
    	case 5 :seekler(5);break;
    	case 6 :seekler(6);break;
    	}
    	return;
    }
    public static void seekler(int m)
    {
    	int k[]= {0,768,913,452,291,795,741,246,/*0800,*/425,876,759,174,624,921,391,/*001500,*/129,687,139,597,245,147,426,/*02200,*/642,714,245,795,913,786,921,/*002900,*/957,471,319,867,542,192,264,/*36*/471,957,931,678,129,462,542,/*43*/931,642,912,714,786,542,495,0,0};
    	int b,g,j=(m*7)+1;
    	//System.out.println("j="+j);
    	for( g=j,b=1;g<j+7;g++,b++)
    		a[b]=k[g];
    	return;
    	
    }
}
