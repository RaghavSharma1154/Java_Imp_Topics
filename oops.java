import bank.*;
// class Student {
//     //parameterized constructor-->
//     // Student(String name,int age){
//     //     this.name = name;
//     //     this.age = age;
//     // }

//     //copy constructor-->
//     Student(Student s){
//         this.name = s.name;
//         this.age = s.age;
//     }
//     Student(){

//     }
//     String name;
//     int age;
//     public void info(){
//         System.out.println(this.name + " " + this.age);
//     }
// } 
// public class oops {
//     public static void main(String args[]){
//         Student s = new Student();
//         s.name = "jack";
//         s.age = 34;
//         Student s1 = new Student(s);
//         s1.info();
//     }
// }

// class Student{
//     String name;
//     int age;
//     //Compile time polymorphism (Method overloading)
//     public void info(String name){
//         this.name = name;
//         System.out.println(this.name);
//     } 
//     public void info(int age){
//         this.age = age;
//         System.out.println(this.age);
//     }
// }
// class oops{
//     public static void main(String args[]){
//         Student s = new Student();
//         s.info("jack");
//         s.info(45);
//     }
// }

//Inheritance -->
//Single level inheritance -->
class Animal{
    public void eat(String food){
        System.out.println( "he/she is eating " + food);
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println( "he/she is barking");
    }
}
//multilevel inheritance -->
class Husky extends Dog{
    public void breed(){
        System.out.println("its breed is husky");
    }
}

//hierarchical Inheritance -->
class Monkey extends Animal{
    public void jump(){
        System.out.println("Monkey is jumping");
    }
}
//Hybrid inheritance is combination of different different inheritances  

//Abstraction -->
abstract class Shape{
    Shape(){
        System.out.println("Creating a Shape");
    }
    abstract void draw();
    public void ex(){
        System.out.println("this is a non abstract method in a abstract class");
    }
}
class Rectangle extends Shape{
    Rectangle(){
        System.out.println("Creating a Rectangle");
    }
    public void draw(){
        System.out.println("drawing a rectangle");
    }
}

interface Furniture{
    void shape();
}
class Chair implements Furniture{
    public void shape(){
        System.out.println("It has four legs");
    }
}  
class RoundTable implements Furniture{
    public void shape(){
        System.out.println("It is round shape table");
    }
}

public class oops{
    public static void main(String args[]){
        // Monkey m = new Monkey();
        // m.jump();
        // m.eat("banana");

        //package-->
        // bank.Bank acc1 = new bank.Bank();
        // acc1.name = "jack";

        //Abstraction-->
        // Rectangle rc = new Rectangle();
        // rc.draw();

        //Pure Abstraction using Interfaces -->
        Chair ch = new Chair();
        ch.shape();
        RoundTable rd = new RoundTable();
        rd.shape();
    }
}
