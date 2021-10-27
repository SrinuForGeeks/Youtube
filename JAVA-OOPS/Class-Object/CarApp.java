class Car
{
	String fuelType; // data member

	public void run()
	{
		System.out.println(" Car is running !!!  with fuelType = "+fuelType);
	} // method

}

public class CarApp 
{
	public static void main(String args[])
	{
		Car creta = new Car();
		creta.fuelType = "Petrol";
		creta.run();

		Car nexon = new Car();
		nexon.fuelType="Diesel";
		nexon.run();

	}
}