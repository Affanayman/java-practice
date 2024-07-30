import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<Person> al=new ArrayList<>();
        al.add(new Person("ps1",22));
        al.add(new Person("ps2",23));
        al.add(new Person("ps3",24));
        al.add(new Person("ps4",25));
        for(Person person:al){
            System.out.println(person);
        }

    }
}
