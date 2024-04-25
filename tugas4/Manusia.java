package tugas4;

public class Manusia {
    private String nama;
    private Boolean jenisKelamin;
    private String nik;
    private Boolean menikah;

    public Manusia(String nama, Boolean jenisKelamin, String nik, Boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public Boolean getjenisKelamin() {
        return jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public Boolean getMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        if (menikah && jenisKelamin) {
            return 25.0;
        } else if (menikah && !jenisKelamin) {
            return 20.0;
        } else if (!menikah) {
            return 15.0;
        } else {
            return 0.0;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return "\n=============================================================================" + "\nNama\t\t: " + nama + "\nNIK\t\t: " + nik + "\nJenis Kelamin\t: "
                + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\nStatus\t\t: " + (menikah ? "Sudah Menikah" : "Belum Menikah")
                + "\nPendapatan\t: $" + getPendapatan();
    }
}