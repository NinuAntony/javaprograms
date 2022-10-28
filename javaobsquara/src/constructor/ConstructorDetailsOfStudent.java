package constructor;

public class ConstructorDetailsOfStudent
{
ConstructorDetailsOfStudent()

{
System.out.println("college name:tkm")	;
}
ConstructorDetailsOfStudent(int rollno1,String name1,int rollno2,String name2,int rollno3,String name3)
{

System.out.println("detail student1 is:"+rollno1+" "+name1);
System.out.println("detail student2 is:"+rollno2+" "+name2);
System.out.println("detail student3 is:"+rollno3+" "+name3);

}
public static void main (String args[])
{
	ConstructorDetailsOfStudent print=new ConstructorDetailsOfStudent();
	ConstructorDetailsOfStudent result1=new ConstructorDetailsOfStudent(1,"ninu",2,"anisha",3,"jaya");
	
}
}
