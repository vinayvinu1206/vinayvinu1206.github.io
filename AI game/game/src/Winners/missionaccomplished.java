package Winners;
import java.util.*;
import NGenerator.*;
public class missionaccomplished 
{
	static NumberGenerator ng=new NumberGenerator();
	public static void CWinner(int a)
	{
		System.out.println(" Well played at the end of the day there is one winner that is  The best ");
		System.out.println("You can't win unless you learn how to lose.");
		MyNumber(a);
		System.out.println("Keep calm and play Cual es tu numero ?");
		System.out.println("Quote of the Game ");
		quote();
		System.out.println("Live long and prosper");
		System.exit(0);
	}
	public static void MyNumber(int a)
	{
		try{
			Thread.sleep(2000);
			System.out.print("By the way, my number is");
			Thread.sleep(2000);
			System.out.print(".");
			Thread.sleep(2000);
			System.out.print(".");
			Thread.sleep(2000);
			System.out.print(".");
			Thread.sleep(2000);
			System.out.println("Do you want to knowwwwwwwwwww!!!");
			Thread.sleep(5000);
			System.out.print("My number is ");
			Thread.sleep(3000);
			System.out.print(""+Integer.toString(a).charAt(0));
			Thread.sleep(3000);
			System.out.print(""+Integer.toString(a).charAt(1));
			Thread.sleep(3000);
			System.out.print(""+Integer.toString(a).charAt(2));
			
			System.exit(0);
			
		}
		catch(Exception e){}
	}
	
	public static void UWinner()
	{
		 Scanner in=new Scanner(System.in);
		System.out.println(" Congraluations on your victory ");
		System.out.println("By the way what was your number ??");
		int a=in.nextInt();
		
		if(!ng.zeros(a))
		{
			System.out.println("You Knave !!!");
			System.out.println("When the truth offends, we lie and lie until we cannot even remember it's there. But it is still there.");
			System.out.println("Every lie we tell incurs a debt to the truth. Sooner or later, the debt is paid .");
			System.exit(0);
		}
		System.out.println("Quote of the Game ");
		quote();
		
		System.out.println("Live long and prosper");
		System.exit(0);
	}
	public static void quote()
	{
		Random r=new Random();
		int t=r.nextInt(12);
		switch(t)
		{
		case 0 :System.out.println("When the truth offends, we lie and lie until we cannot even remember it's there. But it is still there.");break;
		case 1 :System.out.println("Every lie we tell incurs a debt to the truth. Sooner or later, the debt is paid .- Valery Legasov");break;
		case 2 :System.out.println("\"Logic is the beginning of wisdom, not the end.\" -- Spock");break;
		case 3 :System.out.println("\"Blessed Are the forgetful for they get the better even of their blunders.\"");break;
		case 4 :System.out.println("\"Once you have eliminated the impossible, whatever remains, however improbable, must be the truth.\"");break;
		case 5 :System.out.println("\"Don't try to be a great man.Just be a man,and let history make its own judgment.\"");break;
		case 6 :System.out.println("\"It is possible to commit no errors and still lose. That is not a weakness. That is life.\" ");break;
		case 7 :System.out.println("\"If you put your mind to it,you can accomplish anything.\"");break;
		case 8 :System.out.println("\"Insufficient facts always invite danger.\"");break;
		case 9 :System.out.println(" “THE HARDEST CHOICES REQUIRE THE STRONGEST WILLS.”");break;
		case 10 :System.out.println("“There is only one thing we say to death: Not today.”");break;
		case 11 :System.out.println("\"Compassion: that's the one things no machine ever had. Maybe it's the one thing that keeps men ahead of them.\" ");break;
		case 12 :System.out.println("\"Either you run the day or the day runs you\"");break;
		}
	}

}
