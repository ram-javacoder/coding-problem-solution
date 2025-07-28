package trainingPart2Qs;

public class ContionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 20,c=21;
		boolean result = (a++ > b && b++ < a++);
		boolean result2=  a++ > b++ || a>b;
		System.out.println("Result 1 :" +result);
		System.out.println("Result 2 :" +result2);
		
		
	}

	
}
