
package menurestaurant;

// Class Menu Input Mankanan dan Minuman
class Menu {
    String name; // 
    double price;
    String category;
    
    public Menu(String name, double price, String category) {
        this.name = name; // Nama Produk
        this.price = price; // Harga
        this.category = category;// Makanan/Minuman
    }
    
    public String getMenuInfo(){
        return name + "- Rp" + price;
    }  
}
//Class Utama Main Daftar Menu Makanana dan Minuman
public class Main {

    public static void main(String[] args) {
       // Daftar Menu Makanan
        Menu[] foodMenu = {
            new Menu("Nasi Goreng", 15000, "Makanan"),
            new Menu("Belut Goreng", 20000, "Makanan"),
            new Menu("Sate Ayam", 17000, "Makanan"),
            new Menu("Bakso", 65000, "Makanan")
        };

        // Daftar Menu Minuman
        Menu[] drinkMenu = {
            new Menu("Teh Manis", 8000, "Minuman"),
            new Menu("Minumana Legen", 10000, "Minuman"),
            new Menu("Jus Jeruk", 30000, "Minuman"),
            new Menu("Es Kelapa", 10000, "Minuman")
        };

        // Menampilkan Daftar Menu Makanan dan Minuman
        System.out.println("=== Daftar Menu ===");
        System.out.println("\nMakanan:");
        for (Menu food : foodMenu) {
            System.out.println(food.getMenuInfo());
        }
        System.out.println("\nMinuman:");
        for (Menu drink : drinkMenu) {
            System.out.println(drink.getMenuInfo());
        }
        // Input Pemesanan Manual 
        Menu orderedFood = foodMenu[3]; //Bakso > 100K
        Menu orderedDrink = drinkMenu[2]; //Jus Jeruk > 50K pasti diskon
        int quantityFood = 2; // Memesan 2 porsi Nasi Goreng
        int quantityDrink = 2; // Memesan 2 Jus Jeruk

          // Menghitung Total  Pesanan dengan Pajak, Diskon, dan Penawaran Khusus
        double[] costs = calculateTotal(orderedFood, orderedDrink, quantityFood, quantityDrink);

        // Mencetak Struk Pemesanan
        printReceipt(orderedFood, orderedDrink, quantityFood, quantityDrink, costs);
    }

    // Method Menghitung Total Biaya Pesanan dengan Pajak, Diskon, dan Penawaran
    public static double[] calculateTotal(Menu food, Menu drink, int qtyFood, int qtyDrink) {
        double totalFoodCost = food.price * qtyFood;
        double totalDrinkCost = drink.price * qtyDrink;

        // Total Biaya Awal
        double subtotal = totalFoodCost + totalDrinkCost;

        // Pajak 10%
        double tax = 0.1 * subtotal;

        // Biaya pelayanan
        double serviceCharge = 20000;

        // Diskon 10% jika total biaya melebihi Rp 100.000
        double discount = 0;
        if (subtotal > 100000) {
            discount = 0.1 * subtotal;
        }

        // Penawaran Beli Satu Gratis Satu untuk Minuman 
        double drinkOffer = 0;
        if (subtotal > 50000 && qtyDrink >= 2) {
            drinkOffer = drink.price; // Harga satu minuman gratis
        }

        // Menghitung Total akhir dengan Pajak, Biaya pelayanan, Diskon, dan Penawaran
        double total = subtotal + tax + serviceCharge - discount - drinkOffer;

        return new double[] {subtotal, tax, serviceCharge, discount, drinkOffer, total};
    }

      // Method Mencetak Struk Pesanan
    public static void printReceipt(Menu food, Menu drink, int qtyFood, int qtyDrink, double[] costs) {
        System.out.println("\n=== Struk Pesanan ===");
        System.out.println("Pesanan:");
        System.out.println(food.name + " x " + qtyFood + " - Harga per item: Rp." + (int) food.price + " - Total: Rp." + (int)(food.price * qtyFood));
        System.out.println(drink.name + " x " + qtyDrink + " - Harga per item: Rp." + (int) drink.price + " - Total: Rp." + (int)(drink.price * qtyDrink));
        
        System.out.println("\nSubtotal: Rp." + (int) costs[0]);
        System.out.println("Pajak (10%): Rp." + (int) costs[1]);
        System.out.println("Biaya Pelayanan: Rp." + (int) costs[2]);
        
        // Diskon
        if (costs[3] > 0) {
            System.out.println("Diskon (10%): -Rp." + (int) costs[3]);
        }

        // Penawaran Beli Satu Gratis Satu
        if (costs[4] > 0) {
            System.out.println("Penawaran (Beli 1 Gratis 1 Minuman): -Rp." + (int) costs[4]);
        }

        System.out.println("\nTotal Biaya Keseluruhan: Rp." + (int) costs[5]);
        System.out.println("=====================");
        System.out.println("Terima kasih telah memesan!");
    }
}