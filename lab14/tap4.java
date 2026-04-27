import java.util.Scanner;

public class tap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int number = sc.nextInt();

        int max = 0;
        do {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number /= 10;
        } while (number > 0);

        System.out.println("Ең үлкен цифр: " + max);
    }
}