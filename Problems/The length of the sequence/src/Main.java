import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = -1;
        int input;
        do {
            input = scanner.nextInt();
            count++;
        } while (input != 0);
        System.out.println(count);
    }
}