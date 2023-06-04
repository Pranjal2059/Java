class Addition {
    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }
}

public class Overloading {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        Addition addition = new Addition();

        int z = addition.add(x, y);
        System.out.println("The sum of " + x + " and " + y + " is: " + z);

        int result = addition.add(x, y, z);
        System.out.println("The sum of " + x + ", " + y + ", and " + z + " is: " + result);
    }
}
