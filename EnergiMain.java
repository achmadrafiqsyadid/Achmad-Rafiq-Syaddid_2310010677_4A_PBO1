package UAS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnergiMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== EnergiCalculator: Pemantau Konsumsi Listrik Kos ===");

        int jumlah = 0;

        // [14] Error Handling
        try {
            System.out.print("Berapa jumlah perangkat yang ingin Anda cek? ");
            jumlah = input.nextInt();
            input.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("️ Input harus berupa angka. Program dihentikan.");
            return;
        }

        // [13] Array
        EnergiCalculator[] perangkat = new EnergiCalculator[jumlah];

        // [11] Perulangan
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data perangkat ke-" + (i + 1));
            try {
                System.out.print("Nama perangkat       : ");
                String nama = input.nextLine();
                System.out.print("Daya listrik (watt)  : ");
                double daya = input.nextDouble();
                System.out.print("Durasi pemakaian (jam/hari): ");
                double durasi = input.nextDouble();
                input.nextLine();

                // [2] Object → membuat objek dari class
                if (durasi > 8) {
                    perangkat[i] = new PerangkatBoros(nama, daya, durasi);
                } else {
                    perangkat[i] = new EnergiCalculator(nama, daya, durasi);
                }

            } catch (InputMismatchException e) {
                System.out.println("️Input tidak valid. Ulangi data perangkat.");
                input.nextLine(); // clear buffer
                i--; // ulang input perangkat ini
            }
        }

        System.out.println("\n=== Rangkuman Konsumsi Listrik ===");

        for (EnergiCalculator alat : perangkat) {
            alat.tampilkanInfo(); // [9] Polymorphism
        }

        System.out.println("\nTerima kasih telah menggunakan EnergiCalculator!");
        input.close();
    }
}
