package Day2_constructor.Level1;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ayushi", 22);
        Person p2 = new Person(p1);  // using copy constructor

        System.out.println("Original: " + p1.name + ", " + p1.age);
        System.out.println("Cloned  : " + p2.name + ", " + p2.age);
    }
}
