package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken() };

		for (FarmAnimal animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
			// check if Chicken
			if (animal instanceof Chicken) {
				System.out.println("Chickens can lay eggs: ");
				// cast FarmAnimal to Chicekn and call layEggf
				((Chicken) animal).layEgg();
			}
			// this will cause class cast excption
//			else {
//				((Chicken) animal).layEgg();
//			}
		}

		Chicken newChick = new Chicken();
		newChick.layEgg();
		//
		// since cast as FramAnimal, layEgg no longer available
		//( (FarmAnimal) newChick).leyEgg();

		System.out.println(">>>>>SINGABLES<<<<");

		Singable[] singables = new Singable[] { new Cow(), new Chicken(), new Tractor() };
		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}


		System.out.println(">>>>GET PRICE FROM FARM ANIMALS<<<<");
		for (FarmAnimal animal : farmAnimals) {
			System.out.println(animal.getName() + " $" + animal.getPrice());
		}

		Sellable[] sellables = new Sellable[] { new Cow(), new Chicken(), new Egg() };
		System.out.println(">>>>GET PRICE FROM SELLABLES<<<<");
		for (Sellable sellable : sellables) {
			System.out.println(sellable.getName() + " $" + sellable.getPrice());
		}


	}
}