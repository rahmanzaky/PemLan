/*Rahman Zaky
 * 235150401111030
 * UAP
 */

package uap;

import java.util.HashMap;
import java.util.Map;

public class User {
    private static final Map<String, User> users = new HashMap<>();
    private final String username;
    private final String password;
    private final boolean isAdmin;
    private double saldo;
    private final Map<String, Pesanan> pesanan = new HashMap<>();

    public User(String username, String password, boolean isAdmin, double saldo) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public static void addUser(String username, String password, boolean isAdmin, double saldo) {
        if (!users.containsKey(username)) {
            User newUser = new User(username, password, isAdmin, saldo);
            users.put(username, newUser);
        }
    }

    public static Map<String, User> getUsers() {
        return users;
    }

    public void addPesanan(Film film, int kuantitas) {
        Pesanan newPesanan = new Pesanan(film, kuantitas);
        pesanan.put(film.getName(), newPesanan);
    }

    public Map<String, Pesanan> getPesanan() {
        return pesanan;
    }
}
