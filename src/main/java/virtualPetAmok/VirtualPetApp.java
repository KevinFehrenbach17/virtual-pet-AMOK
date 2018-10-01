package virtualPetAmok;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		VirtualPetShelter shelter = new VirtualPetShelter();
		
		Dog dog1 = new Dog("Otto", "Dachshund.", 40, 50);
		Dog dog2 = new Dog("Mocha", "Chocolate Lab", 50, 40);
		Dog dog3 = new Dog("Chief", "Border Collie", 60, 60);
		
		Cat cat1 = new Cat("Cleo", "Hairless Cat", 50, 50, 10);
		Cat cat2 = new Cat("Cat", "Missing his tail", 50, 50, 10);
		Cat cat3 = new Cat("Bing", "Grey Tabby", 50, 50, 10);
		
		RobotPet robot1 = new RobotPet ("Godard", "Robot Dog", 50, 50, 50, true);
				
		vPets.addPet(dog1);
		vPets.addPet(dog2);
		vPets.addPet(dog3);
		

		vPets.addPet(cat1);
		vPets.addPet(cat2);
		vPets.addPet(cat3);
		

		vPets.addPet(robot1);
		vPets.addPet(robot2);
		vPets.addPet(robot3);
		
		
		
		
		System.out.println("Welcome to The shelter, things are running amok");
		
		
		do {
			System.out.println("--------------------------------");
			for (VirtualPet eachPet : shelter.showPets()) {
				if (eachPet instanceof Cat) {
					System.out.println("Name\t|Description\t|Happiness\t|Food\t|Thirst");
					System.out.println(eachPet.getName() + "\t|" + eachPet.getDescription() + "\t|" + eachPet.getBordemLevel() 
							+ "\t\t|" + eachPet.getHealthLevel() + "\t|" + ((OrganicPet) eachPet).getFoodLevel() + "\t|"
							+ ((Cat) eachPet).getThirstLevel());
			
				}
				if (eachPet instanceof Dog) {
					System.out.println("Name\t|Descr\t|Happiness\t|Health\t|Food\t|Thirst\t|Cage Waste ");
					System.out.println(eachPet.getName() + "\t|" + eachPet.getDescription() + "\t|" + eachPet.getBordemLevel() 
							+ "\t\t|" + eachPet.getHealthLevel() + "\t|" + ((OrganicPet) eachPet).getFoodLevel() + "\t|"
							+ ((Dog) eachPet).getThirstLevel() + "\t|" + ((Dog) eachPet).getCageStats());
				}
				if (eachPet instanceof RobotPet) {
					System.out.println("Name\t|Descr\t|Happiness\t|Health\t|Oil \t| Type ");
					System.out.println(eachPet.getName() + "\t|" + eachPet.getDescription() + "\t|" + eachPet.getBordemLevel() 
							+ "\t\t|" + eachPet.getHealthLevel() + "\t|" + ((RobotPet) eachPet).getOilLevel());
				}
				System.out.println();
				System.out.println("What would you like to do?");
				System.out.println();
				System.out.println("1. Feed the pets");
				System.out.println("2. Hydrate the pets");
				System.out.println("3. Oil all pets");
				System.out.println("4. Play with a pet");
				System.out.println("5. Walk dogs");
				System.out.println("6. Clean dog cages");
				System.out.println("7. Clean Litter Box");
				System.out.println("8. Adopt a pet");
				System.out.println("9. Admit a pet");
				System.out.println();
				
				int userAction = input.nextInt();
				input.nextLine();
				if (userAction > 9) {
					System.out.println("Invalid entry, please try again...");

				} else if (userAction == 1) {
					shelter.feedAll();
					System.out.println("You fed the pets!");
				} else if (userAction == 2) {
					shelter.waterAll();
					System.out.println("You gave the pets water!");
				} else if (userAction == 3) {
					shelter.oilRobots();
					System.out.println("You oiled the robots!");
				} else if (userAction == 4) {
					playPet(input, shelter);
				} else if (userAction == 5) {
					shelter.walkDogs();
					System.out.println("You walked the dogs!");
				} else if (userAction == 6) {
					shelter.cleanCage();
					System.out.println("You cleaned the dog cages!");
				} else if (userAction == 7) {
					shelter.cleanLitterBox();
					System.out.println("You cleaned the cats litter box!");
				} else if (userAction == 8) {
					removePet(input, shelter);
				} else if (userAction == 9) {
					addPet(input, shelter);
				
			
				}
				shelter.tickPets();
			} while
		}

	private static void adopt(Scanner input, VirtualPetShelter shelter) {
		System.out.println("Choose which pet you would like to adopt.");
		System.out.println();

	}

}
