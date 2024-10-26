import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean isPositive = checkPositiveInteger(a);
        System.out.println(isPositive);
    }

    static boolean checkPositiveInteger(int a) {
        return a > 0;
    }
}