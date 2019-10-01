package Javapackage.bazlupackage;

public class Cat extends Animal {
	
	void meow() {
		System.out.println("Cat can say meow");
	}

	public static void main(String[] args) {

		Cat cat = new Cat();

		cat.meow();
		cat.eat();
		cat.run();
		cat.walk();

		for(int i=0; i<=4; i++) {
			System.out.println(""+i+"");
		}

	}
	
	
}
