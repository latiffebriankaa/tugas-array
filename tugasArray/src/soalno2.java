    import java.util.ArrayList;
    import java.util.Scanner;
    public class soalno2 {
        public static void main(String[] args) {
            String[][] buah = {
                {"apel", "35000"},
                {"jeruk", "50000"},
                {"mangga", "25000"},
                {"duku", "15000"},
                {"semangka", "20000"}
            };
    
            ArrayList<ItemBelanja> daftarBelanja = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            boolean continueShopping = true;
    
            while (continueShopping) {
                System.out.println("Menu:");
                System.out.println("1. Beli Buah");
                System.out.println("2. Struk Belanja");
                System.out.println("3. Keluar");
                System.out.print("Masukkan pilihan: ");
                int pilihan = scanner.nextInt();
    
                switch (pilihan) {
                    case 1:
                        System.out.print("list harga buah : \n 1.apel \t 35000 \n 2.jeruk\t 50000 \n 3.mangga \t 25000 \n 4.duku \t 15000 \n 5.semangka \t 20000 \n masukan nomor buah yang ingin dibeli :  ");
                        int indexBuah = scanner.nextInt();
                        System.out.print("Masukkan jumlah buah yang ingin di beli : ");
                        int jumlah = scanner.nextInt();
                        String namaBuah = buah[indexBuah][0];
                        int harga = Integer.parseInt(buah[indexBuah][1]);
    
                        daftarBelanja.add(new ItemBelanja(namaBuah, jumlah, harga));
                        break;
    
                    case 2:
                        cetakStruk(daftarBelanja);
                        break;
    
                    case 3:
                        continueShopping = false;
                        break;
    
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
    
            scanner.close();
        }
    
        private static void cetakStruk(ArrayList<ItemBelanja> daftarBelanja) {
            int total = 0;
            System.out.println("Daftar Belanja:");
            System.out.println("========================================");
            System.out.println("No. Nama Buah    Jumlah  Harga   Subtotal");
    
            for (int i = 0; i < daftarBelanja.size(); i++) {
                ItemBelanja item = daftarBelanja.get(i);
                int subtotal = item.jumlah * item.harga;
                total += subtotal;
                System.out.printf("%-2d  %-10s  %-6d  %-7d  %-8d\n", i + 1, item.namaBuah, item.jumlah, item.harga, subtotal);
            }
    
            int discount = (int) (total * 0.15);
            int totalBayar = total - discount;
    
            System.out.println("========================================");
            System.out.printf("Total: %d\n", total);
            System.out.printf("Discount(15%%): %d\n", discount);
            System.out.printf("Total bayar: %d\n", totalBayar);
        }
    
        static class ItemBelanja {
            String namaBuah;
            int jumlah;
            int harga;
    
            ItemBelanja(String namaBuah, int jumlah, int harga) {
                this.namaBuah = namaBuah;
                this.jumlah = jumlah;
                this.harga = harga;
            }
        }
    }
    


