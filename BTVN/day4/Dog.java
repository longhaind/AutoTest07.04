package day4;

public class Dog {
	String breed;
	String size;
	String color;
	int age;
	
	public String  getInformation() 
	{
		return "Breed is: " + breed + "Size is: " + size +"Color is: " + color + "Age is: " + age ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog beggie = new Dog();
		beggie.breed = "Beggie";
		beggie.size = "Big";
		beggie.age =  2;
		beggie.color =  "Brown";
		System.out.println(beggie.getInformation());
		
		Dog Bull = new Dog();
		Bull.breed = "Bull";
		Bull.size = "Big";
		Bull.color = "Black";
		Bull.age = 1;
		System.out.println(Bull.getInformation());
		
		Dog fox = new Dog();
		fox.breed = "fox";
		fox.size = "Small";
		fox.age = 1;
		fox.color = "Brown";
		System.out.println(fox.getInformation());
	}

}
