public class Person {

    public static void main(String[] args) {

        // Exercise 1
        Person ron = new Person("Ron");
        ron.getName();
        ron.setName("Ron Soeum");
        ron.getName();
        ron.sayHello();

        // Exercise 2.a
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));//true
//        System.out.println(person1 == person2);//false

        // Exercise 2.b
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);//true

        // Exercise 2.c
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());// John\nJohn
//        System.out.println(person2.getName());// John\nJohn
//        person2.setName("Jane");
//        System.out.println(person1.getName());// Jane\nJane
//        System.out.println(person2.getName());// Jane\nJane


    }//main


    private static String name;

    // Person constructor
    public Person(String name){
        this.name = name;
    }

    // returns the person's name
    public String getName(){
        System.out.println(name);
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.printf("Hello %s%n", name);
    }















}//class
