package in.basics;
//every object is sharing the same copy of static data
//if we access a static variable without class name,the compiler will automatically appends it
//static variables cannot be declared locally inside an instance method
//static blocks can be used to intialize static variables
public class Variable2 {
    static int data=100;
	public static void main(String[] args) {
		//Using className
		System.out.println(Variable2.data);
		
		//Using Object:
		Variable2 obj = new Variable2();
		Variable2 obj2 = new Variable2();
		System.out.println("");
		System.out.println("Before modifying value");
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		obj.data=500;
		System.out.println("");
		System.out.println("After modifying value");
		System.out.println(obj.data);
		System.out.println(obj2.data);
		

	}

}