import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);// reference memory location
        System.out.println(Arrays.toString(numbers));


        Person person1 = new Person("John");
        Person person2 = new Person("Ron");
        Person person3 = new Person("Eric");

        Person[] people1 = new Person[3];
        people1[0] = person1;
        people1[1] = person2;
        people1[2] = person3;

        for(Person person: people1){
            person.getName();
            System.out.println("===============\n");
        }



        Person person4 = new Person("Sam");
        Person[] people2 = addPerson(people1, person4);// returns the new array, how to access it?

        for(Person person: people2){
            person.getName();
            System.out.println("***************\n");
        }

    }// main

    public static Person[] addPerson(Person[] peopleArray, Person person){
        Person[] people2 = Arrays.copyOf(peopleArray, peopleArray.length + 1);
        people2[people2.length - 1] = person;
        return people2;
    }

}// class
