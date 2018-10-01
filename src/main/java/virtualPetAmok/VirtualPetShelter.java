package virtualPetAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import virtualPet.VirtualPet;

public class VirtualPetShelter {
	public Map<String, VirtualPet> vPets = new HashMap<>();
	private String name;

	public Collection<VirtualPet> pets() {
		return vPets.values();

	}

	public void addPet(VirtualPet name) {
		vPets.put(name.getName(), name);

	}

	public void removePet(String petToRemove) {
		vPets.remove(petToRemove);

	}

	public void feedAll() {
		for (VirtualPet eachPet : vPets.values()) {
			if (eachPet instanceof OrganicPet) {
				((OrganicPet) eachPet).feedAll();

			}
		}
	}

	public void playPet(String name) {
		vPets.get(name).playPet();
	}

	public void waterAll() {
		for (VirtualPet pet : vPets.values()) {
			((OrganicPet) pet).waterAll();
		}
	}

	public void oilRobots() {
		for (VirtualPet eachPet : vPets.values()) {
			if (eachPet instanceof RobotPet) {
				((RobotPet) eachPet).robotMaitanance();

			}
		}
	}

	public void walkDogs() {
		for (VirtualPet eachPet : vPets.values()) {
			if (eachPet instanceof Walkable)
				((Walkable) eachPet).walk();
		}
	}

	public boolean adopt(String name) {
		vPets.remove(name);
		return false;
	}

	public Collection<VirtualPet> showPets() {
		Collection<VirtualPet> petCollection = vPets.values();
		return petCollection;
	}

	public void tickPets() {
		for (VirtualPet eachPet : vPets.values()) {
			if (eachPet instanceof RobotPet)
				((RobotPet) eachPet).robotTickTime();
			if (eachPet instanceof Dog)
				((Dog) eachPet).dogTick();
			if (eachPet instanceof Cat)
				((Cat) eachPet).catTick();
		}
	}

	public void trackStatus() {
		for (VirtualPet eachPet : vPets.values()) {
			if (eachPet instanceof RobotPet)
				((RobotPet) eachPet).getOilLevel();
			if (eachPet instanceof Dog)
				((Dog) eachPet).getCageStats();
			if (eachPet instanceof Cat)
				((Cat) eachPet).getWasteLevel();

		}
	}
}