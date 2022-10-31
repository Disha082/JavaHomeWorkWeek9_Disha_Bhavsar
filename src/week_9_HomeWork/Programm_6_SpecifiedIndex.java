package week_9_HomeWork;
/*Write a Java program to retrieve an element (at a specified index) from a given
        array list*/

import java.util.ArrayList;

public class Programm_6_SpecifiedIndex {
    public static void main(String[] args) {

        ArrayList<String>list = new ArrayList();
        list.add("Disha");
        list.add("Shilpa");
        list.add("Manish");
        list.add("Viral");
        list.add("Vaibhavi");
        //getting value "Viral" in console
        System.out.println(list.get(4));
    }
}
