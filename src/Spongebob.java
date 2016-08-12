public class Spongebob {
public static void main(String[]args){
SeaCreatures Spongebob= new SeaCreatures("Spongebob");
Spongebob.eat();
Spongebob.laugh();
String Creature=Spongebob.getName();
System.out.println(Creature);
SeaCreatures Squidward= new SeaCreatures("Squidward");
Squidward.eat();
Squidward.laugh();
String SeaAnimal= Squidward.getName();
System.out.println(SeaAnimal);
SeaCreatures Patrick= new SeaCreatures("Patrick");
Patrick.eat();
Patrick.laugh();
String Star= Patrick.getName();
System.out.println(Star);
}
}