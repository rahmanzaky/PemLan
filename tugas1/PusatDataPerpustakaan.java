package tugas1;

public class PusatDataPerpustakaan {
    private String options[] = new String[9];
    public String bukuTeknologi[][] = {
        {"Java Programming", "John Smith", "300", "2018", "Tech Books"},
        {"Python Basics", "Emily Johnson", "250", "2019", "Tech Publications"},
        {"Data Structures and Algorithms", "Mark Thompson", "400", "2020", "Code Masters"},
        {"Machine Learning Essentials", "Alice Miller", "350", "2017", "Tech Wizards"},
        {"Web Development Mastery", "David Brown", "450", "2016", "Web Experts"}
    };

    public String bukuFilsafat[][] = {
        {"Introduction to Philosophy", "Michael Brown", "200", "2015", "Philosophy Press"},
        {"Ethics: A Contemporary Introduction", "Sarah Adams", "350", "2017", "Philosophy House"},
        {"The Philosophy Book", "DK", "352", "2011", "DK Publishing"},
        {"The Republic", "Plato", "416", "-380", "Penguin Classics"},
        {"Meditations", "Marcus Aurelius", "416", "180", "Penguin Classics"}
    };
    public String bukuSejarah[][] = {
        {"Sejarah Dunia yang Disembunyikan", "Jonathan Black", "636", "2015", "Pustaka Alvabet"},
        {"Buku Sejarah Lengkap", "Budi Sejarawan", "400", "2018", "Gramedia Pustaka Utama"},
        {"Sejarah Indonesia", "Sutan Takdir Alisjahbana", "350", "1956", "Balai Pustaka"},
        {"Sejarah Peradaban Islam", "Prof. Dr. Hamka", "450", "1961", "Pustaka Panjimas"},
        {"The Secret History", "Donna Tartt", "629", "1992", "Alfred A. Knopf"}
    };
    public String bukuAgama[][] = {
        {"The Holy Bible", "Various Authors", "1500", "2000", "Religious Books"},
        {"The Quran", "Muhammad", "1000", "610", "Islamic Publications"},
        {"Bhagavad Gita", "Vyasa", "700", "-500", "Penguin Classics"},
        {"The Tibetan Book of Living and Dying", "Sogyal Rinpoche", "444", "1992", "Harper Collins"},
        {"The Tao Te Ching", "Laozi", "81", "-500", "Penguin Classics"}
    };
    public String bukuPsikologi[][] = {
        {"Introduction to Psychology", "David G. Myers", "350", "2017", "Psychological Press"},
        {"Thinking, Fast and Slow", "Daniel Kahneman", "500", "2011", "Psychological House"},
        {"Influence: The Psychology of Persuasion", "Robert B. Cialdini", "320", "1984", "Harper Business"},
        {"Man's Search for Meaning", "Viktor E. Frankl", "165", "1946", "Beacon Press"},
        {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "352", "2012", "Crown Publishing Group"}
    };
    public String bukuPolitik[][] = {
        {"The Prince", "Niccolò Machiavelli", "200", "1532", "Political Books"},
        {"The Communist Manifesto", "Karl Marx, Friedrich Engels", "100", "1848", "Political Publications"},
        {"Das Kapital", "Karl Marx", "1152", "1867", "Vintage"},
        {"On Liberty", "John Stuart Mill", "256", "1859", "Wiley-Blackwell"},
        {"The Federalist Papers", "Alexander Hamilton, James Madison, John Jay", "688", "1788", "Signet Classics"}
    };
    public String bukuFiksi[][] = {
        {"To Kill a Mockingbird", "Harper Lee", "300", "1960", "Fiction House"},
        {"1984", "George Orwell", "250", "1949", "Fiction Press"},
        {"Pride and Prejudice", "Jane Austen", "279", "1813", "Penguin Classics"},
        {"The Great Gatsby", "F. Scott Fitzgerald", "200", "1925", "Scribner"},
        {"The Catcher in the Rye", "J.D. Salinger", "230", "1951", "Little, Brown and Company"}
    };

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