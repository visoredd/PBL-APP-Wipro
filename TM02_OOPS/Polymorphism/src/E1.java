class Fruit{
	protected char name, taste, size ;
	public void eat() {
		System.out.println ( " Name of the fruit is Unknown") ;
		System.out.println ( " Taste of the fruit is Unknown" ) ;
	}
}

class Apple extends Fruit{
	
	public void eat(){
		System.out.println ( " Name of the fruit is Apple") ;
		System.out.println ( " Taste of the fruit is Sweet") ;
	}
}

class Orange extends Fruit{
	
	public void eat(){
		System.out.println ( " Name of the fruit is Orange") ;
		System.out.println ( " Taste of the fruit is Sour") ;
	}
}

public class E1 {
	public static void main(String args[]) {
		Apple a = new Apple();
		a.eat();
		Orange o = new Orange();
		o.eat();
	}
}
