import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int output = 0;

        while (scanner.hasNext()) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            output += num;
            if (output >= 1000) {
                output -= 1000;
                break;
            }
        }
        System.out.println(output);
    }
}