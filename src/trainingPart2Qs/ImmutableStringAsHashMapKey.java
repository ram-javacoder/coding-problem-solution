package trainingPart2Qs;
//WAJP on immutable strings as hash map keys

import java.util.HashMap;
import java.util.Map;

public class ImmutableStringAsHashMapKey {

	public static void main(String[] args) {

		// Create a HashMap with String keys
		Map<String, String> countryMap = new HashMap<>();

		// Use immutable strings as keys
		countryMap.put("IN", "India");
		countryMap.put("US", "United States");
		countryMap.put("UK", "United Kingdom");

		// Fetching value using key
		String key = "IN";
		System.out.println("Country for code " + key + ": " + countryMap.get(key));

		// Attempt to change the key reference
		key = "US"; // this does not affect the original key stored in the map
		System.out.println("Country for new code " + key + ": " + countryMap.get(key));
	}
}
