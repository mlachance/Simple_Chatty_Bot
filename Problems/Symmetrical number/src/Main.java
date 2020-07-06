import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int ones = input % 10;
        int tens = (input / 10) % 10;
        int hundreds = (input / 100) % 10;
        int thousands = (input / 1000) % 10;

        if (ones == thousands && tens == hundreds) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

    }
}