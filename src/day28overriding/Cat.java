package day28overriding;

public class Cat extends Animal {

	public static void main(String[] args) {
		
		
		
		
	}
		public void sound() {
			System.out.println("Meow");
		}
		@Override
		public void numOfFoof() {
			System.out.println("4 ayakli");
			super.numOfFoof();
		}

	

}
