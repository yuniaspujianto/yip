import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] data = {100, 5, 76, 2024, 1000}; // a1=12, a2=34, a3=56, a4=78, a5=90
        // Masukkan angka yang akan dicari
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka yang ingin dicari: ");
            int n = scanner.nextInt();
            
            // Algoritma sequential search
            boolean found = false;
            for (int i = 0; i < data.length; i++) {
                if (data[i] == n) {
                    System.out.println("Angka " + n + " ditemukan pada indeks ke-" + i);
                    found = true;
                    break; 
                }
            }
            if (!found) {
                System.out.println("Angka " + n + " tidak ditemukan dalam data.");
            }
        }
    }
}
