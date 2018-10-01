package virtualPetAmok;

public class VirtualPet {
	private String name;
	private String description;
	protected int bordemLevel;
	private int healthLevel;

	public VirtualPet(String name, String description, int bordemLevel, int healthLevel) {
		this.name = name;
		this.description = description;
		this.bordemLevel = bordemLevel;
		this.healthLevel = healthLevel;
	}

	public String getName() {

		return name;
	}

	public String getDescription() {

		return description;
	}

	public int getHealthLevel() {

		return healthLevel;
	}

	public int getBordemLevel() {

		return bordemLevel;
	}

	public void playPet() {
		bordemLevel -= 5;
	}

}
