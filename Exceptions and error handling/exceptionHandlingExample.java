public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("abc");
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }
}
