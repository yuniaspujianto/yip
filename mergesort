
package mergesort;

/*Berikut adalah hasil dari merge sort yang sudah saya buat*/
public class MergeSort {
    public static void main(String[] args) {
        // Gantilah nilai a1 sampai a6 dengan nilai sesuai kebutuhan
        int [] data = {10,20,40,60,30,50};

        System.out.println("Data sebelum diurutkan:"); //data sebelum//
        printArray(data);

        mergeSort(data);

        System.out.println("\nData setelah diurutkan:");//data sesudah//
        printArray(data);
    }

    // Fungsi untuk mengurutkan array dengan Merge Sort
    public static void mergeSort(int[] array) {
        int length = array.length;
        if (length > 1) {
            int mid = length / 2;

            int[] leftArray = new int[mid];
            System.arraycopy(array, 0, leftArray, 0, mid);

            int[] rightArray = new int[length - mid];
            System.arraycopy(array, mid, rightArray, 0, length - mid);

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(array, leftArray, rightArray);
        }
    }

    // Fungsi untuk menggabungkan dua array terurut
    public static void merge(int[] result, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                result[k] = leftArray[i];
                i++;
            } else {
                result[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            result[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            result[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Fungsi untuk menampilkan array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
