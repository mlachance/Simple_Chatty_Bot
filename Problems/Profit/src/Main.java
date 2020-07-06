import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float deposit = scanner.nextInt();
        float interest = scanner.nextInt();
        int goal = scanner.nextInt();
        int years = 0;

        while (deposit < goal) {
            deposit += deposit * interest / 100;
            years++;
        }

        System.out.println(years);
    }
}