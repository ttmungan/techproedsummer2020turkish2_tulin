package day27inheritance;

public class Dog extends Mammal {
	public boolean loyal=true; 
	
	public Dog () {
		System.out.println("Dog");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.smell();
		dog.bark();
		dog.drink();
		dog.eat();
		Mammal.feed();

		System.out.println("Yas? "+ dog.age);
		System.out.println("Dogum? "+ dog.dogum);
		System.out.println("Sadik? " +dog.loyal);
	}
	
	public void bark() {
		System.out.println("Havlarlar");
	}
	
	public void smell () {
		System.out.println("Iyi koku alirlar");
	}

}
