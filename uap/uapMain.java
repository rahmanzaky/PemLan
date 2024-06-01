/*Rahman Zaky
 * 235150401111030
 * UAP
 */
 
package uap;

import java.util.Scanner;

public class uapMain {
    static AksiAdmin aksiAdmin = new AksiAdmin();
    static AksiUser aksiUser = new AksiUser();
    static Scanner scanner = new Scanner(System.in);
    static boolean run = true;
    static boolean isLogin = false;

    public static void main(String[] args) {
        User.addUser("user", "123", false, 100000);
        User.addUser("admin", "123", true, 100000);

        while (run) {
            Aksi.welcome();
            int aksi = scanner.nextInt();

            if (aksi == 1) {
                while (!isLogin) {
                    System.out.println("\nSilakan login >_<");
                    System.out.print("Username: ");
                    String username = scanner.next();
                    System.out.print("Password: ");
                    String password = scanner.next();

                    User user = authenticate(username, password);

                    if (user != null) {
                        isLogin = true;
                        Akun.login(user);
                        System.out.println("\nSelamat datang " + Akun.getCurrentUser().getUsername());
                        if (Akun.getCurrentUser().isAdmin()) {
                            handleAksiAdmin();
                        } else {
                            handleAksiUser();
                        }
                    } else {
                        System.out.println("Username atau password salah. Silakan coba lagi.");
                    }
                }
                isLogin = false;
            } else {
                run = false;
            }
        }
    }

    private static User authenticate(String username, String password) {
        User user = User.getUsers().get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    private static void handleAksiUser() {
        while (true) {
            System.out.println();
            aksiUser.tampilanAksi();
            switch (scanner.nextInt()) {
                case 1 -> aksiUser.pesanFilm();
                case 2 -> aksiUser.lihatListFilm();
                case 3 -> aksiUser.lihatPesanan();
                case 4 -> aksiUser.lihatSaldo();
                case 5 -> {
                    aksiUser.keluar();
                    return;
                }
                case 6 -> aksiUser.tutupAplikasi();
                default -> System.out.println("Pilihan tidak valid");
            }
        }
    }

    private static void handleAksiAdmin() {
        while (true) {
            System.out.println();
            aksiAdmin.tampilanAksi();
            switch (scanner.nextInt()) {
                case 1 -> aksiAdmin.tambahFilm();
                case 2 -> aksiAdmin.lihatListFilm();
                case 3 -> {
                    aksiAdmin.keluar();
                    return;
                }
                case 4 -> aksiAdmin.tutupAplikasi();
                default -> System.out.println("Pilihan tidak valid");
            }
        }
    }
}
