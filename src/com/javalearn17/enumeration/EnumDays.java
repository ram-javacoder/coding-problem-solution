package com.javalearn17.enumeration;

import java.util.Scanner;

enum Days {
	monday, tuesday, wednesday, thursday, friday, saturday, sunday

}

public class EnumDays {

	Days day;

	public EnumDays(Days day) {
		this.day = day;

	}

	public void display() {

		switch (day) {
		case monday: {
			System.out.println(
					"New week, new goals! Conquer today like a champion. Your hard work today will shape your success tomorrow! 💪🚀");
			break;
		}

		case tuesday: {
			System.out.println(
					"Keep the momentum going! Every small effort adds up to big results. Stay focused and keep pushing forward!");
			break;
		}

		case wednesday: {
			System.out.println(
					"You’re halfway there! Don’t slow down now—great things come to those who persist. Keep grinding!");
			break;
		}
		case thursday: {
			System.out.println(
					"Success is near! Stay patient, stay consistent, and trust your journey. You are closer than you think!");
			break;
		}
		case friday: {
			System.out.println(
					"Finish strong! Everything you’ve worked for this week is coming together. Give it your best shot!");
			break;
		}
		case saturday: {
			System.out.println(
					"Take a breath, celebrate your wins, and recharge for greater victories. Rest, but never quit!");
			break;
		}
		case sunday: {
			System.out.println(
					"Reflect, reset, and prepare to rise even stronger. A new week is your chance to chase new dreams!");
			break;
		}
		default:
			System.out.println("Stay motivated every day! Success is built step by step. Keep going!");
			break;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day");
		String s = sc.nextLine();
		EnumDays e = new EnumDays(Days.valueOf(s));
		e.display();
	}
}
