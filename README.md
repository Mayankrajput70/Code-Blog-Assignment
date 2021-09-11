# Code-Blog-Assignment
SOLID is a collection of important programming practices that were developed by Robert C. Martin.

## SOLID consists of 5 coding practices:

SRP - Single responsibility principle

OCP - Open/close principle

LSP - Liskov substitution principle

ISP - Interface segregation principle

DIP - Dependency inversion principle

## 1. LSP - Liskov substitution principle
Functions that use pointers or references to base classes must also be able to use class objects that inherit from the base classes without having a thorough knowledge of these objects.

@ When a child Class cannot perform the same actions as its parent Class, this can cause bugs.
@ If you have a Class and create another Class from it, it becomes a parent and the new Class becomes a child. The child Class should be able to do everything the parent Class can do. This process is called Inheritance.
@ The child Class should be able to process the same requests and deliver the same result as the parent Class or it could deliver a result that is of the same type.
## Code implementation of LSP

## Rectangle.java

     public class Rectangle {
        int width, height;
        Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
        int getArea() {
            return width * height;
        }
        @Override
        public String toString() {
            return "Figure(" +
                    "width=" + width +
                    ", height=" + height +
                    ')';
        }
        }

## RectangleFactory.java
         
        public class RectangleFactory {
        @Contract("_ -> new")
        public static @NotNull Rectangle newSquare(int side) {
            return new Rectangle(side, side);
        }
        @Contract("_, _ -> new")
        public static @NotNull Rectangle newRectangle(int width, int height) {
            return new Rectangle(width, height);
        }
        }

## MainLsp.java
    
    public class MainLsp {
    public static void main(String[] args) {
        Rectangle rectangle = RectangleFactory.newRectangle(2, 4);
        Rectangle square = RectangleFactory.newSquare(4);
        showArea(rectangle);
        showArea(square);
    }
    private static void showArea(@NotNull Rectangle figure) {
        System.out.println("Expected area is " + figure.getArea() + " for " + figure);
    }
    }

## Output :-

 Expected area is 8 for Figure(width=2, height=4) 
 Expected area is 16 for Figure(width=4, height=4)

## Goal
This principle aims to enforce consistency so that the parent Class or its child Class can be used in the same way without any errors.

## 2. ISP - Interface segregation principle
ISP says: "Many dedicated interfaces are better than one overall".

The interface should give a specific shape to the class, and the methods that must be implemented within the class should be common to all implementation classes.

## Code implementation of ISP

## OnlineCoustomerImpl.java
       
       public class OnlineCustomerImpl implements OrderInterface, PaymentInterface {
        @Override
        public void placeOrder() {
            System.out.println("Order is Placed");
        }
        @Override
        public void payForOrder() {
            System.out.println("Bill Successfully Paid");
        }
        } 
        

## OrderInterface.java
    
        public interface OrderInterface{
        public void placeOrder();
        }
        
## PaymenInterface.java
        
    public interface PaymentInterface {
    public void payForOrder();
    }

## TelephoneCustomerImpl.java

   public class TelephoneCustomerImpl implements OrderInterface, PaymentInterface {
    @Override
    public void placeOrder() {
        System.out.println("Order is Placed");
    }
    @Override
    public void payForOrder() {

        System.out.println("Bill is Paid");
    }
    }

## WalkInCustomerImpl.java

    public class WalkInCustomerImpl implements OrderInterface, PaymentInterface {
    @Override
    public void placeOrder() {
        System.out.println("Order is Placed");
    }
    @Override
    public void payForOrder() {
        System.out.println("Bill is Paid");
    }
    }
   
## MainIsp.java

    public class MainIsp {
    public static void main(String[] args) {
        OnlineCustomerImpl OCI=new OnlineCustomerImpl();
        OCI.payForOrder();
        OCI.placeOrder();
    }
    }

## Output :-
   
   Bill Successfully Paid
   Order is Placed

## Goal
This principle aims at splitting a set of actions into smaller sets so that a Class executes ONLY the set of actions it requires.

## 3. DIP - Dependency inversion principle
High-level modules should not depend on low-level modules.Both should depend on abstractions.
High-level Module(or Class): Class that executes an action with a tool.
Low-level Module (or Class): The tool that is needed to execute the action

Abstraction: Represents an interface that connects the two Classes
Principle
This principle says a Class should not be fused with the tool it uses to execute an action. Rather, it should be fused to the interface that will allow the tool to connect to the Class.

It also says that both the Class and the interface should not know how the tool works. However, the tool needs to meet the specification of the interface.

## Code implementation of DIP

## Person.java
   
   public class Person {
    public String name;
    public Enum role;
    public Person(String name, Enum role) {
        this.name = name;
        this.role = role;
    }
    }
    
## RealtionshipBrowser.java
    
    public interface RelationshipBrowser {
        List<Person> findAllChildrenOf(Person person);
    }
  Relationship.java
   class Relationships implements RelationshipBrowser {
        public List<Person> findAllChildrenOf(Person person) {

            return relations.stream()
                    .filter(p -> p.role.equals(Role.CHILD))
                    .collect(Collectors.toList());
        }
        private List<Person> relations = new ArrayList<>();
        void addParentAndChild(Person person) {
            relations.add(person);
        }
         }

## Research.java
   
     public class Research {
    Research(Person parent, @NotNull RelationshipBrowser browser) {
        List<Person> children = browser.findAllChildrenOf(parent);
        for (Person child : children)
            System.out.println(parent.name + " has a child called " + child.name);
    }
    @Override
    public String toString() {
        return "Research end";
    }
    }
    
 ## Role.java
 
     public enum Role {
        PARENT,
         CHILD
    }


 ## MainDip.java
 
    public class Dip {
    public static void main(String[] args) {
        Person parent = new Person("Jakob", Role.PARENT);
        Person child1 = new Person("Alex", Role.CHILD);
        Person child2 = new Person("Anna", Role.CHILD);
        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent);
        relationships.addParentAndChild(child1);
        relationships.addParentAndChild(child2);
        Research research = new Research(parent, relationships);
        System.out.println(research);

    }
    }
  
## Output :-
 
     Bill is Paid
     Order is Placed


## Goal
This principle aims at reducing the dependency of a high-level Class on the low-level Class by introducing an interface.
