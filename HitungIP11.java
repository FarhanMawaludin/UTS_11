import java.util.Scanner;

public class HitungIP11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input11.nextLine();

        int totalMataKuliah = 0;
        int totalSks = 0;
        int jumlahPerbaikanRemidi = 0;
        double totalNilai = 0.0;
        String lanjutInputNilai = "y";

        
        while (lanjutInputNilai.equalsIgnoreCase("Y")) {
            System.out.print("Nama mata kuliah: ");
            String mataKuliah = input11.nextLine();

            System.out.print("Masukkan indeks nilai (A/B+/B/C+/C/D/E): ");
            String nilai = input11.next();

            System.out.print("Masukkan jumlah SKS: ");
            int sks = input11.nextInt();
            input11.nextLine();

            if (nilai.equalsIgnoreCase("A")) {
                totalNilai += 4.0 * sks;
            } else if (nilai.equalsIgnoreCase("B+")) {
                totalNilai += 3.5 * sks;
            } else if (nilai.equalsIgnoreCase("B")) {
                totalNilai += 3.0 * sks;
            } else if (nilai.equalsIgnoreCase("C+")) {
                totalNilai += 2.5 * sks;
            } else if (nilai.equalsIgnoreCase("C")) {
                totalNilai += 2.0 * sks;
            } else if (nilai.equalsIgnoreCase("D")) {
                totalNilai += 1.0 * sks;
                jumlahPerbaikanRemidi++;
            } else if (nilai.equalsIgnoreCase("E")) {
                totalNilai += 0.0 * sks;
                jumlahPerbaikanRemidi++;
            } else {
                System.out.println("Indeks tidak valid. Masukkan nilai yang valid.");
                continue;
            }

            totalMataKuliah++;
            totalSks += sks;

            System.out.print("Lanjutkan memasukkan nilai? (Y/N): ");
            lanjutInputNilai = input11.nextLine();
        }

        double ipk = (totalNilai / totalSks);
        System.out.println("-------------Hasil Perhitungan IP-------------");
        System.out.println("Nama : " + nama);
        System.out.println("Indeks Prestasi (IP): " + ipk);
        System.out.println("Jumlah Mata Kuliah: " + totalMataKuliah);
        System.out.println("Jumlah SKS: " + totalSks);
        System.out.println("Jumlah MK yang harus diperbaiki: " + jumlahPerbaikanRemidi);
        System.out.println("-----------------------------------------------");
    }
}
