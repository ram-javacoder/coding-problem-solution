package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/*You’re asked to count how many times each log ID appears in the logs array.

So we need to create a frequency map like this:

1→3 times 2→2 times 3→3 times 4→2 times 5→2 times

We can represent it as a map or list of pairs:

(1,3),(2,2),(3,3),(4,2),(5,2)

A=[3,4]→So L=3,R=4

We need to find total number of logs with IDs between 3 and 4(inclusive).

From the frequency map:

3→3 logs

4→2 logs

Total=3+2=5 logs✅

Hence,the result is 5.*/

public class FindTotalSumOfLogs {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 3, 2, 1, 4, 1, 2, 3, 5, 4 };
		int a[] = { 3, 4 };
		findTotalLogs(arr, a);

	}

	private static void findTotalLogs(int[] arr, int a[]) {

	
		Long totalLogs = Arrays.stream(arr).mapToObj(n -> n)
				.collect(Collectors.groupingBy(k -> k, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getKey() >= a[0] && entry.getKey() <= a[1]).mapToLong(Map.Entry::getValue).sum();

		System.out.println("Total logs between " + a[0] + " and " + a[1] + " = " + totalLogs);
	}

}
