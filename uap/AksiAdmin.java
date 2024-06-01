/*Rahman Zaky
 * 235150401111030
 * UAP
 */

package uap;

import java.util.*;

public class AksiAdmin extends Aksi {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void tampilanAksi() {
        System.out.println("\nAksi Admin:");
        System.out.println("1. Tambah Film");
        System.out.println("2. Lihat List Film");
        System.out.println("3. Logout");
        System.out.println("4. Tutup Aplikasi");
        System.out.print("Pilih aksi: ");
    }

    @Override
    public void keluar() {
        Akun.logout();
        System.out.println("Anda telah logout.");
    }

    @Override
    public void tutupAplikasi() {
        System.out.println("Aplikasi ditutup.");
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

    public void tambahFilm() {
        System.out.print("\nNama Film         : ");
        String name = scanner.nextLine();
        if (Film.getFilms().containsKey(name)) {
            System.out.println("Film " + name + " sudah ada.");
            return;
        }

        System.out.print("Deskripsi Film    : ");
        String description = scanner.nextLine();
        System.out.print("Harga Tiket       : ");
        double price = scanner.nextDouble();
        System.out.print("Stok Tiket        : ");
        int stock = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Film.addFilm(name, description, price, stock);
    }
}
