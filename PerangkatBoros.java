package UAS;

public class PerangkatBoros {
    public static boolean cekBoros(EnergiCalculator alat) {
        return alat.hitungEnergi() > 1.0; // misalnya >1 kWh dianggap boros
    }
}
