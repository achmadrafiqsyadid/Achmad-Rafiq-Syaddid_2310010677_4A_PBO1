package UAS;

public class EnergiCalculator extends PerangkatElektronik {
    private double dayaWatt;
    private double durasiJam;

    public EnergiCalculator(String nama, double dayaWatt, double durasiJam) {
        super(nama);
        this.dayaWatt = dayaWatt;
        this.durasiJam = durasiJam;
    }

    public void setDayaWatt(double dayaWatt) {
        this.dayaWatt = dayaWatt;
    }

    public void setDurasiJam(double durasiJam) {
        this.durasiJam = durasiJam;
    }

    public double getDayaWatt() {
        return dayaWatt;
    }

    public double getDurasiJam() {
        return durasiJam;
    }

    public double hitungEnergi() {
        return dayaWatt * durasiJam / 1000;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Energi: " + hitungEnergi() + " kWh";
    }
}
