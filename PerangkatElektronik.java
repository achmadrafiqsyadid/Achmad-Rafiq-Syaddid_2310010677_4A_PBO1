package UAS;

public class PerangkatElektronik {
    protected String nama;

    public PerangkatElektronik(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getInfo() {
        return "Nama perangkat: " + nama;
    }
}

