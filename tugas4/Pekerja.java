package tugas4;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk,
            int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    private int hitungLamaBekerja() {
        LocalDate sekarang = LocalDate.now();
        return sekarang.getYear() - tahunMasuk.getYear();
    }

    public double getBonus() {
        double bonus = 0.0;
        int lamaBekerja = hitungLamaBekerja();

        if (lamaBekerja >= 0 && lamaBekerja <= 5) {
            bonus += 0.05 * gaji;
        } else if (lamaBekerja > 5 && lamaBekerja <= 10) {
            bonus += 0.10 * gaji;
        } else if (lamaBekerja > 10) {
            bonus += 0.15 * gaji;
        }

        return bonus;
    }

    public double getTunjanganAnak() {
        if (jumlahAnak > 0) {
            return jumlahAnak * 20.0;
        } else {
            return 0.0;
        }
    }

    public double getGaji() {
        return gaji;
    }

    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + getGaji() + getTunjanganAnak();
    }

    public String toString() {
        return super.toString() + "\nTahun Masuk\t: " + tahunMasuk.getYear() 
                + "\nLama Bekerja\t: " + hitungLamaBekerja() + " tahun"
                + "\nJumlah Anak\t: " + jumlahAnak 
                + "\nGaji\t\t: $" + getGaji() + " (Pokok)" + " + " + "$" + getTunjanganAnak() + " (Tunjangan Anak)" + " + " + "$" + getBonus() + " (Bonus)";
    }

}