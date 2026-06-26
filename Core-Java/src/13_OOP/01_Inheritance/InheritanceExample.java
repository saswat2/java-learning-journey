// Parent class
class Animal {
    void eat(){
        System.out.println("Animal is eating......");
    }
}
// child class
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking.....");
    }
}

// main class
public class InheritanceExample {
    public static void main(String[] args){

        //object Creation
        Dog d1 = new Dog();

        // calling parent class method
        d1.eat();

        //Calling Child class method

        d1.bark();
    }
}