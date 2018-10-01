package virtualPetAmok;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CatTest {
	@Test
	public void shouldCleanLitterBox() {
		Cat underTest = new Cat("", "", 0, 0, 0);
		underTest.cleanLitterBox();
		int check = underTest.cleanLitterBox();
	}

	@Test
	public void shouldTickCat() {
		Cat underTest = new Cat("", "", 0, 0, 0);
		underTest.catTick();
		int check = underTest.catTick();
	}

}