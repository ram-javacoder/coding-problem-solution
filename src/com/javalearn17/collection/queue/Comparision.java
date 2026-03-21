package com.javalearn17.collection.queue;

import java.util.PriorityQueue;

class Student {

	int rollNo;
	int mark;

	public Student(int rollNo, int mark) {
		super();
		this.rollNo = rollNo;
		this.mark = mark;
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getMark() {
		return mark;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", mark=" + mark + "]";
	}

}

public class Comparision {

	public static void main(String[] args) {

		PriorityQueue<Student> pq = new PriorityQueue<>((s1, s2) -> {

			// If marks are same
			if (s1.mark == s2.mark) {
				return s1.rollNo - s2.rollNo; // smaller roll number first
			}

			// Higher marks first
			return s2.mark - s1.mark;
		});

		pq.add(new Student(101, 85));
		pq.add(new Student(102, 90));
		pq.add(new Student(103, 85));
		pq.add(new Student(104, 70));

		System.out.println(pq);
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		
	}

}
