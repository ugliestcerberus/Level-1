public class BakingCookies {
	public static void main(String[] args) {
Oven opas= new Oven();
CookieType jash= new CookieType(CookieType.CHOCO_CHIP);
MixingBowl newmdsf= new MixingBowl();		
newmdsf.addButter();
newmdsf.addFlour();
newmdsf.addSugar();
newmdsf.mixIngredients();
opas.turnOn();
opas.putBatterInOven();
newmdsf.eatCookie(jash, newmdsf,opas);
	}
}

class CookieType {

	public final static String CHOCO_CHIP = "Chocolate Chip";
	public final static String SUGAR = "Sugar";
	public final static String OATMEAL_RAISIN = "Oatmeal Raisin";
	public final static String MACADAMIA_NUT = "Macadamia Nut";

	private String cookieType;

	CookieType(String cookieType) {
		System.out.println("Good choice, " + cookieType + " cookies are yummy!");
		this.cookieType = cookieType;
	}

	String getCookieType() {
		return cookieType;
	}

}

class Oven {

	private boolean isHot = false;
	private boolean isBaking = false;

	void turnOn() {
		System.out.println("Oven is getting hot...");
		isHot = true;
	}

	void putBatterInOven() {
		if (!isHot) 
			System.out.println("Oven isn't hot yet!!");
		else {
			isBaking = true;
			System.out.println("It's starting to smell really great!");
		}
	}
	
	boolean isHot() {
		return isHot;
	}
	
	boolean isBaking() {
		return isBaking;
	}

}

class MixingBowl {

	private boolean flourAdded = false;
	private boolean sugarAdded = false;
	private boolean butterAdded = false;
	private boolean mixed = false;

	void eatCookie(CookieType type, MixingBowl bowl, Oven oven) {
		if (!flourAdded || !sugarAdded || !butterAdded)
			System.out.println("Missing some important ingredients!!");
		else if (!mixed)
			System.out.println("Can't bake before mixing the batter!!");
		else if (!oven.isHot())
			System.out.println("Can't bake cookies in a cold oven!!");
		else if (!oven.isBaking())
			System.out.println("Don't you need to bake the cookies??");
		else
			System.out.println("Yumm yumm, let's eat your " + type.getCookieType() + " cookies!!");
	}

	void addFlour() {
		System.out.println("Adding flour...");
		flourAdded = true;
	}

	void addSugar() {
		System.out.println("Adding sugar...");
		sugarAdded = true;
	}

	void addButter() {
		System.out.println("Adding butter...");
		butterAdded = true;
	}

	void mixIngredients() {
		if (!flourAdded || !sugarAdded || !butterAdded)
			System.out.println("Add all ingredients before mixing!!");
		else {
			mixed = true;
			System.out.println("Mixing ingredients, almost ready!");
		}
	}
}