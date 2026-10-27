import java.util.Scanner;

public class Rekap08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
        } while (jumlahToko < 1);
        int totalBarangSemua = 0;
        int barangTerbanyak = -1;
        int tokoTerbaik = 0;
        for (int i = 1; i <= jumlahToko; i++) {
            int pelanggan;
            do {
                System.out.print("Jumlah pelanggan toko " + i + ": ");
                pelanggan = sc.nextInt();
            } while (pelanggan < 0);
            int totalBarangToko = 0;
            for (int j = 1; j <= pelanggan; j++) {
                int barang;
                do {
                    System.out.print("Barang pelanggan " + j + ": ");
                    barang = sc.nextInt();
                } while (barang < 0);
                totalBarangToko += barang;
            }
            totalBarangSemua += totalBarangToko;
            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbaik = i;
            System.out.println("Toko " + i + " - pelanggan: " + pelanggan + ", total barang: " + totalBarangToko);
            }
        }
        System.out.println("Total barang seluruh toko: " + totalBarangSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        sc.close();
    }
}
