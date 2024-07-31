package exception;

public class CustomEx {
    public static void main(String[] args) {
        try {

            throw new CustomException("Something went wrong...");
        } catch (CustomException e) {

            System.out.println("custom exception: " + e.getMessage());
        }
    }
}