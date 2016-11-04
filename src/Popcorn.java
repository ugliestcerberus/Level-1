class Microwave {
	private int cookTime;
	Popcorn thingToBeCooked;


	Microwave() {
		System.out.println("Microwave says: a Microwave has been made.");
	}


	public Microwave(String string) {
		// TODO Auto-generated constructor stub
	}


	void putInMicrowave(Popcorn thingToBeCooked) {
		System.out.println("Microwave says: popcorn put in microwave.");
		this.thingToBeCooked = thingToBeCooked;
	}


	void setTime(int cookTimeInMinutes) {
		System.out.println("Microwave says: cook time is set to " + cookTime + " minutes.");
		this.cookTime = cookTimeInMinutes;
	}


	void startMicrowave() {
		if (thingToBeCooked == null)
			System.out.println("Microwave says: there's nothing in the microwave!");
		for (int i = 0; i < cookTime*10 + 1; i++) {
			thingToBeCooked.applyHeat();
		}
	}
}


public class Popcorn {
public static void main(String[]args){
Popcorn popcorn= new Popcorn("Lemon Pepper");
Microwave heat= new Microwave("Solo Microwave");
heat.setTime(2);
heat.putInMicrowave(popcorn);
heat.startMicrowave();
}

	private int kernels = 20;
	private String flavor ;


	Popcorn(String flavor) {
		this.flavor = flavor;
		System.out.println("Popcorn says: making package of " + this.flavor + " popcorn.");
	}




	public void applyHeat() {
		pause();
		

		if (kernels == 0) {
			System.out.println("Popcorn says: Time to eat popcorn!");
		} else {
			System.out.println("POP!" + kernels);
			kernels--;
		}
	}


	private void pause() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}





