package tugas5;
//kelas utama untuk input pengguna
import java.util.Scanner;

public class MainKue {
    public static void main(String[] args) {
        int pilihan = 0;
        Scanner scn = new Scanner(System.in);
        Kue[] kue = new Kue[20];
        kue[0] = new KuePesanan("Bolu Gulung", 7000.0, 2);
        kue[1] = new KuePesanan("Brownies Kukus", 15000.0, 3);
        kue[2] = new KuePesanan("Kue Lumpur", 12000.0, 1.5);
        kue[3] = new KuePesanan("Lapis Legit", 20000.0, 2.5);
        kue[4] = new KuePesanan("Kue Sus", 8000.0, 4);
        kue[5] = new KuePesanan("Tiramisu", 25000.0, 2);
        kue[6] = new KuePesanan("Kue Bolu", 10000.0, 3);
        kue[7] = new KuePesanan("Kue Cubit", 5000.0, 6);
        kue[8] = new KuePesanan("Rainbow Cake", 30000.0, 1.5);
        kue[9] = new KuePesanan("Pudding Coklat", 18000.0, 2.5);
        kue[10] = new KueJadi("Cheesecake", 25000.0, 2);
        kue[11] = new KueJadi("Opera Cake", 35000.0, 1);
        kue[12] = new KueJadi("Red Velvet Cake", 40000.0, 1.5);
        kue[13] = new KueJadi("Pavlova", 30000.0, 2);
        kue[14] = new KueJadi("Macarons", 20000.0, 3);
        kue[15] = new KueJadi("Croissant", 10000.0, 5);
        kue[16] = new KueJadi("Churros", 12000.0, 4);
        kue[17] = new KueJadi("Eclairs", 18000.0, 2);
        kue[18] = new KueJadi("Baklava", 22000.0, 3);
        kue[19] = new KueJadi("Mille Feuille", 35000.0, 1.5);
        System.out.println("\n===============================================");
        System.out.println("Selamat datang di Toko Kue by Rahman Zaky");
        System.out.println("===============================================/n");
        do {
            try {
                System.out.println("Menu:\n" +
                        "1. Tampilkan semua kue dan jenis kuenya\n" +
                        "2. Hitung total harga yang didapat dari semua jenis kue\n" +
                        "3. Hitung total harga dan total berat dari KuePesanan\n" +
                        "4. Hitung total harga dan total jumlah dari KueJadi\n" +
                        "5. Tampilkan informasi kue dengan harga terbesar\n" +
                        "0. Keluar");
                System.out.print("\nMasukkan pilihan anda: ");
                pilihan = scn.nextInt();
                System.out.println();
                if (pilihan == 1) {
                    System.out.println("Daftar Kue:");
                    for (Kue jenisKue : kue) {
                        String jenis = (jenisKue instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
                        System.out.println(jenisKue.toString() + "\nJenis\t\t: " + jenis + "\nTotal Harga\t: Rp"
                                + jenisKue.hitungHarga() + "\n");
                    }
                    System.out.println();
                } else if (pilihan == 2) {
                    double totalHarga = 0;
                    for (Kue jenisKue : kue) {
                        totalHarga += jenisKue.getHarga();
                    }
                    System.out.println("Total harga semua kue: Rp" + totalHarga);
                    System.out.println();
                } else if (pilihan == 3) {
                    double totalhargaPesanan = 0;
                    double beratPesanan = 0;
                    double hitungHarga = 0;
                    for (Kue jenisKue : kue) {
                        if (jenisKue instanceof KuePesanan) {
                            totalhargaPesanan += jenisKue.getHarga();
                            beratPesanan += ((KuePesanan) jenisKue).getBerat();
                            hitungHarga += jenisKue.hitungHarga();
                        }
                    }
                    System.out.println("Total harga kue pesanan: Rp" + totalhargaPesanan);
                    System.out.println("Total berat kue pesanan: " + beratPesanan + " kg");
                    System.out.println("Total harga keseluruhan: Rp" + hitungHarga);
                    System.out.println();
                } else if (pilihan == 4) {
                    double totalhargaJadi = 0;
                    double jumlah = 0;
                    double totalHarga = 0;
                    for (Kue jenisKue : kue) {
                        if (jenisKue instanceof KueJadi) {
                            totalhargaJadi += jenisKue.getHarga();
                            jumlah += ((KueJadi) jenisKue).getJumlah();
                            totalHarga += jenisKue.hitungHarga();
                        }
                    }
                    System.out.println("Total harga kue jadi\t: Rp" + totalhargaJadi);
                    System.out.println("Jumlah kue pesanan\t: " + jumlah);
                    System.out.println("Total harga keseluruhan\t: Rp" + totalHarga);
                    System.out.println();
                } else if (pilihan == 5) {
                    Kue kueTermahal = kue[0];
                    for (Kue jenisKue : kue) {
                        if (kueTermahal.hitungHarga() < jenisKue.hitungHarga()) {
                            kueTermahal = jenisKue;
                        }
                    }
                    System.out.println("Kue Termahal adalah:\n" + kueTermahal.toString() + "\nTotal Harga\t: Rp"
                            + kueTermahal.hitungHarga()
                            + "\nJenis kue\t: " + ((kueTermahal instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi"));
                }
                System.out.println();
                if (pilihan < 0 || pilihan > 5) {
                    System.out.println("Tidak tersedia. Masukkan pilihan dengan benar!");
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println("\nMasukkan harus berupa angka!");
                System.out.println();
                scn.nextLine(); // Membersihkan buffer
                continue;
            }
        } while (pilihan != 0);
        scn.close();
        System.out.println("Terimakasih sudah mengakses program ini."
            + "\nSampai jumpa lagi!");
    }
}
