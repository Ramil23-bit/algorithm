package org.homeworkfive;

import java.util.Arrays;

public class SortedObject {

    public void mergeSorted(Person[]arrayPerson, int start, int end){
        if(start < end){
            int middle = (start + end) / 2;
            mergeSorted(arrayPerson, end, middle);
            mergeSorted(arrayPerson, middle + 1, start);
            merge(arrayPerson, end, middle, start);
        }
    }

    public void merge(Person[] arrayPerson, int end, int middle, int start){
        Person[] startArray = Arrays.copyOfRange(arrayPerson, start, middle + 1);
        Person[] endArray = Arrays.copyOfRange(arrayPerson, middle + 1, end + 1);
        int i = 0;
        int j = 0;
        int k = start;
        while (i < startArray.length && j < endArray.length){
            if(startArray[i].getAge() >= endArray[j].getAge()){
                arrayPerson[k++] = startArray[i++];
            }else {
                arrayPerson[k++] = endArray[j++];
            }
        }
        while (i < startArray.length){
            arrayPerson[k++] = startArray[i++];
        }

        while (j < endArray.length){
            arrayPerson[k] = endArray[j++];
        }
    }
}
