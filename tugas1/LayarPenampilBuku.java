package tugas1;
import java.util.Scanner;

public class LayarPenampilBuku {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Perpustakaan bukuSejarah = new Perpustakaan();


        System.out.println(bukuSejarah.getBukuSejarah(1, 0));
        scn.close();
    }
}
