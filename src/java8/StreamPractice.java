import java.util.Arrays;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<Double> nums= Arrays.asList(1.2,2.2,22.0);
        double avg=nums.stream()
                .mapToDouble(x->x.doubleValue())
                .average().
                orElseThrow(()-> new CustomException("invalid"));
        System.out.println(avg);
    }
}



