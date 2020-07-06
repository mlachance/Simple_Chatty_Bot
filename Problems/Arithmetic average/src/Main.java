import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get the count of parts
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int instances = 0;
        double sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                sum += i;
                instances++;
            }
        }
        sum = start - end > 0 ? start - end : start + end;
        System.out.println(sum / instances);
    }
}