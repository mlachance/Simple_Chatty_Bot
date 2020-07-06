import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String inputInLower = input.toLowerCase();

        boolean hasBurg = inputInLower.endsWith("burg");

        System.out.println(hasBurg);

    }
}