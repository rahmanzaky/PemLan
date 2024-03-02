package tugas1;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PusatDataPerpustakaan options = new PusatDataPerpustakaan();
        options.setOptions();

        System.out.println("\n======================[Perpustakaan]=======================\n"
                    + "Masukkan pilihan untuk melihat buku berdasarkan kategori");
        for (int i = 0; i < options.getOptionsLength(); i++) {
            System.out.printf("%d. %s%n", i + 1, options.getOptions(i));
        }
        System.out.println("============================================================");
        System.out.print("Pilihan Anda: ");
        int userChoice = scn.nextInt();

        if (userChoice == 1) { // Teknologi
            
        } else if (userChoice == 2){ // Filsafat

            
        } else if (userChoice == 3){ // Sejarah

            
        } else if (userChoice == 4){ // Agama

            
        } else if (userChoice == 5){ // Psikologi

            
        } else if (userChoice == 6){ // Politik

            
        } else if (userChoice == 7){ // Fiksi

            
        } else if (userChoice == 8){ // Total Buku
            System.out.println("");

            
        } else if (userChoice == 9){ // Keluar dari Program

        }


        scn.close();
    }
}