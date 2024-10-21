import java.util.ArrayList;

public class Cashier {
    private ArrayList<Item> items;

    public Cashier() {
        items = new ArrayList<>();
    }

    public void addItem(double p, String c, String n, int s) {
        items.add(new Item(c, n, p, s));
        System.out.println("Barang ditambahkan.");
    }

    public void removeItem(String code) {
        for (Item item : items) {
            if (item.getCode().equals(code)) {
                items.remove(item);
                System.out.println("Barang dihapus.");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }

    public void displayTotal() {
        double total = 0.0;

        System.out.println("Daftar Barang :");
        System.out.println("===================================");
        for (Item item : items) {
            double totalItemPrice = item.getTotalPrice();
            System.out.println("Nama Barang         : " + item.getName());
            System.out.println("Kode Barang         : " + item.getCode());
            System.out.println("Harga Barang        : " + item.getItemPrice());
            System.out.println("Jumlah Item         : " + item.getItemStock());
            System.out.println("Total Harga Barang  : " + totalItemPrice);
            System.out.println("===================================");
            total += totalItemPrice;
        }
        System.out.println("Total Belanja : " + total);
    }
    public void prosesPembayaran(double pembayaran) {
        double total = 0.0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }

        if (pembayaran >= total) {
            double kembalian = pembayaran - total;
            System.out.println("===================================");
            System.out.println("Total Belanja : " + total);
            System.out.println("Dibayar : " + pembayaran);
            System.out.println("Kembali : " + kembalian);
        } else {
            System.out.println("Uang tidak cukup. Total belanja : " + total);
        }
    }
}