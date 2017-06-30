import java.util.Random;
public class Vault {
int code;
Vault(){	
code=new Random().nextInt(1000000)+1;
}
}
class Spy{
	String name;
	Spy(String name){
	this.name= name; 
	Spy name1= new Spy("JamesBond");
	}
}
class vaultCracker{
	Vault vault;
	Spy spy;
boolean tryCode(int code){
return(guess==code);	
}
}