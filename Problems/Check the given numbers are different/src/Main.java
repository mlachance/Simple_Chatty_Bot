import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int val01 = scanner.nextInt();
        int val02 = scanner.nextInt();
        int val03 = scanner.nextInt();
        
        boolean unique = val01 != val02 && val01 != val03 && val02 != val03;

        System.out.println(unique);

    }
}
