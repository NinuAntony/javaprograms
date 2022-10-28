package inheritance;

public class DivisionByTen extends AdditionDivison {
	//int sum=12;
void CheckDivisibilty()
{
	
	super.sum(10,20);
	if (super.sum%10==0)
	{
		System.out.println("number is divisible by 10");
	}
	else
	{
		System.out.println("number is not divisible by 10");
	
	}
}
	public static void main(String[] args) {
		DivisionByTen d=new DivisionByTen();
		d.CheckDivisibilty();

	}

}
