package trainingPart2Qs;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {

		List<List<String>> listOfList = new ArrayList<List<String>>();
		ArrayList<String> names = new ArrayList<String>();
		names.add("ram");
		names.add("mohan");
		names.add("poongavanam");
		names.add("lakshan");
		listOfList.add(names);

		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("PineApple");
		listOfList.add(fruits);

		ArrayList<String> number = new ArrayList<String>();
		number.add("one");
		number.add("two");
		number.add("three");
		number.add("four");
		listOfList.add(number);

		
		
		System.out.println("[");
		for (List<String> string : listOfList) {

			System.out.print(" {");
			for (String item : string) {
			
				System.out.print(""+item+ ",");
			}
			
			
			System.out.println("} ,");
		}
		System.out.println("]");

	}

}
