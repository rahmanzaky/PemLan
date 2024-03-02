package tugas1;

public class Perpustakaan {
    private String options[] = new String[9];

    private String bukuTeknologi[][] = new String[6][5];
    private String bukuFilsafat[][] = new String[6][5];
    private String bukuSejarah[][] = new String[6][5];
    private String bukuAgama[][] = new String[6][5];
    private String bukuPsikologi[][] = new String[6][5];
    private String bukuPolitik[][] = new String[6][5];
    private String bukuFiksi[][] = new String[6][5];

public void setOptions(){
    this.options[0] = "Teknologi";
    this.options[1] = "Filsafat";
    this.options[2] = "Sejarah";
    this.options[3] = "Agama";
    this.options[4] = "Psikologi";
    this.options[5] = "Politik";
    this.options[6] = "Fiksi";
    this.options[7] = "Tampilkan total buku yang tersedia";
    this.options[8] = "Keluar dari program";
}


public String getBukuSejarah(int x, int y){
    return bukuSejarah[x][y];
}


public int getOptionsLength(){
    return options.length;
}
public String getOptions(int options){
    return this.options[options];
}

}