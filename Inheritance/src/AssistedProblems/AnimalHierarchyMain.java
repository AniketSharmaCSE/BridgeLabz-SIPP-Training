package AssistedProblems;

import AssistedProblems.AnimalHierarchy.Animal;
import AssistedProblems.AnimalHierarchy.Cat;
import AssistedProblems.AnimalHierarchy.Dog;

public class AnimalHierarchyMain {
	 public static void main(String[] args) {
	        Animal a = new Animal("Tommy", 4);
	        Dog d = new Dog("Bruno", 5);
	        Cat c = new Cat("Kitty", 3);

	        a.makesound(); 
	        d.makesound(); 
	        c.makesound(); 
	    }
}
