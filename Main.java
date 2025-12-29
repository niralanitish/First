abstract class Animal {
    abstract void sound();   // abstract method
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Main {
    public static void main(String[] args) {

        Animal a = new Dog();   // 🔥 UPCASTING
        Animal b = new Cat();   // 🔥 UPCASTING
        a.sound();              // calls Dog's sound()
        b.sound();              // calls Cat's sound()
    }
}
