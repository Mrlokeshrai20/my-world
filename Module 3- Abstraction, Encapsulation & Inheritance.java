Question 1: In Java, what is abstraction, and how is it achieved using abstract classes and interfaces?
Provide an example of a Java interface and a class implementing it to illustrate abstraction.



Question 2: Explain encapsulation in the context of Java. Describe how access modifiers (public, private, protected) 
and getter and setter methods can be used for encapsulation in Java. Provide a code example to demonstrate encapsulation.




Question 3: How does inheritance work in Java, and what is the extends keyword used for?
Provide an example of a class hierarchy in Java, showcasing inheritance and method overriding.




Question 4: Create a Java program that demonstrates the concepts of abstraction and encapsulation in a real-world scenario. 
Define an abstract class and multiple concrete classes that extend it. Use encapsulation to protect the internal state of the classes,
and provide methods to interact with the objects.




Question 5: In Java, how does inheritance contribute to polymorphism? Provide a Java code example illustrating a class 
hierarchy with inheritance and demonstrate polymorphic behavior through method overriding.


Question 6:What will be the output of the following Java code related to abstraction?
    abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class AbstractionOutput1 {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}

a) Drawing Circle
b) Drawing Shape
c) Compilation Error
d) Runtime Error


Question 7:What will be the output of the following Java code related to encapsulation?
  class Employee {
    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationOutput2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John Doe");
        System.out.println(emp.getName());
    }
}

a) John Doe
b) null
c) Compilation Error
d) Runtime Error


Question 8: What is the purpose of the super keyword in Java?

a) To call the superclass constructor
b) To access the superclass members
c) Both a and b
d) Neither a nor b

Question 9: Which of the following is an example of an abstract class?

a) interface
b) abstract interface
c) abstract class
d) concrete class

Question 10: How does encapsulation contribute to code design in Java?

a) By hiding implementation details
b) By allowing multiple inheritances
c) By providing default implementations
d) By creating instances of classes

  

