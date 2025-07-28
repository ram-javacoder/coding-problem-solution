package trainingPart2Qs;

class RightRotation {
	public static void main(String[] args) {

		int[] numbers = new int[] { 22, 11, 33, 44, 55, 66 };

		int n = 3;
		System.out.println("Given array is: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		for (int i = 0; i < n; i++) {
			int j, lastElement;

			lastElement = numbers[numbers.length - 1];
			for (j = numbers.length - 1; j > 0; j--) {

				numbers[j] = numbers[j - 1];
			}

			numbers[0] = lastElement;
		}
		System.out.println();

		System.out.println("Array after " + n + " right rotations: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}