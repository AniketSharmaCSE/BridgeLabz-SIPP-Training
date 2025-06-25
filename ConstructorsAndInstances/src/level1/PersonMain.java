package level1;
public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1); // Cloning

        p1.display();
        p2.display();
    }
}
