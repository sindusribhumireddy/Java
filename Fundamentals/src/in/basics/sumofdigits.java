package in.basics;

public class sumofdigits {
	public static int sum(int i, int sum) {
		if(i>=3) {
			return sum;
			
		}
		i=i+1;
		return sum(i,sum+i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int sum=0;
		System.out.println(sum(n,sum));

	}

}
