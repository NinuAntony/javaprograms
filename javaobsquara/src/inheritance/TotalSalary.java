package inheritance;


public class TotalSalary extends SalaryCalculation
{
int total=0;
	public void TotalInHand()
	{
		super.value(60000,10000,5000);
		super.HraCalculation();
		super.PfCalculation();
		int total=super.basic+super.bonus+super.hra-super.deduction-super.pf;
	}
	

	public static void main (String args[]) 
	{
   TotalSalary fullamount=new TotalSalary();
   fullamount.TotalInHand();
	}

}
