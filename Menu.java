package belajar1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main restoran = new Main();

        restoran.tampilkanMenu();
        System.out.println("\nMasukkan Format Pesanan Contoh: Ayam Bakar = 2");
        System.out.println("Tekan Enter jika tidak ingin menambah pesanan.\n");

        // Array untuk menampung pesanan (maks 4)
        String[] namaPesanan = new String[4];
        int[] jumlahPesanan = new int[4];

        // === Input Pesanan 1 ===
        System.out.print("Pesanan 1: ");
        String p1 = input.nextLine();
        if (!p1.isEmpty()) {
            String[] b1 = p1.split("=");
            if (b1.length == 2) {
                namaPesanan[0] = b1[0].trim();
                jumlahPesanan[0] = Integer.parseInt(b1[1].trim());
            }
        }

        // === Input Pesanan 2 ===
        System.out.print("Pesanan 2: ");
        String p2 = input.nextLine();
        if (!p2.isEmpty()) {
            String[] b2 = p2.split("=");
            if (b2.length == 2) {
                namaPesanan[1] = b2[0].trim();
                jumlahPesanan[1] = Integer.parseInt(b2[1].trim());
            }
        }

        // === Input Pesanan 3 ===
        System.out.print("Pesanan 3: ");
        String p3 = input.nextLine();
        if (!p3.isEmpty()) {
            String[] b3 = p3.split("=");
            if (b3.length == 2) {
                namaPesanan[2] = b3[0].trim();
                jumlahPesanan[2] = Integer.parseInt(b3[1].trim());
            }
        }

        // === Input Pesanan 4 ===
        System.out.print("Pesanan 4: ");
        String p4 = input.nextLine();
        if (!p4.isEmpty()) {
            String[] b4 = p4.split("=");
            if (b4.length == 2) {
                namaPesanan[3] = b4[0].trim();
                jumlahPesanan[3] = Integer.parseInt(b4[1].trim());
            }
        }

        // Hitung berapa menu yang benar-benar dipesan
        int jumlahMenuDipesan = 0;
        if (namaPesanan[0] != null) jumlahMenuDipesan++;
        if (namaPesanan[1] != null) jumlahMenuDipesan++;
        if (namaPesanan[2] != null) jumlahMenuDipesan++;
        if (namaPesanan[3] != null) jumlahMenuDipesan++;

        restoran.cetakStruk(namaPesanan, jumlahPesanan, jumlahMenuDipesan);

        input.close();
    }
}


//
//public class MainMenu {
//
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Menu nasiGoreng = new Menu();
//		nasiGoreng.nama = "Nasi Goreng";
//		nasiGoreng.harga = 25000;
//		nasiGoreng.kategori = "makanan";
//		Menu restoran = new Menu();
//		
//		restoran.tampilkanMenu();
		
//		Menu esTeh = new Menu();
//		
//		esTeh.nama = "Es Teh Manis";
//		esTeh.harga = 5000;
//		esTeh.kategori = "minuman";

		
//		System.out.println("=======Daftar Menu Restoran======");
//		nasiGoreng.tampilkanInfo();
//		nasiGoreng.hitungTotal(4);

		
//		nasiGoreng.promoDiskon();
		//		esTeh.tampilkanInfo();
		