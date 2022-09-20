public abstract class Vehicle{

	public Vehicle(int year, String make, String model, BodyStyle bodyStyle){

		this.year = year;
		this.make = make;
		this.model = model;
		this.bodyStyle = bodyStyle;
	}

	public abstract double range();
	
	public abstract double fuelConsumed(double miles);
	
	public abstract double dollarsToTravel(double miles);

	protected int year;
	protected String make;
	protected String model;
	protected BodyStyle bodyStyle; 

	@Override
	public String toString(){
		return year + " " + make + " " + model + " " + bodyStyle;
	}
}