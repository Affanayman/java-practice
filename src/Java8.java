import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Java8 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 35, 34, 44);
        List<String> ns = nums.stream().filter(x -> x > 5).filter(x -> x % 2 == 0).map(String::valueOf).collect(Collectors.toList());
        ns.forEach(System.out::println);
    }
}
