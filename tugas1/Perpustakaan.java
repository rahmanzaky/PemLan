package tugas1;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PusatDataPerpustakaan dataBuku = new PusatDataPerpustakaan();
        dataBuku.setOptions();

        while (true) {
            System.out.println("\n======================[Perpustakaan]=======================\n"
            + "Masukkan pilihan untuk melihat buku berdasarkan kategori.");
            for (int i = 0; i < dataBuku.getOptionsLength(); i++) {
                System.out.printf("%d. %s%n", i + 1, dataBuku.getOptions(i));
            }
            System.out.println("============================================================");
            System.out.print("Pilihan Anda: ");

            int userChoice = 0;
            try {
                userChoice = scn.nextInt();
                scn.nextLine();
                
            } catch (Exception e) {
                System.out.println("\n============================================================");
                System.out.println("Input tidak valid. Masukkan angka.");
                System.out.println("============================================================");
                scn.nextLine();
                continue;
            }
            

            if (userChoice == 1) { // Teknologi
                System.out.println("Buku ke");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        
                    }
                }

                
            } else if (userChoice == 2){ // Filsafat

                
            } else if (userChoice == 3){ // Sejarah

                
            } else if (userChoice == 4){ // Agama

                
            } else if (userChoice == 5){ // Psikologi

                
            } else if (userChoice == 6){ // Politik

                
            } else if (userChoice == 7){ // Fiksi

                
            } else if (userChoice == 8){ // Total Buku
                System.out.println("\n============================================================");
                System.out.println("COUNT: Total buku adalah = 42");
                System.out.println("============================================================");

                boolean userContinue = false;
                do {
                    System.out.println("Apakah anda ingin melanjutkan program? (ya/tidak)");
                    System.out.print("Pilihan Anda: ");
                    String userChoiceString = scn.nextLine();

                    if (userChoiceString.equalsIgnoreCase("ya")) {
                        userContinue = false;
                        break;
                    } else if(userChoiceString.equalsIgnoreCase("tidak")) {
                        userContinue = false;
                        System.out.println("\n============================================================");
                        System.out.println("Terima kasih telah menggunakan program ini.");
                        System.out.println("Sampai jumpa di lain kesempatan!");
                        System.out.println("============================================================");
                        System.exit(0);
                    } else {
                        System.out.println("\n============================================================");
                        System.out.println("Pilihan tidak valid. Silakan ketik 'ya' atau 'tidak'.");
                        System.out.println("============================================================");
                        userContinue = true;
                    }   
                } while (userContinue);


                
            } else if (userChoice == 9){ // Keluar dari Program
                break;
            } else {
                System.out.println("\n============================================================");
                System.out.println("Pilihan tidak valid. Silakan pilih angka 1-9.");
                System.out.println("============================================================");
            }

        }

        System.out.println("\n============================================================");
        System.out.println("Terima kasih telah menggunakan program ini.");
        System.out.println("Sampai jumpa di lain kesempatan!");
        System.out.println("============================================================");
        
    }
}