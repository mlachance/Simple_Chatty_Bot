import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long input = scanner.nextLong();
        int theInt = 0;

        while (input > 0) {
            input /= ++theInt;
        }
        System.out.println(theInt);
    }
}