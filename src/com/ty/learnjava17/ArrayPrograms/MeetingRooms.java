package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class MeetingRooms {

	public static boolean canAttendMeeting(int intervals[][]) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		for (int i = 1; i < intervals.length; i++) {
			
			if (intervals[i][0] < intervals[i-1][1]) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {

		int meeting1[][] = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
		int meeting2[][] = { { 7, 10 }, { 2, 4 } };

		
		System.out.println("Can attend all meeting (meeting 1): " + canAttendMeeting(meeting1));
		System.out.println("Can attend all meeting (meeting 2): " + canAttendMeeting(meeting2));
	}
}
