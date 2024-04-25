import java.util.Scanner;
// kak maaf sumpah ini udah berusaha tapi ga ngerti banget harus apa lagi

class Pasien {
    private String nama;
    private int umur;
    private String nik;
    private int kategori_asuransi;
    private double total_tagihan;

    public Pasien(String nama, int umur, String nik, int kategori_asuransi) {
        this.nama = nama;
        this.umur = umur;
        this.nik = nik;
        this.kategori_asuransi = kategori_asuransi;
        this.total_tagihan = 0;
    }

    public void setTotalTagihan(double tagihan) {
        switch (this.kategori_asuransi) {
            case 3: // VVIP
                tagihan *= 0.5;
                break;
            case 2: // VIP
                tagihan *= 0.8;
                break;
            default: // Biasa (no discount)
                break;
        }
        this.total_tagihan = tagihan;
    }

    public double getTotalTagihan() {
        return this.total_tagihan;
    }

    public int getKategoriAsuransi() {
        return this.kategori_asuransi;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int jumlahPasien = scn.nextInt();
        scn.nextLine();

        Pasien[] daftarPasien = new Pasien[jumlahPasien];

        String[] namaPasien = new String[jumlahPasien];
        for (int i = 0; i < jumlahPasien; i++) {
            namaPasien[i] = scn.nextLine();
        }

        int[] umurPasien = new int[jumlahPasien];
        for (int i = 0; i < jumlahPasien; i++) {
            umurPasien[i] = scn.nextInt();
            scn.nextLine();
        }

        String[] nikPasien = new String[jumlahPasien];
        for (int i = 0; i < jumlahPasien; i++) {
            nikPasien[i] = scn.nextLine();
        }

        int[] kategoriAsuransiPasien = new int[jumlahPasien];
        for (int i = 0; i < jumlahPasien; i++) {
            kategoriAsuransiPasien[i] = scn.nextInt();
            scn.nextLine();
        }

        int[] kategoriPilihanPasien = new int[jumlahPasien];
        for (int i = 0; i < jumlahPasien; i++) {
            kategoriPilihanPasien[i] = scn.nextInt();
            scn.nextLine();
        }

        for (int i = 0; i < jumlahPasien; i++) {
            daftarPasien[i] = new Pasien(namaPasien[i], umurPasien[i], nikPasien[i], kategoriAsuransiPasien[i]);
            tambahLayanan(daftarPasien[i], kategoriPilihanPasien[i]);
        }

        for (int i = 0; i < jumlahPasien; i++) {
            System.out.println("Rp. " + String.format("%,.0f", daftarPasien[i].getTotalTagihan()).replace(',', '.'));

        }
        scn.close();
    }

    public static void tambahLayanan(Pasien pasien, int layanan) {
        double totalTagihan = pasien.getTotalTagihan();
        switch (layanan) {
            case 1:
                totalTagihan += 20000;
                break;
            case 2:
                totalTagihan += 40000;
                break;
            case 3:
                totalTagihan += 75000;
                break;
            case 4:
                totalTagihan += 100000;
                break;
            default:
                break;
        }
        pasien.setTotalTagihan(totalTagihan);
    }
}