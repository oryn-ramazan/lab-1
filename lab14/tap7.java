import java.util.Random;

public class tap7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num;

        do {
            num = rand.nextInt(10); // 0-9
            System.out.println(num);
        } while (num != 0);

        System.out.println("0 шықты, бағдарлама тоқтады");
    }
}