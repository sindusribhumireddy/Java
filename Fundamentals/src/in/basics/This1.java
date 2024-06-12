package in.basics;


class A{
	A(){
		System.out.println("Current Value of this-->"+this);
	}
}
public class This1 {

	public static void main(String[] args) {
		A a =new A();
		System.out.println("Current value of a --->"+a.hashCode());
		System.out.println("_");
		A obj=new A();
		System.out.println("Current value of a --->"+obj.hashCode());
		
		

	}

}