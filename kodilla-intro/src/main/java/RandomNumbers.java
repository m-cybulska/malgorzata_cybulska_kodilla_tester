import java.util.Random;
public class RandomNumbers {
    public int randomNuber() {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        for (int i = 0; i <= 30; i++) {
            while (sum < 5000) {
                int temp = random.nextInt(30);
                sum += temp;
                result++;
                if (sum >= 5000) {
                    break;
                }
            }

        }
        return result;
    }

}