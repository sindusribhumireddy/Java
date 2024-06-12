package in.basics;
class Box{
	static int count=0;
	public  Box(){
		System.out.println("object created");
		 count++;
	}
}
public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box();
		System.out.println(Box.count);
		
		

	}

}
