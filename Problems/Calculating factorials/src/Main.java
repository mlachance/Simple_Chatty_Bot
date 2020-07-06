import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long counter = 0;
        long sum = 1;
        do {
            sum = sum + sum * counter;
            counter++;
        } while (counter < n);
        return sum;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}