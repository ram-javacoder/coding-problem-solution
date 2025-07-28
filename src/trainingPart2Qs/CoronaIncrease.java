package trainingPart2Qs;

/*Given some data like day and people infected by corona Day 1:1%
population Day 2:2 % population Day x: 50% population Day 37: 100%
population What is day x? 5.*/

//The pattern suggests exponential growth (i.e., the number of infected people doubles each day).

/*Day 1 → 1%

Day 2 → 2%

Day 3 → 4%

Day 4 → 8%

Day 5 → 16%

Day 6 → 32%

Day 7 → 64%

Since we are asked on which day (Day X) the infection reaches 50%, we need to find when the percentage is closest to 50%.
*/

public class CoronaIncrease {

	public static void main(String[] args) {

		double infectedPercentage = 1; // Start with 1% infection
		int day = 1;

		while (infectedPercentage < 50) {
			infectedPercentage *= 2; // Infection doubles each day
			day++;
		}

		System.out.println("Day X when 50% population is infected: " + day);

	}

}
