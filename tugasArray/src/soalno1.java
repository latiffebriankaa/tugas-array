    import java.util.Scanner;
    
    public class soalno1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine();

        String[] nama = new String[jumlahData];
        int[] nilai = new int[jumlahData];
        double totalNilai = 0;

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("________________________________");
            System.out.println("Mahasiswa Ke : " + (i + 1));
            System.out.print("Nama: ");
            nama[i] = scanner.nextLine();
            System.out.print("Nilai: ");
            nilai[i] = scanner.nextInt();
            scanner.nextLine(); 
            totalNilai += nilai[i];
        }

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No\tNama\tNilai\tStatus");

        for (int i = 0; i < jumlahData; i++) {
            String status = nilai[i] >= 60 ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + "\t" + nama[i] + "\t" + nilai[i] + "\t" + status);
        }

        System.out.println("================================");
        double rataRata = totalNilai / jumlahData;
        System.out.println("Jumlah: " + totalNilai);
        System.out.printf("Nilai Rata-rata: %.1f\n", rataRata);
        
        scanner.close();
    }
}


