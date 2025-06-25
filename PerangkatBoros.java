package UAS;

// [8] Inheritance & [9] Polymorphism
public class PerangkatBoros extends EnergiCalculator {

    // Constructor
    public PerangkatBoros(String namaAlat, double dayaWatt, double durasiJam) {
        super(namaAlat, dayaWatt, durasiJam);
    }

    // Override method tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("💡 Catatan: Perangkat ini tergolong boros energi karena lama pemakaian tinggi.");
    }
}
