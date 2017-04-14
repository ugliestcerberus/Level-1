public class MrsMinion {
	private String name;
	private int eyes;
	private String color;
	private String master;

public MrsMinion(String name,int eyes,String color,String master) {
		 this.eyes= eyes;	
		 this.name= name;
		 this.color=color;
		 this.master=master;
	}

	void setName(String newName) {
		name = newName;
	}

	String getName() {
		return name;
	}

	void setEyes(int newEyes) {
		eyes = newEyes;
	}

	int getEyes() {
		return eyes;
	}

	void setColor(String newColor) {
		color = newColor;
	}

	String getColor(){
		return color;
	}
	
	void setMaster(String newMaster){
		master= newMaster;
	}
	
	String getMaster(){
		return master;
	}
}
