package virtualPetAmok;

public class Dog extends OrganicPet {
	public Dog(String name, String description, int bordemLevel, int healthLevel) {
		super(name, description, bordemLevel, healthLevel);
	}

	private int dogWasteLevel = 0;

	public int cleanCage() {
		return dogWasteLevel = 0;

	}

	public int walk() {
		return bordemLevel -= 5;
	}

	public int getBordemLevel() {

		return bordemLevel;
	}

	public int dogTick() {
		return dogWasteLevel++;
	}

	public int getCageStats() {
		return dogWasteLevel;
	}
}
