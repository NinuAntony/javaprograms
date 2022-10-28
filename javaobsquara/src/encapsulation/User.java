package encapsulation;

public class User {

	public static void main(String[] args) {
		Bank u1=new Bank();
		u1.setPin(2000);
		int i=u1.getPin();
		System.out.print(i);

	}

}
