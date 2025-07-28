package com.ty.learnjava17.ArrayPrograms.ArrayMatrix;

import java.util.Arrays;

/*The Xavier's School for gifted students holds a competition between X football players, and Professor Charles Xavier keeps 
track of the matches using a 2D matrix A. For each player, a win is marked as 1 point, a loss is marked as 0 points and matches 
yet to occur are marked as 2 in the matrix. The player with the highest points at the end of the competition is declared the winner.
Professor Charles wants to predict the winner of the competition, and for that he generates an array of Os and 1s indicating 
which players have a chance of winning the competition. If the Nth player is likely to win, the corresponding element in the 
array should be 1, otherwise, it should be 0. A player has a good chance of winning if s/he is likely to score the highest 
number of points. Your task is to find and return an integer array of Os and 1s indicating which players have a chance of 
winning the competition.*/


/* You're given X players.

A 2D matrix A (size X×X) represents the match results between players.

Each element A[i][j] tells us the result of the match between player i and player j:

1 → player i won against player j

0 → player i lost to player j

2 → match between player i and player j has not happened yet */





public class PredictWinner {

	public static void main(String args[]) {

		int input1 = 5;

		int[][] input2 = { { 0, 2, 2, 1, 0 }, { 2, 0, 1, 1, 0 }, { 2, 0, 0, 1, 0 }, { 0, 0, 0, 0, 1 },
				{ 1, 1, 1, 0, 0 } };
		int[] result = resultMatrix(input1, input2);
		System.out.println(Arrays.toString(result));

	}

	public static int[] resultMatrix(int input1, int input2[][]) {

		int[] maxPossibleCount = new int[input1];

		for (int i = 0; i < input1; i++) {

			int winCount = 0;
			int futureMatches = 0;

			for (int j = 0; j < input1; j++) {

				if (input2[i][j] == 1) {

					winCount++;
				} else if (input2[i][j] == 2) {

					futureMatches++;

				}

			}

			maxPossibleCount[i] = winCount + futureMatches;
		}

		int maxScore = Arrays.stream(maxPossibleCount).max().getAsInt();
		int result[] = new int[input1];

		for (int i = 0; i < input1; i++) {

			if (maxScore == maxPossibleCount[i]) {

				result[i] = 1;
			} else {

				result[i] = 0;
			}

		}

		return result;
	}

}
