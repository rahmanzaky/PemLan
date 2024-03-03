package tugas1;

public class PusatDataPerpustakaan {
    private String options[] = new String[9];
    private String bukuTeknologi[][] = new String[8][5];
    private String bukuFilsafat[][] = new String[5][5];
    private String bukuSejarah[][] = new String[6][5];
    private String bukuAgama[][] = new String[5][5];
    private String bukuPsikologi[][] = new String[7][5];
    private String bukuPolitik[][] = new String[5][5];
    private String bukuFiksi[][] = new String[6][5];

public void setOptions(){
    options[0] = "Teknologi";
    options[1] = "Filsafat";
    options[2] = "Sejarah";
    options[3] = "Agama";
    options[4] = "Psikologi";
    options[5] = "Politik";
    options[6] = "Fiksi";
    options[7] = "Tampilkan total buku yang tersedia";
    options[8] = "Keluar dari program";
}


public String getBukuTeknologi(int x, int y){
    return bukuSejarah[x][y];
}
public String getBukuFilsafat(int x, int y){
    return bukuFilsafat[x][y];
}
public String getBukuSejarah(int x, int y){
    return bukuSejarah[x][y];
}
public String getBukuAgama(int x, int y){
    return bukuAgama[x][y];
}
public String getBukuPsikologi(int x, int y){
    return bukuPsikologi[x][y];
}
public String getBukuPolitik(int x, int y){
    return bukuPolitik[x][y];
}
public String getBukuFiksi(int x, int y){
    return bukuFiksi[x][y];
}


public int getOptionsLength(){
    return options.length;
}
public String getOptions(int options){
    return this.options[options];
}

}