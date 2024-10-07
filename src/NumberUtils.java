import java.util.Random;

public class NumberUtils {
    int[] randomArray;

    public void createArrayWithRandomElements() {
        Random random = new Random();
        int rows = random.nextInt(7) + 3;

        randomArray = new int[rows];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
    }

    public void printArray() {
        System.out.println("Our array: ");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();
    }

    public void printArray(int[] array) {
        System.out.println("Our filtered array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void sort() {
        System.out.println("Sorted array: ");
        for (int i = 0; i < randomArray.length - 1; i++) {
            for (int j = 0; j < randomArray.length - 1; j++) {
                if (randomArray[j] > randomArray[j+1]) {
                    int temp = randomArray[j];
                    randomArray[j] = randomArray[j+1];
                    randomArray[j+1] = temp;
                }
            }
        }
    }

    public void sort(int threshold) {
        int newRows = 0;
        int j = 0;

        for (int i = 0; i < randomArray.length; i++) {
            if (threshold < randomArray[i])
                newRows++;
        }

        if (newRows == 0) {
            System.out.println("Array does not contain any elements less then threshold value: " + threshold);
            return;
        }
        int[] filteredArray = new int[newRows];

        for (int i = 0; i < randomArray.length; i++) {
            if (threshold < randomArray[i]) {
                filteredArray[j] = randomArray[i];
                j++;
            }
        }

        printArray(filteredArray);
    }
}
