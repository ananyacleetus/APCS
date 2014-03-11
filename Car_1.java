public class Car {

	private double gas;
	private double mpg;
	private double capacity;

	public Car(double g, double m, double c) {
		
		gas = g;
		mpg =m;
		capacity = c;
		if (gas >capacity){
			gas=capacity;
		}

	}

	public void buyGas(double g) {

		gas += g;

	}

	public double getGas() {
	
		System.out.println(gas);
			return gas;

	}
	public double drive(double m){
		gas =((gas*mpg-m)/mpg);
		
		if(gas <= 0){
			gas=0;
			System.out.println("Gas is empty.");
		
		}
		
		else{
			System.out.println("You have driven " + m +" miles, and your gas levels is " + gas);
		}
		return gas;
			
		}
		
	
}
	

