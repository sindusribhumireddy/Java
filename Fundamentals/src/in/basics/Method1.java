package in.basics;
class Dimension{
	public void getArea() { //in function definition we use paramaters
		System.out.println(Math.PI*10*10);
	}
}
//linking function definition and function calling is called method binding
//flow of code can be checked through debugger
public class Method1 {

	public static void main(String[] args) {
		Dimension d =new Dimension();
		d.getArea();//function call(args args are actual values require for func call)

	}

}