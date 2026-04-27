import java.util.Scanner;

public class tap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, min = Integer.MAX_VALUE;

        do {
            System.out.print("Сан енгізіңіз (0 тоқтатады): ");
            num = sc.nextInt();

            if (num != 0 && num < min) {
                min = num;
            }

        } while (num != 0);

        if (min == Integer.MAX_VALUE) {
            System.out.println("Сандар енгізілмеді");
        } else {
            System.out.println("Ең кіші сан: " + min);
        }
    }
}