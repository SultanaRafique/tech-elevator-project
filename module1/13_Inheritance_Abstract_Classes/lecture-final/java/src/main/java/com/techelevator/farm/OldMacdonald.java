package com.techelevator.farm;

import com.techelevator.dummy.BaseClass;
import com.techelevator.dummy.ChildClass;
import com.techelevator.dummy.PackageClass;

import java.util.BitSet;

public class OldMacdonald {
	public static void main(String[] args) {

		Singable[] singables =
				new Singable[] {new Cow(), new Chicken(), new Pig(), new Tractor()};

		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), new Egg()};

		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}

		System.out.println(">>> SLEEPING FARM ANIMALS <<<");
		FarmAnimal cow = new Cow();
//		cow.name = "Blah";
		FarmAnimal chicken = new Chicken();
		chicken.setIsAsleep(true);
		FarmAnimal pig = new Pig();
		FarmAnimal cat = new Cat();
		cat.setIsAsleep(true);

		// can't instiate FarmAnimal if it is abstract
		// to instantiate MUST extend
		//
//		FarmAnimal farmAnimal = new FarmAnimal("Farm Animal", "farmy!");
		FarmAnimal[] animals = new FarmAnimal[] { cow, chicken, pig, cat };
		for (FarmAnimal animal : animals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		System.out.println(">>> Animals eating <<<<");

		for (FarmAnimal animal : animals) {
			animal.eat();
		}

		// related to protected keyword
		//
		// BaseClass defines name as protected
		// this means that child classes such as ChildClass
		// cam access as if it were public.
		//
		// Unfortunately, this also has
		// the undesired effect of allowing ANY class in the same
		// package to access name directly.
		//
		// In the example below,
		// we show that PackageClass can access name directly
		// (it does so in its constructor by creating a BaseClass object
		// and updating the name property) because it is in the same package as BaseClass
		// but this class (OldMacdonald) CANNOT change the
		// value of name in the base object because it is NOT in the same
		// package as BaseClass


		BaseClass base = new BaseClass("sample");
		System.out.println(base.getName());

		ChildClass child = new ChildClass("other sample");
		System.out.println(child.getName());

		PackageClass pkg = new PackageClass();
		pkg.printName();

//		base.name = "Howdy";

	}
}