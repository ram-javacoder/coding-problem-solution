package trainingPart2Qs;

//Interview - WAJP on String references to multiple object?
public class StringReference {

	public static void main(String[] args) {

		// String literals (stored in String pool)
		String str1 = "Java";
		String str2 = "Java";

		// New string object (stored in heap)
		String str3 = new String("Java");

		// Another new object with the same value
		String str4 = new String("Java");

		// Comparisons
		System.out.println("str1 == str2: " + (str1 == str2)); // true (same reference from pool)
		System.out.println("str1 == str3: " + (str1 == str3)); // false (different objects)
		System.out.println("str3 == str4: " + (str3 == str4)); // false (different heap objects)

		System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (same value)
		System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (same value)
		System.out.println("str3.equals(str4): " + str3.equals(str4)); // true (same value)
	}
}
