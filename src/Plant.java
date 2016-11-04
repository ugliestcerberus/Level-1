import java.awt.Color;
import java.awt.Height;

public class Plant {
Color color;
Float height;
String species;
String climate;
boolean alive;
//Color getColor(){
//return color;	
//}
//Float getHeight(){
//return height;	
//}
//String getSpecies(){
//return species;
//}
//String getClimate(){
//return climate;	
//}
//boolean isAlive(){
//return alive;
//}
public Color getColor() {
	return color;
}
public Float getHeight() {
	return height;
}
public String getSpecies() {
	return species;
}
public String getClimate() {
	return climate;
}
public boolean isAlive() {
	return alive;
}
public void setColor(Color color) {
	this.color = color;
}
public void setHeight(Float height) {
	this.height = height;
}
public void setSpecies(String species) {
	this.species = species;
}
public void setClimate(String climate) {
	this.climate = climate;
}
public void setAlive(boolean alive) {
	this.alive = alive;
}
}

