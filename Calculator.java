public class Calculator {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        int sum, sub, mul, quo, rem;
        System.out.println("Choose your operation: + , - , * , / ");
        char choice = '*';
        switch (choice) {
            case '+':
                sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
                break;
            case '-':
                sub = num1 - num2;
                System.out.println("The difference of " + num1 + " and " + num2 + " is: " + sub);
                break;
            case '*':
                mul = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is: " + mul);
                break;
            case '/':
                quo = num1 / num2;
                rem = num1 % num2;
                System.out.println("the quotient of " + num1 + " and " + num2 + " is: " + quo + " and remainder is " + rem);
                break;
        }

    }

}
