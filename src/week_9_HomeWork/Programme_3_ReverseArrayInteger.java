package week_9_HomeWork;

import java.util.Scanner;

public class Programme_3_ReverseArrayInteger {
    public static void main(String[] args) {
        Programme_3_ReverseArrayInteger obj1= new Programme_3_ReverseArrayInteger();
        obj1.method1();

    }

    public void method1(){
        int [] arr = new int []{1,2,3,4,5};
        System.out.println("Original array: ");
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i] + " ");
        }


    }

}


