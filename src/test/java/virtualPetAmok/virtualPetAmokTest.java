package virtualPetAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class virtualPetAmokTest {

	@Test
	public void shouldHaveName() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0);

		String petName = underTest.getName();

		assertEquals("name", petName);
	}

	@Test
	public void shouldHaveDescription() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0);

		String petDescription = underTest.getDescription();

		assertEquals("description", petDescription);
	}

	@Test
	public void shouldHaveHealthLevel() {
		VirtualPet underTest = new VirtualPet("", "", 0, 0);

		int healthLevel = underTest.getHealthLevel();

		assertEquals(50, healthLevel);
	}

	@Test
	public void shouldHaveBordemLevel() {
		VirtualPet underTest = new VirtualPet("", "", 0, 0);

		int bordemLevel = underTest.getBordemLevel();

		assertEquals(50, bordemLevel);
	}

}
