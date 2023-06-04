class Addition {
    private int result;

    // Constructor
    public Addition(int num1, int num2) {
        result = num1 + num2;
    }

    public int getResult() {
        return result;
    }
}

public class Constructor {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        Addition addition = new Addition(a, b);
        int result = addition.getResult();

        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }
}
