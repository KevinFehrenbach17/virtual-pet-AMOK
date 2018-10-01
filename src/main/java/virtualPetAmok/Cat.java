package virtualPetAmok;

public class Cat extends OrganicPet {
	private int wasteLevel = 50;

	public Cat(String name, String description, int bordemLevel, int healthLevel, int wasteLevel) {
		super(name, description, bordemLevel, healthLevel);
		this.wasteLevel = wasteLevel;
	}

	public int cleanLitterBox() {
		return wasteLevel = 0;
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public int catTick() {
		return wasteLevel++;

	}

}
