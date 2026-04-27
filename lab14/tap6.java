import java.util.Scanner;

public class tap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int number = sc.nextInt();

        int count = 0;
        do {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        } while (number > 0);

        System.out.println("Жұп цифрлар саны: " + count);
    }
}