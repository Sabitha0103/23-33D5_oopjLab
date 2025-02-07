class Person
{
	String name;
	int age;
}
class Employee extends Person
{
	int empid;
	Employee()
	{
		this.name=name;
		this.age=age;
		this.empid=empid;
	}
	void displaye(String name,int age,int empid)
	{
		System.out.println("employee name:"+name);
		System.out.println("employee age:"+age);
		System.out.println("employee id:"+empid);
	}
}
class Manager extends Employee{
	String department;
	Manager()
	{
		this.department=department;
	}
	void displaym(String department)
	{
		System.out.println("manager department:"+department);
	}
}
public class  MultiLevelInheritance
{
	public static void main(String[] args)
	{
		Manager manager=new Manager();
		manager.displaye("sabitha",19,333);
		manager.displaym("sales");
	}
} 
		