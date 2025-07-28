package trainingPart2Qs;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		int arr[]= {10,22,9,34,54,12,3,7};
		int max=arr[0],secondMax=arr[1];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>max) {
				
				secondMax=max;
				max=arr[i];
			}
			
			else if(arr[i]>secondMax)
			
			{
				secondMax=arr[i];
				
			}
			
		}
		
		System.out.println("Largest element is :" +max);
		System.out.println("Second largest element is :" +secondMax);
	}

}
