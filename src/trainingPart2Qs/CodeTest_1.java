package trainingPart2Qs;

//Finding Output

public class CodeTest_1 {
	int[] a = { 0 };

	public static void main(String[] args) {
		int[] a = { 0 };
		alert(a);
		System.out.println(a[0]);
	}

	public static void alert(int[] a) {
		int[] b = { 2 };
		a = b;

		/*
		 * ➤ Here, you're not modifying the original array. You're just changing the
		 * local copy of the reference a to point to a new array [2].
		 * 
		 * ⚠️ This doesn't affect the original a in the main method.
		 * 
		 */		
	}

}
