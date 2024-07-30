import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {
    public static void main(String[] args) {
        Map<Person,Integer> lmap=new LinkedHashMap<>();
        lmap.put(new Person("pers1",10),1);
        lmap.put(new Person("pers2",5),2);
        lmap.put(new Person("pers3",4),8);
        lmap.put(new Person("pers4",3),4);
        lmap.put(new Person("pers4",3),4);
        System.out.println();
        System.out.println(lmap);
        for (Map.Entry<Person, Integer> entry : lmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }
}
