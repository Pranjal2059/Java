class MinBalanceException extends Exception {

    public MinBalanceException() {
        System.out.println("Balance is Low");
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            int acc[] = { 100, 120, 234, 344, 432, 234 };
            double balance[] = { 300, 485, 298, 234, 2427.65 };
            for (int i = 0; i <= 5; i++) {
                System.out.println("Account no" + acc[i] + "  " + "Balance:" + balance[i]);
                if (balance[i] < 1000) {
                    throw new MinBalanceException();// throwing user defined exception
                }
            }
        } catch (MinBalanceException e) {
            System.out.println("Exception caught");
        }
    }
}
