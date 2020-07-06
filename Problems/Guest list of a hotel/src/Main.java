import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            result.insert(0, scanner.next() + "\n");
        }
        System.out.print(result);
    }
}