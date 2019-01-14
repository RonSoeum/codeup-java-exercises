public class Person {

    public static void main(String[] args) {
        Person ron = new Person();
        ron.setName("Ron");
        ron.getName();
        ron.sayHello();
    }//main


    private String name;

    // returns the person's name
    public String getName(){
        System.out.println(name);
        return name;
    }

    //Person constructor
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.printf("Hello %s%n", name);
    }















}//class
