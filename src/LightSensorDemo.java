package demos;

import java.io.IOException;

import org.jointheleague.ecolban.rpirobot.IRobotAdapter;
import org.jointheleague.ecolban.rpirobot.IRobotInterface;
import org.jointheleague.ecolban.rpirobot.SimpleIRobot;

public class LightSensorDemo extends IRobotAdapter {
	Sonar sonar = new Sonar();
	
	public LightSensorDemo(IRobotInterface iRobot) {
		super(iRobot);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Try event listner, rev Monday 2030");
		IRobotInterface base = new SimpleIRobot();
		LightSensorDemo rob = new LightSensorDemo(base);
		rob.setup();
		while(rob.loop()){}
		rob.shutDown();		
	}

	private void setup() throws Exception {
		
	}
	
	private boolean loop() throws Exception{
		readSensors(100);//<--gotta read them sensors
		
		//getLightBumps() returns an array of length 6 (elements 0 - 5)
		//element 0 is the far left light sensor
		//element 5 is the far right light sensor
		//elements 1-4 are the sensors inbetween from left to right
		int[] lightBumpReadings = getLightBumps();
		int light4 = lightBumpReadings[3];
		int light5= lightBumpReadings[4];
		int light6= lightBumpReadings[5];
		//if the sensors don't detect anything, they return 0
		//otherwise they return some positive integer
		//the higher the integer the closer the object
	System.out.println(lightBumpReadings[0] );
	if(light6>0){
	driveDirect(200,200);
	}
	else if(light6<=0){
	driveDirect(500,100);
	}
	if(isBumpLeft() || isBumpRight()){
	return false;
	}
	else{
	return true;	
	}
	}
	private void sleep(int amt){
		try {
			Thread.sleep(amt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void shutDown() throws IOException {
		reset();
		stop();
		closeConnection();
	}
}