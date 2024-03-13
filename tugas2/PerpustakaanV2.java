package tugas2;

import java.util.Scanner;

public class PerpustakaanV2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PusatDataPerpustakaanV2 dataBuku = new PusatDataPerpustakaanV2();
        boolean userContinue = false;

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
            
            if (userChoice >= 1 && userChoice <= 7) {
                String[][] selectedBooks = null;
                switch (userChoice) {
                    case 1:
                        selectedBooks = dataBuku.bukuTeknologi;
                        break;
                    case 2:
                        selectedBooks = dataBuku.bukuFilsafat;
                        break;
                    case 3:
                        selectedBooks = dataBuku.bukuSejarah;
                        break;
                    case 4:
                        selectedBooks = dataBuku.bukuAgama;
                        break;
                    case 5:
                        selectedBooks = dataBuku.bukuPsikologi;
                        break;
                    case 6:
                        selectedBooks = dataBuku.bukuPolitik;
                        break;
                    case 7:
                        selectedBooks = dataBuku.bukuFiksi;
                        break;
                }

                int bookNumber = 1;
                System.out.print("\n============================================================");
                for (String[] book : selectedBooks) {
                    System.out.println("\nBuku ke-" + bookNumber);
                    System.out.println("1.  Nama Buku   \t: " + book[0]);
                    System.out.println("2.  Penulis     \t: " + book[1]);
                    System.out.println("3.  Jumlah Halaman\t: " + book[2]);
                    System.out.println("4.  Tahun Terbit\t: " + book[3]);
                    System.out.println("5.  Nama Penerbit\t: " + book[4]);
                    System.out.println("6.  Sinopsis    \t: " + book[5]);
                    System.out.println("\nJumlah Kata Sinopsis\t: " + dataBuku.countWordsInSynopsis(book[5]));
                    bookNumber++;
                }
                System.out.println("============================================================");

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
            } else if (userChoice == 8) {
                System.out.println("\n============================================================");
                System.out.println("COUNT: Total buku adalah = 35");
                System.out.println("============================================================");

                
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
            } else if (userChoice == 9) {
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
        scn.close();
    }
}
