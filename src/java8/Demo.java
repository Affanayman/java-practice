import java.util.*;
import java.util.stream.Collectors;



public class Demo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("In other thread"));
        thread.start();
        System.out.println("In main thread");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().map(number -> String.valueOf(numbers));


        List<String> numberStrings = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        numberStrings.forEach(System.out::println);

        System.out.println();


        List<String> numberString2 = numbers.stream()
                .filter(number -> number > 3)
                .map(String::valueOf)
                .collect(Collectors.toList());
        numberString2.forEach(System.out::println);

        System.out.println();


        List<String> evenString = numbers.stream()
                .filter(number -> number > 3)
                .filter(number -> number % 2 == 0)
                .map(String::valueOf)
                .collect(Collectors.toList());
        evenString.forEach(System.out::println);

        System.out.println();

        List<Person> persons = loadPersons();
        List<Person> per = persons.stream()
                //.filter(person -> person.getAge() > 20)
                .collect(Collectors.toList());
        System.out.println(per);

        System.out.println();

        Map<String, Person> personMap=per.stream()
                .collect(Collectors.toMap(Person::getName,person->person));
        System.out.println(personMap);

        List<Person> p=loadPersons();
        Map<Integer, List<Person>> result =p.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(result);
    }


    private static List<Person> loadPersons(){
        List<Person> personlist=new ArrayList<>();
        personlist.add(new Person("Person1",20));
        personlist.add(new Person("person2",21));
        personlist.add(new Person("person3",22));
        personlist.add(new Person("person4",21));
        return personlist;

    }
}