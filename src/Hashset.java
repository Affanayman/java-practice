import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<Person> people=new HashSet<>();
        people.add(new Person("ps1",22));
        people.add(new Person("ps2",21));
        people.add(new Person("ps3",23));
        people.add(new Person("ps4",26));


        for (Person p:people){
            System.out.println(p);
        }

    }
}
