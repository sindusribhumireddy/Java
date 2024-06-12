package in.basics;
//instance variable :declared outside the method
//object is mandatory to access instance variable
//every object maintains its own copy of instance variable
//this variables are created when object of class is created
//we can intialize instance variables using constructors while creating an object
public class Variable1 {
    int data=100;
	public static void main(String[] args) {
		//creating an object
		Variable1 obj=new Variable1();
		Variable1 obj2=new Variable1();
		//accessing instance variable:objName.varName
		System.out.println(obj.data);
		
		System.out.println("");
		System.out.println("Before modifying value");
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		obj.data=200;
		System.out.println("After modifying value");
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		
	

	}

}