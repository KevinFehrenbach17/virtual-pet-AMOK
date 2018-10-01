package virtualPetAmok;

public class RobotPet extends VirtualPet {

	private int oilLevel;
	public boolean isARobot;

	public RobotPet(String name, String description, int foodLevel, int thirstLevel, int bordemLevel,
			boolean isARobot) {
		super(name, description, foodLevel, thirstLevel);

		this.oilLevel = oilLevel;
		this.isARobot = isARobot;
	}

	public void robotMaitanance() {
		oilLevel = 250;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	public int addOil() {
		return oilLevel += 2;
	}

	public void robotTickTime() {
		oilLevel -= 1;

	}

	public void walk() {
		if (isARobot = true) {
			bordemLevel -= 10;
		} else if (isARobot = false) {
			bordemLevel += 0;
		}
	}

}
