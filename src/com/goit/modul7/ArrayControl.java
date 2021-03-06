package com.goit.modul7;


import java.util.Arrays;
import java.util.Random;

public class ArrayControl {
    public int[] array;
    private int minValue;
    private int maxValue;

    ArrayControl(int size){

        this.array = new int[size];
    }

    public void fillingArray(int renge){
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(renge)-(renge/2); //Golden hammer Решение: передавать диапазлн в ввиде входных параметров метода
        }
    }

    public void printArray(){
        System.out.println(Arrays.toString(array));
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public int foundMin(){
        int min = array[0];

        for(int i = 1; i < array.length; i++){
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int foundMax(){
        int max = array[0];

        for(int i = 1; i < array.length; i++){
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public void foundMinMax(){
        int min, max;
        min = max = array[0];

        for(int i = 1; i < array.length; i++){
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        this.minValue = min;
        this.maxValue = max;
    }

    public void sortInsert() {
        for(int j = 1; j<=array.length-1; j++) {
            int key = array[j];

            for(int i=j-1; i>=0 && array[i]>key; i--) {
                array[i+1] = array[i];
                array[i]=key;
            }
        }
    }








}
