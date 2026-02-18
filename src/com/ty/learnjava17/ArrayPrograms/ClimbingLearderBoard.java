package com.ty.learnjava17.ArrayPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClimbingLearderBoard {

	public static void main(String[] args) {
		
	
	 int[] ranked = {100, 100, 50, 40, 40, 20, 10};
     int[] player = {5, 25, 50, 120};

     List<Integer> ranks = climbingLeaderboard(ranked, player);

	     System.out.println("Ranks: " +ranks);
}

	private static List<Integer> climbingLeaderboard(int[] ranked, int[] player) {
		List<Integer> uniqueRank = new ArrayList<Integer>();
		
		uniqueRank.add(ranked[0]);
		
		for(int i=1;i<ranked.length;i++) {
			if (ranked[i] != ranked[i-1]) {
				uniqueRank.add(ranked[i]);
			}
			
		}
		int i = uniqueRank.size()-1;
		List<Integer> result = new ArrayList<>();
		 
		for(int score : player) {
			
			while(i >= 0 && score >= uniqueRank.get(i)) {
				i--;
			}
			
			result.add(i+2);
		}
		
		return result;
	}

}
