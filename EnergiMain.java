package UAS;

import java.util.Scanner;

public class EnergiMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EnergiCalculator[] alat = new EnergiCalculator[2];

        System.out.println("Masukkan data 2 perangkat elektronik:\n");

        for (int i = 0; i < alat.length; i++) {
            try {
                System.out.println("Perangkat ke-" + (i + 1));
                System.out.print("Nama: ");
                String nama = input.nextLine();

                System.out.print("Daya (Watt): ");
                double daya = Double.parseDouble(input.nextLine());

                System.out.print("Durasi Pemakaian (jam): ");
                double durasi = Double.parseDouble(input.nextLine());

                alat[i] = new EnergiCalculator(nama, daya, durasi);
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Silakan masukkan angka yang benar.\n");
                i--; // ulang input untuk index ini
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage() + "\n");
                i--;
            }
        }

        System.out.println("\nInformasi Penggunaan Energi:\n");

        for (EnergiCalculator a : alat) {
            System.out.println(a.getInfo());
            if (PerangkatBoros.cekBoros(a)) {
                System.out.println("Status: Perangkat boros energi.\n");
            } else {
                System.out.println("Status: Perangkat hemat energi.\n");
            }
        }

        input.close();
    }
}
