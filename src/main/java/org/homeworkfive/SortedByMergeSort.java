package org.homeworkfive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedByMergeSort {

    public int [] sortedByMerge(int[] arrayNumber){
        int []firstHalf = Arrays.copyOf(arrayNumber, arrayNumber.length);
        int []secondHalf = new int[arrayNumber.length];
        int [] result = mergeSorted(firstHalf, secondHalf, 0, arrayNumber.length);
        return result;
    }

    public int [] mergeSorted(int[]firstArray, int[]secondArray, int start, int end){
        if (start >= end - 1) {
            return firstArray;
        }
        int middle = start + (end - start) / 2;
        int[]arrayNumberOne = mergeSorted(firstArray, secondArray, start, middle);
        int[]arrayNumberTwo = mergeSorted(firstArray, secondArray, middle, end);

        int startIndex = start;
        int endIndex = middle;
        int index = start;
        int []resultArray = arrayNumberOne == firstArray ? secondArray : firstArray;
        while (startIndex < middle && endIndex < end){
            resultArray[index++] = arrayNumberOne[startIndex] < arrayNumberTwo[endIndex]
                    ? arrayNumberOne[startIndex++] : arrayNumberTwo[endIndex++];
        }
        while (startIndex < middle){
            resultArray[index++] = arrayNumberOne[startIndex++];
        }
        while (endIndex < end){
            resultArray[index++] = arrayNumberTwo[endIndex++];
        }
        return resultArray;
    }
}
