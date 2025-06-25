package UAS;

// [1] Class
public class EnergiCalculator {
    // [3] Atribut
    private String namaAlat;
    private double dayaWatt;
    private double durasiJam;

    // [4] Constructor
    public EnergiCalculator(String namaAlat, double dayaWatt, double durasiJam) {
        this.namaAlat = namaAlat;
        this.dayaWatt = dayaWatt;
        this.durasiJam = durasiJam;
    }

    // [6] Accessor (Getter)
    public String getNamaAlat() {
        return namaAlat;
    }

    public double getDayaWatt() {
        return dayaWatt;
    }

    public double getDurasiJam() {
        return durasiJam;
    }

    // [5] Mutator (Setter)
    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }

    public void setDayaWatt(double dayaWatt) {
        this.dayaWatt = dayaWatt;
    }

    public void setDurasiJam(double durasiJam) {
        this.durasiJam = durasiJam;
    }

    // [7] Encapsulation → atribut dibuat private, akses via method publik

    // Menghitung konsumsi listrik harian (kWh)
    public double hitungKonsumsiHarian() {
        return (dayaWatt * durasiJam) / 1000.0;
    }

    // Menghitung biaya listrik harian
    public double hitungBiayaHarian() {
        return hitungKonsumsiHarian() * 1444.70;
    }

    // Menghitung biaya listrik bulanan
    public double hitungBiayaBulanan() {
        return hitungBiayaHarian() * 30;
    }

    // [10] Seleksi → menentukan status penggunaan
    public String cekStatusPemakaian() {
        return durasiJam > 5 ? "Boros (pemakaian tinggi)" : "Normal";
    }

    // [9] Polymorphism → bisa dioverride di class turunan
    public void tampilkanInfo() {
        System.out.println("Nama Alat       : " + namaAlat);
        System.out.println("Daya Listrik    : " + dayaWatt + " watt");
        System.out.println("Durasi Pakai    : " + durasiJam + " jam per hari");
        System.out.printf("Konsumsi Harian : %.2f kWh\n", hitungKonsumsiHarian());
        System.out.printf("Biaya per Hari  : Rp %.0f\n", hitungBiayaHarian());
        System.out.printf("Biaya per Bulan : Rp %.0f\n", hitungBiayaBulanan());
        System.out.println("Status          : " + cekStatusPemakaian());
        System.out.println("--------------------------------------------");
    }
}
