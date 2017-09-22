public class Person {
private String name;
private int age;
static int numberofpeople;
Person(String name, int age){
	this.name= name;
	this.age= age;
	numberofpeople++;
}
int getAge(){
	return age;
}
String getname(){
	return name;
}
static int getnumberofpeople() {
	return numberofpeople;
}
}


