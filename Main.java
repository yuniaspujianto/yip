package belajar1;

public class Main {
    String[] namaMenu = {
        "Iga Bakar", "Bebek Goreng", "Sate Kambing", "Ayam Bakar",
        "Lemon Tea", "Jus Jeruk", "Kopi Hitam", "Air Mineral"
    };
    int[] hargaMenu = {
        50000, 35000, 45000, 30000,
        15000, 25000, 18000, 8000
    };
    String[] kategoriMenu = {
        "Makanan", "Makanan", "Makanan", "Makanan",
        "Minuman", "Minuman", "Minuman", "Minuman"
    };

    // ====================== TAMPILKAN MENU ======================
    public void tampilkanMenu() {
        System.out.println("============= DAFTAR MENU RESTORAN YUNIAS =============");
        System.out.printf("%-3s %-10s %-20s %-10s%n", "No", "Kategori", "Nama Menu", "Harga");

        // Tanpa perulangan, manual tampilkan
        System.out.printf("%-3d %-10s %-20s Rp%-10d%n", 1, kategoriMenu[0], namaMenu[0], hargaMenu[0]);
        System.out.printf("%-3d %-10s %-20s Rp%-10d%n", 2, kategoriMenu[1], namaMenu[1], hargaMenu[1]);
        System.out.printf("%-3d %-10s %-20s Rp%-10d%n", 3, kategoriMenu[2], namaMenu[2], hargaMenu[2]);
        System.out.printf("%-3d %-10s %-20s Rp%-10d%n", 4, kategoriMenu[3], namaMenu[3], hargaMenu[3]);
        System.out.printf("%-3d %-10s %-20s Rp%-10d%n", 5, kategoriMenu[4], namaMenu[4], hargaMenu[4]);
        System.out.printf("%-3d %-10s %-20s Rp%-10d%n", 6, kategoriMenu[5], namaMenu[5], hargaMenu[5]);
        System.out.printf("%-3d %-10s %-20s Rp%-10d%n", 7, kategoriMenu[6], namaMenu[6], hargaMenu[6]);
        System.out.printf("%-3d %-10s %-20s Rp%-10d%n", 8, kategoriMenu[7], namaMenu[7], hargaMenu[7]);
        System.out.println("=======================================================");
    }

    // ====================== CETAK STRUK PEMBAYARAN ======================
    public void cetakStruk(String[] pesananNama, int[] pesananJumlah, int jumlahMenu) {
        int total = 0;

        System.out.println("\n==================== STRUK PEMBAYARAN ====================");
        System.out.printf("%-20s %-10s %-10s%n", "Nama Menu", "Jumlah", "Subtotal");

        // Proses maksimal 4 pesanan (tanpa perulangan)
        if (jumlahMenu > 0) total += hitungItem(pesananNama[0], pesananJumlah[0]);
        if (jumlahMenu > 1) total += hitungItem(pesananNama[1], pesananJumlah[1]);
        if (jumlahMenu > 2) total += hitungItem(pesananNama[2], pesananJumlah[2]);
        if (jumlahMenu > 3) total += hitungItem(pesananNama[3], pesananJumlah[3]);

        double pajak = total * 0.10;
        int biayaPelayanan = 20000;
        double totalAkhir = total + pajak + biayaPelayanan;

        // Diskon 10% jika total > 100.000
        if (total > 100000) {
            double diskon = totalAkhir * 0.10;
            totalAkhir -= diskon;
            System.out.printf("\nDiskon 10%%     : -Rp%.0f", diskon);
        }

        // Promo minuman buy 1 get 1 jika total > 50.000
        if (total > 50000) {
            System.out.println("\nPromo Buy 1 Get 1 untuk minuman diterapkan!");
        }

        // Cetak ringkasan
        System.out.printf("\nTotal Pesanan : Rp%d%n", total);
        System.out.printf("Pajak (10%%)   : Rp%.0f%n", pajak);
        System.out.printf("Pelayanan     : Rp%d%n", biayaPelayanan);
        System.out.println("=========================================================");
        System.out.printf("TOTAL BAYAR   : Rp%.0f%n", totalAkhir);
        System.out.println("=========================================================");
    }

    // ====================== HITUNG ITEM PESANAN ======================
    private int hitungItem(String nama, int jumlah) {
        int harga = 0;

        if (nama == null) return 0;

        // Gunakan if-else (tanpa perulangan)
        if (nama.equalsIgnoreCase("Iga Bakar")) harga = hargaMenu[0];
        else if (nama.equalsIgnoreCase("Bebek Goreng")) harga = hargaMenu[1];
        else if (nama.equalsIgnoreCase("Sate Kambing")) harga = hargaMenu[2];
        else if (nama.equalsIgnoreCase("Ayam Bakar")) harga = hargaMenu[3];
        else if (nama.equalsIgnoreCase("Lemon Tea")) harga = hargaMenu[4];
        else if (nama.equalsIgnoreCase("Jus Jeruk")) harga = hargaMenu[5];
        else if (nama.equalsIgnoreCase("Kopi Hitam")) harga = hargaMenu[6];
        else if (nama.equalsIgnoreCase("Air Mineral")) harga = hargaMenu[7];
        else {
            // Pesan error jika nama tidak ditemukan
            System.out.println("⚠️  Menu \"" + nama + "\" tidak ditemukan di daftar menu! Pesanan ini dilewati.");
            return 0;
        }

        int subtotal = harga * jumlah;
        System.out.printf("%-20s %-10d Rp%-10d%n", nama, jumlah, subtotal);
        return subtotal;
    }
}


//latihan:
//	void tampilkanInfo() {
//
//		System.out.println("Nama Menu: "+ nama);
//		System.out.println("Harga: Rp. "+ harga);
//		System.out.println("Kategori: "+ kategori);
//		System.out.println("--------------------------");
//		
//	}
	
//	void promoDiskon() {
//		double hargaDiskon = harga * 0.9;
//		System.out.println("Harga Setelah diskon 10% untuk" + nama + "adalah Rp. " + hargaDiskon);
//		System.out.println("--------------------------");
//		
//	}

//	void hitungTotal (int jumlah) {
//		double total = harga * jumlah;
//		System.out.println("Total Harga untuk " + jumlah + " porsi "+ nama + " adalaha Rp" + total);
//		System.out.println("--------------------------");
//		
//	}
	

	