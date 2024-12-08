import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array (data harus terurut)
        int[] data = {100, 500, 760, 3000, 10000}; 
        try (Scanner scanner = new Scanner(System.in)) {
            // Masukan angka yang akan dicari
            System.out.print("Masukkan angka yang ingin dicari: ");
            int n = scanner.nextInt();        
            //Binary search
            int result = binarySearch(data, n);
            if (result != -1) {
                System.out.println("Angka " + n + " ditemukan pada indeks ke-" + result);
            } else {
                System.out.println("Angka " + n + " tidak ditemukan dalam data.");
            }
        }
    }

    // Fungsi untuk melakukan binary search
    public static int binarySearch(int[] data, int target) {
        int left = 0; // Indeks awal
        int right = data.length - 1; // Indeks akhir

        while (left <= right) {
            int mid = left + (right - left) / 2; // Menghindari overflow

            // Memeriksa apakah target ditemukan di tengah
            if (data[mid] == target) {
                return mid; // Kembalikan indeks elemen yang ditemukan
            }

            // Jika target lebih kecil dari data[mid], cari di sisi kiri
            if (target < data[mid]) {
                right = mid - 1;
            }
            // Jika target lebih besar dari data[mid], cari di sisi kanan
            else {
                left = mid + 1;
            }
        }

        return -1; // Target tidak ditemukan
    }
}
