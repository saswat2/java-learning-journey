class Animal01{

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog01 extends Animal01 {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class AnimalApplication {

    public static void main(String[] args) {

        Animal01 animal = new Dog01();
        animal.sound();
    }
}