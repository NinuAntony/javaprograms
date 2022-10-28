package inheritance;
import java.util.Scanner;

public class SalaryCalculation 
{
	int basic,bonus,deduction;
public static int value(int basic,int bonus,int deduction)
{
	Scanner Sc=new Scanner(System.in);
	System.out.print("enter basic");
	basic=Sc.nextInt();
	System.out.print("enter bonus");
	bonus=Sc.nextInt();
	System.out.print("enter deduction");
	deduction=Sc.nextInt();
		return basic;
	}
}

