package week_9_HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

public class Progaramm_5_Iterate {
    public void method1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);

        //using iterator
        Iterator itr= list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        Progaramm_5_Iterate obj = new Progaramm_5_Iterate();
        obj.method1();

    }

}
