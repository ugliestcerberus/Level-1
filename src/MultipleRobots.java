
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;
public class MultipleRobots {
public static void main(String[]args) {
	Random random= new Random();	
	for(int i=0;i<201; i++) {
		Robot mini= new Robot("mini");
		mini.penDown();
		mini.setRandomPenColor();
		mini.moveTo(random.nextInt(2000),random.nextInt(1000));
		
	}
	
}

}
