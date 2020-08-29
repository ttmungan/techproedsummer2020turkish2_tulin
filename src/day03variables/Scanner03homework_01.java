package day03variables;

import java.util.Scanner;

public class Scanner03homework_01 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in); // get a square's edge length and find the formula of area and perimeter //
		System.out.println("Enter the square's edge length please: ");
		int edgeLength= scan.nextInt();
		int areaSquare= edgeLength*edgeLength;
		int perimeterSquare= 4*edgeLength;
		System.out.println("The area is"+" "+ areaSquare);
		System.out.println("The perimeter lentgh is" + " " + perimeterSquare);
		
		System.out.println("Enter a number please :"); // find a number's third power //
		int number = scan.nextInt();
		int thirdPower = number*number*number;
		System.out.println("The number's third power is" + " " + thirdPower);
		
		System.out.println("Enter a rectangle's two edge's lengths please: ");
		int shortEdge = scan.nextInt();
		int longEdge = scan.nextInt();
		int areaRectangle= shortEdge*longEdge;
		int perimeterRectangle= 2*(longEdge+shortEdge);
		System.out.println("The area is"+" "+ areaRectangle);
		System.out.println("The perimeter is"+" "+ perimeterRectangle);
		
		System.out.println("Enter a rectangular prisma's three edge's length please:"); // finding a rectangular prisma's  volume formula //
		int widthLength = scan.nextInt();
		int lengthLength = scan.nextInt();
		int heightLength = scan.nextInt();
		int rectangularVolume= widthLength*lengthLength*heightLength;
		System.out.println("The rectangular prisma's volume is"+" "+ rectangularVolume);
		
		System.out.println("Enter a circle's radius length please:"); // Finding a circle's perimeter and area lengths. //
		float radius= scan.nextFloat();
		float pi= 3.13159f;
		float areaCircle = pi*radius*radius;
		float perimeterCircle= 2*pi*radius;
		System.out.println("The circle's area is"+" "+ areaCircle );
		System.out.println("The circle's perimeter is" + " "+ perimeterCircle);
		
		System.out.println("Enter a triangle's edge lengths please:"); // finding a triangle's perimeter length //
		byte firstEdge = scan.nextByte();
		byte secondEdge= scan.nextByte();
		byte thirdEdge = scan.nextByte();
		int perimeterTriangle = firstEdge + secondEdge + thirdEdge;
		System.out.println("The triangle's perimeter length is"+" "+ perimeterTriangle);
		
		System.out.println("Enter a mile value please :"); // converting mile to kilometer //
		double mileValue = scan.nextDouble();
		double kilometerValue = mileValue*1.6;
		System.out.println("the kilometer value is"+" "+ kilometerValue);
		
		System.out.println("Enter an hour value please:"); // Converting hour to second //
		long hourValue = scan.nextLong();
		long secondValue = hourValue*60*60;
		System.out.println("The second value is"+" "+secondValue);
		
		System.out.println("Enter your favourite symbol please :"); // Making a triangle with a symbol//
		char favouriteSymbol = scan.next().charAt(0);
		System.out.println(" "+" "+favouriteSymbol+" "+" ");
		System.out.println(" "+favouriteSymbol+" "+favouriteSymbol+" ");
		System.out.println(favouriteSymbol+" "+favouriteSymbol+" "+favouriteSymbol);
		
		
		scan.close();
		

		
		
		
		

	}

}
