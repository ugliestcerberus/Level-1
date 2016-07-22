import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
public static void main(String[]args){
	Tortoise.setSpeed(10);
	Tortoise.setX(10);
	Tortoise.setY(400);
	Tortoise.show();
	for(int i = 0;i<10;i++)

	{
		drawHouse("small","orange");
		drawHouse("medium","orange");
		drawHouse("large","orange");

	}
}



static void drawHouse( String size,String color){
	int height=0;
	if(size.equals("small")){
		height=10;
	}
	if(size.equals("medium")){
		height=100;
	}
	if(size.equals("large")){
		height=200;
	}
	if(color.equals("blue")){
		Tortoise.setPenColor(Color.BLUE);
	}
	if(color.equals("gray")){
		Tortoise.setPenColor(Color.GRAY);
	}
	if(color.equals("orange")){
		Tortoise.setPenColor(Color.orange);;
	}
	Tortoise.move(height);
	for (int i = 0; i < 1; i++) {
		Tortoise.turn(90);
		Tortoise.move(40);
		}
	Tortoise.turn(90);
	Tortoise.move(height);
	Tortoise.turn(270);
	Tortoise.setPenColor(Color.green);
	Tortoise.move(30);
	Tortoise.turn(270);
}
}