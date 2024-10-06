package org.homeworkfive;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[]integerArray = {3, 8, 1, 9, 4, 2, 7, 6, 5};
//        SortedByMergeSort byMergeSort = new SortedByMergeSort();
//        int [] result = byMergeSort.sortedByMerge(integerArray);
//        System.out.println(Arrays.toString(result));

        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 35),
                new Person("Eve", 28)
        };
        SortedObject sortedObject = new SortedObject();
        sortedObject.mergeSorted(people, 0, people.length - 1);
        for(Person person : people){
            System.out.println(person);
        }
    }
}
