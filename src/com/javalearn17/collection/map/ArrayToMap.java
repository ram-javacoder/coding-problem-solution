package com.javalearn17.collection.map;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMap {

	public static void main(String[] args) {
        int[] arr = {4, 1, 2, 7, 9, 0, 6, 8, 4, 5, 2, 1, 3, 2, 9};
        Map<Integer, Long> frequencyMap = getElementFrequencyMap(arr);
        System.out.println(frequencyMap);
    }

    public static Map<Integer, Long> getElementFrequencyMap(int[] arr) {
        Map<Integer, Long> frequencyMap = new HashMap<>();
        
        
        // Count frequencies of elements in the array
        for (int num : arr) {
        
        	Long value=frequencyMap.getOrDefault(num, 0L) + 1;
            frequencyMap.put(num, value);
        }

        return frequencyMap;
}
}