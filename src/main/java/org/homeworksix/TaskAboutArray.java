package org.homeworksix;

import java.util.Random;

public class TaskAboutArray {

    public static void main(String[] args) {
        //получаю на вход массив с числами, количество элементов которое нужно добавить в новый массив
        //новый массив с размером старого массива, и индекс для счетчика элементов
        int[] arrayNumber = {1, 5, 3, 9, 0, 2};
        int countElement = 3;
        int[] newArrayNumber = new int[arrayNumber.length + countElement];
        Random random = new Random();
        //копирую старый массив в новый
        System.arraycopy(arrayNumber, 0, newArrayNumber, 0, arrayNumber.length);
        //пока количество элементов не будет равно нулю добавлять в массив новые числа
        while (countElement != 0){
            newArrayNumber[newArrayNumber.length - countElement] = random.nextInt();
            countElement--;
        }
        //вывожу полученный результат в консоль
        for (int j : newArrayNumber) {
            System.out.println(j);
        }
    }
}
