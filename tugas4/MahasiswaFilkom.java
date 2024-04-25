package tugas4;

public class MahasiswaFilkom extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFilkom(String nama, Boolean jenisKelamin, String nik, Boolean menikah, String nim, Double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public Double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.0;
        } else if (ipk >= 3.5 && ipk <= 4) {
            return 75.0;
        } else {
            return 0.0;
        }
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public String getStatus() {
        if (nim.charAt(6) == '2') {
            return "Informatika " + "Angkatan 20" + nim.charAt(0) + nim.charAt(1);
        } else if (nim.charAt(6) == '3') {
            return "Teknik komputer " + "Angkatan 20" + nim.charAt(0) + nim.charAt(1);
        } else if (nim.charAt(6) == '4') {
            return "Sistem Informasi " + "Angkatan 20" + nim.charAt(0) + nim.charAt(1);
        } else if (nim.charAt(6) == '6') {
            return "Pendidikan teknologi Informasi " + "Angkatan 20" + nim.charAt(0) + nim.charAt(1);
        } else if (nim.charAt(6) == '7') {
            return "Teknologi Informasi" + "Angkatan 20" + nim.charAt(0) + nim.charAt(1);
        } else {
            return "";
        }
    }

    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    public String toString() {
        return super.toString() + "\nNIM\t\t: " + getNim() + "\nIPK\t\t: " + getIpk() + "\nStatus\t\t: " + getStatus();
    }
}