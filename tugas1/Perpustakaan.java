package tugas1;

public class Perpustakaan {
    private String bukuSejarah[][] = {
        {"Sejarah Yang Disembunyikan", "Jonathan Black", "636", "2019", "Pustaka Alfabet"},
        {"Sejarah Dunia yang Tidak Disembunyikan", "Jonathan White", "363", "2016", "Pustaka Numerical"}
    };




public String getBukuSejarah(int x, int y){
    return bukuSejarah[x][y];
}


}