import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int bridgeCount = scanner.nextInt();
        int bridgeNumber = 1;
        int bridgeHeight;
        boolean crashed = false;

        for (; bridgeNumber <= bridgeCount; bridgeNumber++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= height) {
                crashed = true;
                break;
            }
        }

        System.out.println(
                crashed ? "Will crash on bridge " + bridgeNumber :
                        "Will not crash"
        );
    }
}