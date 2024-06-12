package in.basics;

import java.util.Scanner;

class Employee{
	int empId;
	String empName;
	
	public Employee(int id,String name) {
		empId=id;
		empName=name;
	}
	
	public Employee(Employee obj)
	{
		empId=obj.empId;
		empName=obj.empName;
	}
	
	@Override
	public String toString() {
		return "Id: "+empId+", Name :"+empName;
		
	}
}
public class Constructor3{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the empId:");
		int id=sc.nextInt();
		
		System.out.println("Enter the empname:");
		String name = sc.next();
		
		Employee e1 =new Employee(id,name);
		System.out.println(e1);
		
		Employee e2=new Employee(e1);
		System.out.println(e2);
		
	}

}