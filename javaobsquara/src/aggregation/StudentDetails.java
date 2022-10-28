package aggregation;

public class StudentDetails {
int rollno;
String name;
Address address;
public StudentDetails(int rollno, String name, Address address) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.address = address;
}
void display()
{
	System.out.println(rollno+" "+name);
	System.out.println(address.city+" "+address.state);
}
	public static void main(String args[])

	{
	        Address address1=new Address("tcr","kerala");
			Address address2=new Address("ktym","kerala");
			StudentDetails s1=new StudentDetails(1,"ninu",address1);
			StudentDetails s2=new StudentDetails(2,"ninu",address2);
			s1.display();
			s2.display();
	
}
}
