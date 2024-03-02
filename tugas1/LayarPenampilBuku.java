package tugas1;
import java.util.Scanner;

public class LayarPenampilBuku {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Perpustakaan options = new Perpustakaan();
        options.setOptions();

        System.out.println("\n===============[Perpustakaan]===============");
        for (int i = 0; i < options.getOptionsLength(); i++) {
            System.out.printf("%d. %s%n", i + 1, options.getOptions(i));
        }

        System.out.print("\nPilihan Anda: ");
        int userChoice = scn.nextInt();

        if (userChoice == 1) {
            
        }



        scn.close();
    }
}
