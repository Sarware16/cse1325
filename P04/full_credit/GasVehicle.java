public class GasVehicle extends Vehicle{

	public static double dollarsPerGallonofGas;
	private double milesPerGallon;
	private double gallonsInTank;

	public GasVehicle(int year, String make, String model, BodyStyle bodyStyle, double milesPerGallon, double gallonsInTank){

		super(year, make, model, bodyStyle);
		this.milesPerGallon = milesPerGallon;
		this.gallonsInTank = gallonsInTank;
	}

	@Override
	public double range(){
		return gallonsInTank*milesPerGallon;
	}

	@Override
	public double fuelConsumed(double miles){ 

		return miles/milesPerGallon;
	}

	@Override
	public double dollarsToTravel(double miles){
		if (fuelConsumed(miles) > gallonsInTank) throw new ArithmeticException("More gas cannot be consumed than available");
		return fuelConsumed(miles)*dollarsPerGallonofGas;
	}
}