import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemoval {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(24);
        nums.add(24);
        nums.add(28);
        nums.add(25);

        //duplicate removal and sorted
       List<Integer> li= nums.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li);


    }
}
