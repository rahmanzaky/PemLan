/*Rahman Zaky
 * 235150401111030
 * UAP
 */

package uap;

public class Akun {
    private static final ThreadLocal<User> currentUser = new ThreadLocal<>();

    public static void login(User user) {
        currentUser.set(user);
    }

    public static void logout() {
        currentUser.remove();
    }

    public static User getCurrentUser() {
        return currentUser.get();
    }
}
