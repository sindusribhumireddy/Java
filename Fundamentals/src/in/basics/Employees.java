package in.basics;

public class Employees {
	int empId;
	String empName;
	String empDept;
	public Employees(int id,String name,String Department) {
		empId=id;
		empName=name;
		empDept=Department;
		
	}
    public void getDetails() {
    	System.out.println("enter employee Id:"+empId);
    	System.out.println("enter employee Name:"+empName);
    	System.out.println("enter employee Department:"+empDept);
    	System.out.println();
    	



    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e1=new Employees(101,"geethika","cse");
		Employees e2=new Employees(102,"sindhu","cse");
		Employees e3=new Employees(103,"pandu","cse");
		e1.getDetails();
		e2.getDetails();
		e3.getDetails();
	}

}