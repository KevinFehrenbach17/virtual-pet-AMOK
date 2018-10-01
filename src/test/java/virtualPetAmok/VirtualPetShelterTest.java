package virtualPetAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.not;

public class VirtualPetShelterTest {

	@Test
	public void shouldAddPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet Baker = new VirtualPet("name", "description", 0, 0);

		underTest.addPet(Baker);
	}

	@Test
	public void shouldRemovePet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet Baker = new VirtualPet("name", "description", 0, 0);
		String name = Baker.getName();
		underTest.addPet(Baker);
		underTest.removePet(name);
	}

	@Test
	public void shouldFeedPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet Baker = new VirtualPet("name", "description", 0, 0);
		underTest.addPet(Baker);
		underTest.feedOrganicPet();
	}

	@Test
	public void shouldOilPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		RobotPet Mayfield = new RobotPet("", "", 0, 0, 0, true);
		underTest.addPet(Mayfield);
		underTest.oilRobots();
	}

	@Test

	public void shouldWalkDogs() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		Dog Baker = new Dog("", "", 0, 0);
		underTest.addPet(Baker);
		underTest.walkDogs();
		Assert.assertEquals(0, (Baker).getBordemLevel());

	}

}
