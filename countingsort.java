package countings;

public class CountingSort {
    public static void main(String[] args) {
        // Tentukan nilai a1 hingga a6
        int a1 = 50, a2 = 20, a3 = 30, a4 = 60, a5 = 40, a6 = 10;
        int[] data = {a1, a2, a3, a4, a5, a6};
        
        // Cetak data sebelum diurutkan
        System.out.println("Data sebelum diurutkan:");
        printArray(data);
        countingSort(data);

        // Cetak data setelah diurutkan
        System.out.println("Data setelah diurutkan:");
        printArray(data);
    }

    // Fungsi Counting Sort
    public static void countingSort(int[] array) {
        int max = findMax(array);
        int[] count = new int[max + 1];
        for (int num : array) {
            count[num]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Fungsi untuk mencetak array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
