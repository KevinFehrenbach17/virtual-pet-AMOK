package virtualPetAmok;

import org.junit.Test;

public class DogTest {
	@Test
	public void shouldCleanCage() {
		Dog underTest = new Dog("", "", 0, 0);
		underTest.cleanCage();
		int check = underTest.cleanCage();
	}

	@Test
	public void shouldTickDog() {
		Dog underTest = new Dog("", "", 0, 0);
		underTest.dogTick();
		int check = underTest.dogTick();
	}

}
