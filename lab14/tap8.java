import java.util.Scanner;

public class tap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        do {
            System.out.print("Сан енгізіңіз (0 тоқтатады): ");
            num = sc.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Қосынды: " + sum);
    }
}