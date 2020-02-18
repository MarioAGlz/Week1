import animals.Dog;
import animals.Person;

public class MainWeek1 {

	public static void main(String[] args) {

		Dog myFirstPuppy = new Dog();
		
		System.out.println(" -- My First dog --");
		System.out.println(myFirstPuppy.name);
		System.out.println(myFirstPuppy.age);
		
		Dog mySecondPuppy = new Dog();
		mySecondPuppy.name = "Snowball";
		mySecondPuppy.age = 4;
		
		System.out.println(" -- My Second dog --");
		System.out.println(mySecondPuppy.name);
		System.out.println(mySecondPuppy.age);
		
		Person person1 = new Person();
		System.out.println("\n -- First person --");
		System.out.println(person1.name);
		System.out.println(person1.age=38);
		System.out.print("Create: ");
		person1.create("A book");
		
		Person person2 = new Person();
		person2.name = "Serge";
		System.out.println("\n -- Second person --");
		System.out.println(person2.name);
		System.out.println(person2.age=43);
		System.out.print("Create: ");
		person1.create("A new car");
		
	}
}
