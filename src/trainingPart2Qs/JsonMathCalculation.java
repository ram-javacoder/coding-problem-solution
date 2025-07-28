package trainingPart2Qs;



class Pricing {

	private double unitPrice;

	public double getUnitPrice() {

		return unitPrice;

	}

}

class Resource {

	private String units;
	private Pricing pricing;

	public Pricing getPricing() {
		return pricing;
	}

}

class ComputeCapacity {

	private Resource cpu;

	public Resource getCpu() {
		return cpu;
	}

	public Resource getMemory() {
		return memory;
	}

	private Resource memory;

}

class Configuration {

	private String allocationModel;
	private ComputeCapacity computeCapacity;

	public String getAllocationModel() {
		return allocationModel;
	}

	public ComputeCapacity getComputeCapacity() {
		return computeCapacity;
	}

}


public class JsonMathCalculation {

	public static void main(String[] args) {
		
		try {
			

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
}
