public class Runner2 {
public static void main(String[]args){
SeaCreatures2 Spongebob= new SeaCreatures2("spongebob");
SeaCreatures2 Patrick= new SeaCreatures2("patrick");
SeaCreatures2 Squidward= new SeaCreatures2("squidward");
Patrick.eat();
Patrick.laugh();
Spongebob.eat();
Spongebob.laugh();
Squidward.eat();
Squidward.laugh();
System.out.println(Patrick.getName());
System.out.println(Spongebob.getName());
String Gray= Squidward.getName();

}
}

