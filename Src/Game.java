import java.util.Arrays;
import java.util.Random;
// Ругби
public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[7];
        int[] array2 = new int[7];
        int sumTeamA = 0;
        int sumTeamB = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(18)+22;
            array2[i] = random.nextInt(18)+22;
            sumTeamA += array1[i];
            sumTeamB += array1[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(sumTeamA);
        System.out.println(sumTeamB);
        System.out.println((double) sumTeamA/array1.length);
        System.out.println((double) sumTeamB/array2.length);
    }



}
