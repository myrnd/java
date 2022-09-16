
public class MotorBike {

	// state
	private int speed;  //member variable

  // constructor

  MotorBike(int speed) {
    setSpeed(speed);
  }

	// Behavior

	void start() {
		System.out.println("Bike Started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	void increase(int howMuch) {
		this.speed += howMuch;
	}

	void decrease(int howMuch) {
		this.speed -= howMuch;
	}
}
