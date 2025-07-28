package com.ty.learnjava17.objectclass;

import java.util.Objects;

class StudentEqual {

	private String n;
	private int a;

	public StudentEqual() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentEqual(String n, int a) {
		super();
		this.n = n;
		this.a = a;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (!(obj instanceof StudentEqual))
			return false;

		StudentEqual other = (StudentEqual) obj;
		return n.equals(other.n) && Integer.compare(a, other.a) == 0;
	}
}

public class StudentExp {
	public static void main(String[] args) {

		StudentEqual s = new StudentEqual("David", 25);
		StudentEqual s1 = new StudentEqual("Ram", 28);

		boolean bool = s.equals(s1);
		System.out.println(bool);

	}

}
