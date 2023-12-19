1. What is the output of the following code?
String str1 = "hello";
String str2 = new String("hello");
System.out.println(str1 == str2);

a) true

b) false

c) compilation error

d) runtime error


2.Which Java annotation is used to indicate that a method overrides a superclass method?

a) @Override
b) @Overload
c) @OverrideMethod
d) @Overriding


3.Which of the following is an advantage of composition over inheritance?

a) Simplicity and flexibility
b) Code reusability
c) Tighter coupling
d) Easier to implement
  

4.In composition, what relationship exists between the classes involved?

a) "is-a" relationship
b) "has-a" relationship
c) "extends" relationship
d) "implements" relationship


5.In Java, a class can inherit from:

a) Multiple classes
b) Single class only
c) No class
d) Interfaces only



 6. What is the output of the following code?
  class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

a) Animal sound
b) Dog barks
c) Compilation Error
d) Animal sound, Dog barks


7. Inheritance in Java supports:

a) Single inheritance
b) Multiple inheritance
c) Hybrid inheritance
d) All of the above


 8:What is composition in Java?

a) It is a type of inheritance
b) It is a way to achieve polymorphism
c) It is a design technique to create a complex object using simpler objects
d) It is a way to achieve method overloading


  9.What type of relationship does the Car class have with the Engine class?
  class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine carEngine;

    Car(Engine engine) {
        carEngine = engine;
    }

    void startCar() {
        carEngine.start();
    }
}
a) Inheritance
b) Association
c) Composition
d) Polymorphism


10.In Java, what is the purpose of the super keyword?

a) To call the superclass constructor
b) To access the superclass members
c) To instantiate an object
d) To declare static methods
