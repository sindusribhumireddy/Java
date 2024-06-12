package in.basics;

public class studentdata {
    int studentId=100;
    String studentName="Harsh";
    
    @Override
    public String toString() {
    	return "StudentId:"+studentId+" StudentName : " +studentName;
    }
	public static void main(String[] args) {
		studentdata s1 = new studentdata();
		System.out.println(s1);

	}

}