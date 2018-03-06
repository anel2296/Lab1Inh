package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if(firstValue() != getTerm(1))
			throw new IllegalStateException("firstValue: Invalid state detected");
		current = current * commonFactor; 
		return current;
	}
	
	@Override
	public String toString() {
		return "Geom (3,2)";
	}

	
	@Override
	public double getTerm(int n) {
		double value = this.firstValue();
		for(int i=1; i<n; i++)
			value = this.nextValue();
		return value;
	}


}
