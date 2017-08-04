import java.util.Random;

public class Vault {
	public static void main(String[] args) {
		Vault v = new Vault();
		JamesBond d= new JamesBond();
		System.out.println(d.findCode(v));
	}

	static int guess;
	static int code;

	Vault() {

		code = new Random().nextInt(1000000) + 1;
	}

	boolean tryCode(int code, int guess) {
		return (guess == code);
	}
}

class Spy {
	String name;

	Spy(String name) {
		this.name = name;
		Spy name10 = new Spy("JamesBond");
	}
}

class vaultCracker {
	Vault vault;
	Spy spy;

}

class JamesBond {

	int findCode(Vault v) {
		for(int i=0; i<1000000; i++){
			v.guess= i;
			if(v.tryCode(v.code,v.guess)){
				return v.code;
			}
		}
		return -1;
	}
}