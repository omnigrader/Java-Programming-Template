/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;



import java.util.Scanner;
import java.util.*;

// A class defines the attributes (fields) and capabilities (methods) of a real world object

/**
 *
 * @author Fradina
 */
public class Template {

	// static means this number is shared by all objects of type Animal
	// final means that this value can't be changed
	public static final double FAVNUMBER = 1.6180;
	
	// Variables (Fields) start with a letter, underscore or $
	// Private fields can only be accessed by other methods in the class
	
	// Strings are objects that hold a series of characters
	private String name;
	
	// An integer can hold values from -2 ^ 31 to (2 ^ 31) -1
	private int weight;
	
	// Booleans have a value of true or false
	private boolean hasOwner = false;
	
	// Bytes can hold the values between -128 to 127
	private byte age;
	
	// Longs can hold the values between -2 ^ 63 to (2 ^ 63) - 1
	private long uniqueID;
	
	// Chars are unsigned ints that represent UTF-16 codes from 0 to 65,535
	private char favoriteChar;
	
	// Doubles are 64 bit IEEE 754 floating points with decimal values
	private double speed;
	
	// Floats are 32 bit IEEE 754 floating points with decimal values
	private float height;
	
	// Static variables have the same value for every object 
	// Any variable or function that doesn't make sense for an object to have should be made static
	// protected means that this value can only be accessed by other code in the same package
	// or by subclasses in other packages
	
	protected static int numberOfAnimals = 0;
	
	// A Scanner object allows you to except user input from the keyboard
	static Scanner userInput = new Scanner(System.in);
	
	// Any time an Animal object is created this function called the constructor is called
	// to initialize the object
	public Template(){
		
		// Shorthand for numberOfAnimals = numberOfAnimals + 1;

	
		// print is used to print to the screen, but it doesn't end with a newline \n

		
		// The if statement performs the actions between the { } if the condition is true
		// userInput.hasNextLine() returns true if a String was entered in the keyboard

			// this provides you with a way to refer to the object itself
			// userInput.nextLine() returns the value that was entered at the keyboard

			// hasNextInt, hasNextFloat, hasNextDouble, hasNextBoolean, hasNextByte,
			// hasNextLong, nextInt, nextDouble, nextFloat, nextBoolean, etc.
			

		
	}
	
	// It is good to use getter and setter methods so that you can protect your data
	// In Eclipse Right Click -> Source -> Generate Getter and Setters
	
	public String getName() {
		return name;
	}



	public int getWeight() {
		return weight;
	}


	public boolean isHasOwner() {
		return hasOwner;
	}



	public byte getAge() {
		return age;
	}



	public long getUniqueID() {
		return uniqueID;
	}

	// Method overloading allows you to accept different input with the same method name
	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		
		System.out.println("Unique ID set to: " + this.uniqueID);
	}
	


	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}
	
	public void setFavoriteChar() {
		
		int randomNumber = (int) (Math.random() * 126) + 1;
		
		this.favoriteChar = (char) randomNumber;
		
		// if then else statement
		// > < == != >= <=
		
		// Logical operators
		// ! : Converts the boolean value to its right to its opposite form ie. true to false
		// & : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)
		// && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
		// | : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
		// || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
		// ^ : Returns true if there is 1 true and 1 false boolean value on the right or left
		
		
		
		// The ternary operator assigns one or another value based on a condition
		
		
		// The switch statement is great for when you have a limited number of values
		// and the values are int, byte, or char unless you have Java 7 which allows Strings
		switch(randomNumber){
		
		
		
		}
		
	}

	public double getSpeed() {
		return speed;
	}

	

	public float getHeight() {
		return height;
	}

	

	protected static int getNumberOfAnimals() {
		return numberOfAnimals;
	}

	// Since numberOfAnimals is Static you must set the value using the class name

	
	protected static void countTo(int startingNumber){
		
		
	}
	

	
	protected static void guessMyNumber(){
		
		
		// Do while loops are used when you want to execute the code in the braces at least once
		
		
		System.out.println("Yes the number was 50");
		
	}
	
	// This will be used to demonstrate polymorphism
	public String makeSound(){
		
		return "Grrrr";
		
	}
	
	// With polymorphism we can refer to any Animal and yet use overridden methods 
	// in the specific animal type
	public static void speakAnimal(Template randAnimal){
		
		System.out.println("Animal says " + randAnimal.makeSound());
		
	}

	// public allows other classes to use this method
	// static means that only a class can call for this to execute 
	// void means it doesn't return a value when it finishes executing
	// This method can except Strings that can be stored in the String array args when it is executed
	
	public static void main(String[] args){
		
	
		
		// An array is a fixed series of boxes that contain multiple values of the same data type
		// How you create arrays
		// int[] favoriteNumbers;
		// favoriteNumbers = new int[20];
		
	
		
		String[] stringArray = {"Random", "Words", "Here"};
		
		// for(dataType[] varForRow : arrayName)
		for(String word : stringArray)
		{
			
			System.out.println(word);
			
		}
		
		// This is a multidimensional array
		String[][][] arrayName = { { { "000" }, { "100" }, { "200" }, { "300" } },
			     { { "010" }, { "110" }, { "210" }, { "310" } }, 
				 { { "020" }, { "120" }, { "220" }, { "320" } }};
		
		
		
		// You can copy an array (stringToCopy, indexes to copy)
	
		
		// You can print out the whole array
		
		
		// Returns the index or a negative number
		
			
	}
    
}
