package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if(firstValue() != getTerm(1))
			throw new IllegalStateException("firstValue: Invalid State Detected");
		current = current + commonDifference; 
		return current;
	}
	
	@Override
	public String toString() {
		return "Arith (3,2)";
	}

	
	@Override
	public double getTerm(int n) {
		double value = this.firstValue();
		for(int i=1; i<n; i++)
			value = this.nextValue();
		return value;
	}


}
