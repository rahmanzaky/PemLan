/*Rahman Zaky
 * 235150401111030
 * UAP
 */

package uap;
import java.util.Scanner;
import java.util.Map;

public class AksiUser extends Aksi {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void tampilanAksi() {
        System.out.println("\nAksi User:");
        System.out.println("1. Pesan Film");
        System.out.println("2. Lihat List Film");
        System.out.println("3. Lihat Pesanan");
        System.out.println("4. Lihat Saldo");
        System.out.println("5. Logout");
        System.out.println("6. Tutup Aplikasi");
        System.out.print("Pilih aksi: ");
    }

    @Override
    public void keluar() {
        Akun.logout();
        System.out.println("Anda telah logout.");
    }

    @Override
    public void tutupAplikasi() {
        System.out.println("\nAplikasi ditutup.");
        System.exit(0);
    }

    @Override
    public void lihatListFilm() {
        Map<String, Film> films = Film.getFilms();
        System.out.print("\nList Film yang tersedia:");
        for (Film film : films.values()) {
            System.out.print("\n" + film.getName() + " - " + film.getDescription() + " - Harga: " + film.getPrice() + " - Stok: " + film.getStock());
        }
    }

    public void lihatSaldo() {
        System.out.print("\nSaldo anda: " + Akun.getCurrentUser().getSaldo());
    }

    public void pesanFilm() {
        System.out.print("\nNama Film yang ingin dipesan: ");
        String namaFilm = scanner.nextLine();
        Film film = Film.getFilms().get(namaFilm);

        if (film == null) {
            System.out.print("\nFilm yang dicari tidak ditemukan.");
            return;
        }

        System.out.print("\nJumlah tiket yang ingin dipesan: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); 

        if (jumlah > film.getStock()) {
            System.out.print("\nStok tiket tidak mencukupi.");
            return;
        }

        double totalHarga = jumlah * film.getPrice();
        System.out.println("Harga satuan tiket " + film.getPrice());
        System.out.println("Total harga " + totalHarga);
        
        if (totalHarga > Akun.getCurrentUser().getSaldo()) {
            System.out.println("\nSaldo tidak mencukupi, saldo yang dimiliki " + Akun.getCurrentUser().getSaldo());
            return;
        }

        film.setStock(film.getStock() - jumlah);
        Akun.getCurrentUser().setSaldo(Akun.getCurrentUser().getSaldo() - totalHarga);

        Akun.getCurrentUser().addPesanan(film, jumlah);
        System.out.println("\nTiket berhasil dipesan.");
    }

    public void lihatPesanan() {
        Map<String, Pesanan> pesanan = Akun.getCurrentUser().getPesanan();
        if (pesanan.isEmpty()) {
            System.out.print("\nKamu belum pernah melakukan pemesanan.");
        } else {
            for (Pesanan p : pesanan.values()) {
                System.out.println("\nFilm: " + p.getFilm().getName() + " - Jumlah: " + p.getKuantitas() + " - Total Harga: " + (p.getKuantitas() * p.getFilm().getPrice()));
            }
        }
    }
}
