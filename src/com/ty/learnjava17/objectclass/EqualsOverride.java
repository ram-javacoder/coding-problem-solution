package com.ty.learnjava17.objectclass;

@FunctionalInterface
interface ClassA {

	public void m1();

	public boolean equals(Object obj);

}

class impl extends Object implements ClassA {

	@Override
	public void m1() {

	}

	@Override
	public boolean equals(Object obj) {
		return (this == obj);
	}

}

public class EqualsOverride {

}
