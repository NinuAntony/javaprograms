package inheritance;

public class HraPf extends SalaryCalculation {
int hra,pf;
	public int HraCalculation()
	{
	    super.value(int basic,int bonus,int deduction)
		hra=(5*super.basic)/100;
		System.out.print("hra="+hra);
		return hra;
	}
		
		public int PfCalculation()
		{
			pf=(20*super.basic)/100;
			System.out.print("pf="+pf);
			return pf;
		}
		
	public static void main(String args[])
	{
	HraPf calc=new HraPf();
	calc.HraCalculation();
	calc.PfCalculation();
	}
}
	


