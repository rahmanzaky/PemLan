package tugas4;

import java.time.LocalDate;

public class Tugas4Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia("Budi", true, "3173051007021003", true);
        System.out.println(manusia.toString());
        Manusia manusia2 = new Manusia("Aurora", false, "3173051001021004", true);
        System.out.println(manusia2.toString());
        Manusia manusia3 = new Manusia("Yanti", false, "3173050905021005", false);
        System.out.println(manusia3.toString());

        MahasiswaFilkom filkom = new MahasiswaFilkom("Rahman Zaky", true, "3053172304081007", false,
                "235150401111030", 3.71);
        System.out.println(filkom.toString());
        MahasiswaFilkom filkom2 = new MahasiswaFilkom("Rahman", true, "3053172304081007", false,
                "235150401111030", 3.4);
        System.out.println(filkom2.toString());
        MahasiswaFilkom filkom3 = new MahasiswaFilkom("Zaky", true, "3053172304081007", false,
                "235150401111030", 2.8);
        System.out.println(filkom3.toString());

        Pekerja pekerja = new Pekerja("Erza", true, "3053170423111007", true, 3600.0, LocalDate.of(2022, 4, 12), 2);
        System.out.println(pekerja.toString());
        Pekerja pekerja2Pekerja = new Pekerja("Reza", true, "3053170713111007", false, 4000.0, LocalDate.of(2015, 4, 15), 0);
        System.out.println(pekerja2Pekerja.toString());
        Pekerja pekerja3 = new Pekerja("Rashky", true, "3053170823111007", true, 12500.0, LocalDate.of(2004, 1, 23), 10);
        System.out.println(pekerja3.toString());

        Manajer manajer = new Manajer("Ramadhan", true, "3053170123124107", true, 7500, LocalDate.of(2009, 4, 24), 0,
                "Sales");
        System.out.println(manajer.toString());
        System.out.println("");
    }
}