import java.util.Scanner;

class multiple_of_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}