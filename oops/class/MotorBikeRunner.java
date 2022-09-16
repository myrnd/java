public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(120);
		honda.setSpeed(100);

		ducati.increase(10);

		System.out.println("Speed of Bike : " + ducati.getSpeed());

	}

}
