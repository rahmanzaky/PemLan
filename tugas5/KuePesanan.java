package tugas5;

public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    public double hitungHarga() {
        return super.harga * berat;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBerat\t\t: " + berat + " kg";
    }
}
