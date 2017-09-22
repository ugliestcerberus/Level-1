public class FamilyRunner {
Person mom= new Person("Haowen", 40);
Person dad= new Person("Yong", 45);
Person me= new Person("Matthew",14);
public static void main(String[]args) {
	Person mom= new Person("Haowen", 40);
	Person dad= new Person("Yong", 45);
	Person me= new Person("Matthew",14);
	System.out.println(mom.getname() + " is " + mom.getAge() + " years old. ");
	System.out.println(dad.getname()+ " is " + dad.getAge() + " years old. ");
	System.out.println(me.getname()+ " is " + me.getAge() + " years old. ");
	System.out.println(Person.getnumberofpeople());
}
}
