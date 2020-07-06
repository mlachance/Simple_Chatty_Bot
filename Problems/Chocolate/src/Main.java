import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int column = scanner.nextInt();
        int row = scanner.nextInt();
        int squares = scanner.nextInt();


        if (squares < column * row
                && (squares % column == 0 ||
                squares % row == 0)
        ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}