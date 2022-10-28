package inheritance;

public class OffSeason extends OnSeason
{
	
public int discount(int total)
{
	int onseas=super.discount(10000);
	long offseasondiscount=(15*total)/100;
	System.out.println("off season discount" +offseasondiscount);
return 0;
	}
	public static void main(String[] args) 
	{
OffSeason discountrps=new OffSeason();
discountrps.discount(10000);

//OnSeason d2=new OnSeason();
//d2.discount(10000);

	}

}
