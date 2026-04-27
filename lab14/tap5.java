import java.util.Scanner;

public class tap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int number = sc.nextInt();

        int original = number;
        int reversed = 0;

        do {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        } while (number > 0);

        if (original == reversed)
            System.out.println("Палиндром");
        else
            System.out.println("Палиндром емес");
    }
}