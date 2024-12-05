import java.util.Random;

public class Tester {

    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(10, 0, 100);

        Insertion.sort_descrtl(randomArray);

        for(int i: randomArray){
            System.out.println(i);
        }
    }

    private static int[] generateRandomArray(int size, int minValue, int maxValue) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }
        return array;
    }
}
