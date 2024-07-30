import java.util.Map;
import java.util.TreeMap;

public class TreemapExample {
    public static void main(String[] args) {
        Map<Person,String> map=new TreeMap<>(new PersonComparator());
        map.put(new Person("abc2",13),"string1");
        map.put(new Person("abc1",10),"string2");
        map.put(new Person("abc3",5),"string3");
        System.out.println(map);
    }
}
