//package virtualPetAmok;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Test;
//
//public class OrganicPetTest {
//
//	@Test
//	public void shouldHaveHungerLevel() {
//		OrganicPet underTest = new OrganicPet("", "", 0, 0, 0);
//		underTest.feed();
//		int foodLevel = underTest.getFoodLevel();
//
//		assertEquals(50, foodLevel);
//	}
//
//
//	@Test
//	public void shouldHaveThirstLevel() {
//		OrganicPet underTest = new OrganicPet("", "", 0, 0, 0);
//		underTest.water();
//		int thirstLevel = underTest.getThirstLevel();
//
//		assertEquals(50, thirstLevel);
//	}
//
//	@Test
//	public void shouldHaveWasteLevel() {
//		OrganicPet underTest = new OrganicPet("", "", 0, 0, 0);
//
//		int wasteLevel = underTest.getWasteLevel();
//
//		assertEquals(50, wasteLevel);
//	}
//}
