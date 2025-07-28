package trainingPart2Qs;

 class Main {
	 public static void main(String[] args) {
	   System.out.println("In Main.main(String[])");
	 }
	}

class Main2 extends Main {
	 public void m2() {
	   main(null);  //access the main method in superclass
	 }
	}

public class MainMethodInherited extends Main2 {}