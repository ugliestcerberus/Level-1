public class Fibonacci {
public static void main(String[]args){
printFib();


}

public static void printFib(){
int a =0;
int b =1;
int c ;
System.out.println(a);
System.out.println(b);
for(int i=0;i<12;i++){
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
}
}
}
