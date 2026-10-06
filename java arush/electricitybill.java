import java.util.Scanner;

public class electricitybill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        int rate;

        if (units <= 100) {
            rate = 5;
        } else if (units <= 200) {
            rate = 7;
        } else if (units <= 300) {
            rate = 10;
        } else {
            rate = 12;
        }

        int bill = units * rate;

        System.out.println("Electricity Bill: ₹" + bill);

        sc.close();
    }
}
