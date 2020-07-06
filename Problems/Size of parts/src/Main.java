import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get the count of parts
        int count = scanner.nextInt();
        int perfect = 0;
        int larger = 0;
        int smaller = 0;

        for (int i=0;i < count; i++) {
            switch (scanner.nextInt()) {
                case 1:
                    ++larger;
                    break;
                case -1:
                    ++smaller;
                    break;
                default:
                    ++perfect;
            }
        }
        System.out.print(perfect + " " + larger + " " + smaller);
    }
}