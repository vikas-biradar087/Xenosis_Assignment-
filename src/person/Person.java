package person;

public class Person {
	
	// Properties of the Person class
	private String name;
	
	private int age;

	// constructor to initialize to properties
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// method to display a details of the person
	public void displayDetails() {
		
		System.out.println("Name :" +" "+name);
		System.out.println("age  :" +" "+age);
	}
	
	
	public static void main(String[] args) {
	
		//Instantiate an object of the Person class
		Person p=new Person("Mahi", 43);
		
		// call to the displayDetails method
		p.displayDetails();

	}
	
	

}
