public class Truck {
void drive(){
System.out.println("Vroom,Vroom!");	
}
void honk(){
System.out.println("Beep,Beep!");
}
void carryheavyitems(){
System.out.println("Move truck, Move!");
}
void stop(){
System.out.println("Slow Down, Truck!");	
}
public static void main(String[] args) {
Truck Matt= new Truck();
Matt.drive();
Matt.carryheavyitems();
Matt.stop();
Truck Firetruck= new Truck();
Firetruck.honk();
Firetruck.drive();
Truck Ambulance= new Truck();
Ambulance.honk();
Ambulance.drive();
Truck GarbageTruck= new Truck();
GarbageTruck.carryheavyitems();
}
}


