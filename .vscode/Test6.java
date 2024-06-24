class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");

    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}
 
/**
 * Test6
 */
public class Test6 {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}