import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char prefix = input.toLowerCase().charAt(0);

        boolean hasJ = prefix == 'j';

        System.out.println(hasJ);

    }
}