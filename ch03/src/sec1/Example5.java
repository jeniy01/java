package sec1;

public class Example5 {
	public static void main(String[] args) {
		//논리연산자 : &&(And), ||(Or), !(Not)
		int a=27;
		int b=24;
		System.out.println("a<25&&b>25 : "+(a<25&&b>25));	//false&&false => false
		System.out.println("a>25&&b>25 : "+(a>25&&b>25));	//true&&false => false
		System.out.println("a<25&&b<25 : "+(a<25&&b<25));	//false&&true => false
		System.out.println("a>25&&b<25 : "+(a>25&&b<25));	//true&&true => true
		System.out.println("a<25||b>25 : "+(a<25||b>25));	//false||false => false
		System.out.println("a>25||b>25 : "+(a>25||b>25));	//true||false => true
		System.out.println("a<25||b<25 : "+(a<25||b<25));	//false||true => true
		System.out.println("a>25||b<25 : "+(a>25||b<25));	//true||true => true
		
		boolean c=a>25||b>25;
		System.out.println("c="+c);
		System.out.println("!c="+(!c));
		System.out.println("!(!c))"+(!(!c)));
		System.out.println("a<25^b>25 : "+(a<25^b>25));	//false^false => false
		System.out.println("a>25^b>25 : "+(a>25^b>25));	//true^false => true
		System.out.println("a<25^b<25 : "+(a<25^b<25));	//false^true => true
		System.out.println("a>25^b<25 : "+(a>25^b<25));	//true^true => false
		
	}

}
