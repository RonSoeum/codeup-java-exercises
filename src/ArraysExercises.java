import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);// reference memory location
        System.out.println(Arrays.toString(numbers));

        Person[] people1 = new Person[3];
        people1[0] = new Person("John");
        people1[1] = new Person("Ron");
        people1[2] = new Person("Eric");

        for(Person person: people1){
            person.getName();
            System.out.println("===============\n");
        }

        Person[] people2 = addPerson(people1, new Person("Sam"));

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
