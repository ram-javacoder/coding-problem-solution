package trainingPart2Qs;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a =0,b=1,c=1;
		int count = 10;
		System.out.println("Fibonacci serious");
		for(int i=1;i<=count;i++) {
			
			System.out.print(a+ " ");
			a=b;
			b=c;
			c=a+b;
		}
		
		
	}
}
