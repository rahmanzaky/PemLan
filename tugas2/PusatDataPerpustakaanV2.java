package tugas2;

public class PusatDataPerpustakaanV2 {
    private String options[] = new String[9];

    public PusatDataPerpustakaanV2(){
        setOptions();
    }

    public String bukuTeknologi[][] = {
        {"Java Programming", "John Smith", "300", "2018", "Tech Books", "Java Programming is a comprehensive guide to learning\n\t\t\t  Java programming language."},
        {"Python Basics", "Emily Johnson", "250", "2019", "Tech Publications", "Python Basics provides a solid foundation in\n\t\t\t  Python programming for beginners."},
        {"Data Structures and Algorithms", "Mark Thompson", "400", "2020", "Code Masters", "Data Structures and Algorithms explores fundamental data structures\n\t\t\t  and algorithms used in computer science."},
        {"Machine Learning Essentials", "Alice Miller", "350", "2017", "Tech Wizards", "Machine Learning Essentials is a practical guide to understanding\n\t\t\t  machine learning concepts and techniques."},
        {"Web Development Mastery", "David Brown", "450", "2016", "Web Experts", "Web Development Mastery teaches essential web development skills, including HTML,\n\t\t\t  CSS, JavaScript, and more."}
    };

    public String bukuFilsafat[][] = {
        {"Introduction to Philosophy", "Michael Brown", "200", "2015", "Philosophy Press", "Introduction to Philosophy introduces readers to the\n\t\t\t  basic concepts and theories of philosophy."},
        {"Ethics: A Contemporary Introduction", "Sarah Adams", "350", "2017", "Philosophy House", "Ethics: A Contemporary Introduction explores ethical theories\n\t\t\t  and principles in contemporary contexts."},
        {"The Philosophy Book", "DK", "352", "2011", "DK Publishing", "The Philosophy Book is an illustrated guide\n\t\t\t  to the history of philosophy."},
        {"The Republic", "Plato", "416", "-380", "Penguin Classics", "The Republic is a classic work of\n\t\t\t  political philosophy by Plato."},
        {"Meditations", "Marcus Aurelius", "416", "180", "Penguin Classics", "Meditations is a series of personal writings by Marcus Aurelius,\n\t\t\t  Roman Emperor and Stoic philosopher. It offers insights into Stoic philosophy and\n\t\t\t  practical advice for living a virtuous life."}
    };

    public String bukuSejarah[][] = {
        {"Sejarah Dunia yang Disembunyikan", "Jonathan Black", "636", "2015", "Pustaka Alvabet", "Sejarah Dunia yang Disembunyikan adalah sebuah buku yang mengupas\n\t\t\t  sejarah dunia dari sudut pandang yang jarang terungkap."},
        {"Buku Sejarah Lengkap", "Budi Sejarawan", "400", "2018", "Gramedia Pustaka Utama", "Buku Sejarah Lengkap merupakan panduan menyeluruh tentang sejarah\n\t\t\t  manusia dari zaman prasejarah hingga masa kini."},
        {"Sejarah Indonesia", "Sutan Takdir Alisjahbana", "350", "1956", "Balai Pustaka", "Sejarah Indonesia adalah buku yang mengulas perjalanan sejarah\n\t\t\t  bangsa Indonesia dari masa pra-kolonial hingga masa kemerdekaan."},
        {"Sejarah Peradaban Islam", "Prof. Dr. Hamka", "450", "1961", "Pustaka Panjimas", "Sejarah Peradaban Islam adalah karya monumental yang mengungkap\n\t\t\t  perkembangan dan pencapaian peradaban Islam dari awal hingga masa keemasan."},
        {"The Secret History", "Donna Tartt", "629", "1992", "Alfred A. Knopf", "The Secret History adalah sebuah novel yang mengisahkan kehidupan\n\t\t\t  sekelompok mahasiswa di sebuah perguruan tinggi ternama di Amerika Serikat."}
    };

    public String bukuAgama[][] = {
        {"The Holy Bible", "Various Authors", "1500", "2000", "Religious Books", "The Holy Bible is the sacred scripture of Christianity,\n\t\t\t  containing the Old and New Testaments."},
        {"The Quran", "Muhammad", "1000", "610", "Islamic Publications", "The Quran is the holy book of Islam,\n\t\t\t  believed to be the word of God as revealed to the Prophet Muhammad."},
        {"Bhagavad Gita", "Vyasa", "700", "-500", "Penguin Classics", "The Bhagavad Gita is a Hindu scripture that presents\n\t\t\t  a conversation between the prince Arjuna and the god Krishna."},
        {"The Tibetan Book of Living and Dying", "Sogyal Rinpoche", "444", "1992", "Harper Collins", "The Tibetan Book of Living and Dying is a spiritual\n\t\t\t  guide to the art of dying and the process of death according to Tibetan Buddhist tradition."},
        {"The Tao Te Ching", "Laozi", "81", "-500", "Penguin Classics", "The Tao Te Ching is a fundamental text\n\t\t\t  of Taoism attributed to the sage Laozi."}
    };

    public String bukuPsikologi[][] = {
        {"Introduction to Psychology", "David G. Myers", "350", "2017", "Psychological Press", "Introduction to Psychology provides an overview of\n\t\t\t  the basic concepts and theories of psychology."},
        {"Thinking, Fast and Slow", "Daniel Kahneman", "500", "2011", "Psychological House", "Thinking, Fast and Slow explores the two systems that drive\n\t\t\t  the way we think: the fast, intuitive system and the slow, deliberate system."},
        {"Influence: The Psychology of Persuasion", "Robert B. Cialdini", "320", "1984", "Harper Business", "Influence: The Psychology of Persuasion examines the psychology\n\t\t\t  behind why people say 'yes' and how to apply these principles in everyday life."},
        {"Man's Search for Meaning", "Viktor E. Frankl", "165", "1946", "Beacon Press", "Man's Search for Meaning is Viktor Frankl's account of his\n\t\t\t  experiences as a prisoner in Nazi concentration camps during World War II."},
        {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "352", "2012", "Crown Publishing Group", "Quiet: The Power of Introverts in a World That Can't Stop Talking\n\t\t\t  explores the strengths and talents of introverted individuals in a society that values extroversion."}
    };

    public String bukuPolitik[][] = {
        {"The Prince", "Niccolò Machiavelli", "200", "1532", "Political Books", "The Prince is a political treatise by Niccolò Machiavelli,\n\t\t\t  offering advice on acquiring and maintaining political power."},
        {"The Communist Manifesto", "Karl Marx, Friedrich Engels", "100", "1848", "Political Publications", "The Communist Manifesto is a political pamphlet by Karl Marx and Friedrich Engels,\n\t\t\t  advocating for the overthrow of capitalist society and the establishment of a classless,\n\t\t\t  communist society."},
        {"Das Kapital", "Karl Marx", "1152", "1867", "Vintage", "Das Kapital is a foundational work of Marxist economics by Karl Marx,\n\t\t\t  analyzing the capitalist mode of production and\n\t\t\t  its underlying mechanisms of exploitation."},
        {"On Liberty", "John Stuart Mill", "256", "1859", "Wiley-Blackwell", "On Liberty is a philosophical treatise by John Stuart Mill,\n\t\t\t  advocating for individual freedom and autonomy against\n\t\t\t  the tyranny of society and government."},
        {"The Federalist Papers", "Alexander Hamilton, James Madison, John Jay", "688", "1788", "Signet Classics", "The Federalist Papers are a collection of essays written by\n\t\t\t  Alexander Hamilton, James Madison, and John Jay, promoting\n\t\t\t  the ratification of the United States Constitution."}
    };

    public String bukuFiksi[][] = {
        {"To Kill a Mockingbird", "Harper Lee", "300", "1960", "Fiction House", "To Kill a Mockingbird is a classic novel by Harper Lee,\n\t\t\t  set in the fictional town of Maycomb, Alabama, during the Great Depression."},
        {"1984", "George Orwell", "250", "1949", "Fiction Press", "1984 is a dystopian novel by George Orwell,\n\t\t\t  set in a totalitarian society ruled by the Party\n\t\t\t  and its leader, Big Brother."},
        {"Pride and Prejudice", "Jane Austen", "279", "1813", "Penguin Classics", "Pride and Prejudice is a romantic novel by Jane Austen,\n\t\t\t  set in rural England during the early 19th century."},
        {"The Great Gatsby", "F. Scott Fitzgerald", "200", "1925", "Scribner", "The Great Gatsby is a novel by F. Scott Fitzgerald,\n\t\t\t  set in the Jazz Age of the 1920s."},
        {"The Catcher in the Rye", "J.D. Salinger", "230", "1951", "Little, Brown and Company", "The Catcher in the Rye is a coming-of-age novel by J.D. Salinger,\n\t\t\t  narrated by the troubled teenager Holden Caulfield."}
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

    public int getOptionsLength(){
        return options.length;
    }
    public String getOptions(int options){
        return this.options[options];
    }

    public int countWordsInSynopsis(String synopsis) {
        String[] words = synopsis.split("\\s+");
        return words.length;
    }
}