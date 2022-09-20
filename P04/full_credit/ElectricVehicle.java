public class ElectricVehicle extends Vehicle{

	public static double centsPerKwhOfElectricity;
	private double whPerMile; 
	private double kwhInBattery;

	public ElectricVehicle(int year, String make, String model, BodyStyle bodyStyle, double whPerMile, double kwhInBattery){

			super(year,make,model,bodyStyle);
			this.whPerMile = whPerMile;
			this.kwhInBattery = kwhInBattery;
	}
	@Override
	public double range(){
		return kwhInBattery/(whPerMile/1000);
	}

	@Override
	public double fuelConsumed(double miles){

		return miles*(whPerMile/1000);
	}

	@Override
	public double dollarsToTravel(double miles){
		if (fuelConsumed(miles) > kwhInBattery) throw new ArithmeticException("More energy cannot be consumed than available");
		return fuelConsumed(miles)*(centsPerKwhOfElectricity/100);
	}

}