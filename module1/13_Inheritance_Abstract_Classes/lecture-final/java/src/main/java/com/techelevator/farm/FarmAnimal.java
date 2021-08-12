package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isAsleep = false;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return name;
	}

	public final String getSound( ) {
		if (isAsleep) {
			return "Zzzzzz....";
		}
		return sound;
	}

	public void setIsAsleep(boolean isAsleep) {
		this.isAsleep = isAsleep;
	}

//	public void eat() {
//		System.out.println("PLACEHOLDER: Add you eating message");
//	}

	public abstract void eat();

}