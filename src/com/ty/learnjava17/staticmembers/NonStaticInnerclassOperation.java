package com.ty.learnjava17.staticmembers;

class OuterClass_ {

	static String emp_name;
	double salary;
	private int emp_id;

	public OuterClass_(double salary, int emp_id) {
		super();
		this.salary = salary;
		this.emp_id = emp_id;
	}

	class InnerClass {

		void print() {

			String name = OuterClass_.emp_name = "Ramkumar";
			System.out.println("Employee name :" + name);
			System.out.println("Id :" + emp_id);
			System.out.println("Salary :" + salary);

		}

	}

}

public class NonStaticInnerclassOperation {

	public static void main(String[] args) {

		OuterClass_ oc = new OuterClass_(350000, 112);
		OuterClass_.InnerClass OI = oc.new InnerClass();
		OI.print();
		
		
	}

}
