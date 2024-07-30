import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        Set<Person> s=new TreeSet<>(new PersonComparator());
        s.add(new Person("person1",55));
        s.add(new Person("person2",25));
        s.add(new Person("person3",30));
        s.add(new Person("person4",33));
        System.out.println(s);

    }

}
