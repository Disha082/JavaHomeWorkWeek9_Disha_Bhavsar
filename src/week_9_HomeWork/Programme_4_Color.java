package week_9_HomeWork;
/*4. Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.*/

import java.util.ArrayList;

public class Programme_4_Color {
    public void method1() {
        //declared array list
        ArrayList<String> list = new ArrayList();
        list.add("Pink");
        list.add("Blue");
        list.add("White");
        list.add("Black");
        for (String data : list) {
            System.out.println(data);

        }
    }
        public static void main (String[]args){
            Programme_4_Color obj2 = new Programme_4_Color();
            obj2.method1();
        }
    }
