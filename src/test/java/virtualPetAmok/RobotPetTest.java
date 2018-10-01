package virtualPetAmok;

import org.junit.Test;

import virtualPetAmok.RobotPet;

public class RobotPetTest {
	@Test
	public void shouldAddOil() {
		RobotPet underTest = new RobotPet("", "", 0, 0, 0, false);
		underTest.addOil();
		int check = underTest.addOil();
	}

	@Test
	public void shouldBeRobot() {
		RobotPet underTest = new RobotPet("", "", 0, 0, 0, false);
		boolean check = underTest.isARobot;

	}

	@Test
	public void shouldBeRobotTick() {
		RobotPet underTest = new RobotPet("", "", 0, 0, 0, false);
		underTest.robotMaitanance();
		underTest.robotTickTime();

	}

}
