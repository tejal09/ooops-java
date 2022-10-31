//Inheritance 
//Increse the reusability
class Animal {
    public void eat() {
        System.out.println("eating");
    }
}

// Single level inheritance
class Dog extends Animal {
    public void bark() {
        System.out.println("barking");
    }
}
/*
 * //Multilevel inheritance
 * class Puppy extends Dog{
 * public void weep(){
 * System.out.println("weeping");
 * }
 * }
 * 
 * //Hierarchial inheritance
 * class Cat extends Animal{
 * public void meow(){
 * System.out.println("Meow");
 * }
 * }
 * 
 * //Hybrid inheritance
 * //Multiple inheritance > interfaces
 */

public class InheritExample {
    public static void main(String[] args) {
        // Animal ani = new Animal();
        // ani.eat();

        Dog dog = new Dog();
        ((Dog) dog).bark();
    }
}
