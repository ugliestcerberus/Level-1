import org.teachingextensions.logo.Tortoise;

public class Houses {
public static void main(String[]args){
	Tortoise.setSpeed(10);
	Tortoise.setX(10);
	Tortoise.setY(400);
	Tortoise.show();
	for(int i = 0;i<10;i++)

	{
		drawHouse();

	}
}



static void drawHouse(){
	Tortoise.move(100);
	for (int i = 0; i < 2; i++) {
		Tortoise.turn(60);
		Tortoise.move(40);
		}
	Tortoise.turn(60);
	Tortoise.move(100);
	Tortoise.turn(-90);
	Tortoise.move(30);
}
}