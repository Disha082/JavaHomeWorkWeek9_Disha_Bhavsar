package week_9_HomeWork;
/*9. Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map*/
import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMap {
    public static void main(String[] args) {
        Map<Integer,String> people = new HashMap<>();
        people.put(1, "Jahnvi");
        people.put(2, "Johan");
        people.put(3, "Smith");
        people.put(4, "Mical");
        people.put(5, "Vibha");
        people.put(6, "Anjalika");

        for (Map.Entry<Integer, String> name : people.entrySet()){
            System.out.println(name);
        }

    }
}
