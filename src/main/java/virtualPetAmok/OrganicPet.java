package virtualPetAmok;

public class OrganicPet extends VirtualPet {

	private int foodLevel;
	private int thirstLevel;
	private int wasteLevel;

	public OrganicPet(String name, String description, int bordemLevel, int healthLevel) {
		super(name, description, bordemLevel, healthLevel);
		this.foodLevel = foodLevel;
		this.thirstLevel = thirstLevel;
		this.wasteLevel = wasteLevel;
	}

	public int getFoodLevel() {

		return foodLevel;
	}

	public void feedAll() {
		foodLevel += 5;

	}

	public int getThirstLevel() {

		return thirstLevel;
	}

	public void waterAll() {
		thirstLevel -= 5;
	}

	public int getWasteLevel() {

		return wasteLevel;
	}

}
