import java.util.Scanner;

public class Toko11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.println("Program Toko");
        System.out.print("Masukkan nama anda: ");
        String nama = input11.nextLine();

        double totalHargaSebelumDiskon = 0;
        double totalDiskon = 0;

        while (true) {
            System.out.print("Masukkan produk yang anda beli: ");
            String namaProduk = input11.nextLine();

            System.out.print("Banyaknya: ");
            int banyak = input11.nextInt();

            System.out.print("Harga: ");
            double hargaSatuan = input11.nextDouble();

            System.out.print("Diskon (%): ");
            double diskonProduk = input11.nextDouble();

            totalHargaSebelumDiskon += banyak * hargaSatuan;
            totalDiskon += banyak * hargaSatuan * (diskonProduk / 100);

            System.out.print("Apakah anda mau menambahkan produk lagi? (Y/N): ");
            input11.nextLine();
            String tambahProduk = input11.nextLine();

            if (tambahProduk.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.print("Apakah anda punya kartu member? (Y/N): ");
        String isMember = input11.nextLine();
        boolean isMemberStatus = isMember.equalsIgnoreCase("Y");

        double totalHargaSetelahDiskon = totalHargaSebelumDiskon;
        if (isMemberStatus) {
            if (totalHargaSebelumDiskon >= 200000) {
                totalHargaSetelahDiskon = totalHargaSebelumDiskon - (totalHargaSebelumDiskon * 0.10);
            } else {
                totalHargaSetelahDiskon = totalHargaSebelumDiskon - (totalHargaSebelumDiskon * 0.05);
            }
        }

        System.out.println("---------------Total Pembelian---------------");
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Tipe: " + (isMemberStatus ? "Member" : "Non-Member"));
        System.out.println("Total Item Barang yang dibeli: " + totalHargaSebelumDiskon);
        System.out.println("SubTotal = " + totalHargaSebelumDiskon);
        System.out.println("Total Diskon = " + totalDiskon);
        System.out.println("\nTotal yang harus dibayar = " + totalHargaSetelahDiskon);
        System.out.println("------------------------------");
    }
}
