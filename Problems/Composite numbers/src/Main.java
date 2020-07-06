import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        if (number < 4L) {
            return false;
        }
        long divisor = 2;
        do {
            if (number % divisor == 0) {
                return true;
            }
            divisor++;
        } while (divisor < number);
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}
