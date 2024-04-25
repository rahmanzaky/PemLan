import java.util.ArrayList;
import java.util.Scanner;
// bismillah ga runtime error lagi ka

public class Main {
    final static String ACCESS_PASSWD = "admin123"; 

    static ArrayList<MobilSedan> mobilSedan = new ArrayList<>() {
        {
            add(new MobilSedan("Mercedes-Benz S600L", 2010, "Automatic", 500000));
            add(new MobilSedan("Honda Civic Type-R", 2018, "Automatic", 450000));
            add(new MobilSedan("BMW 750iL V12", 2013, "Automatic", 500000));
        }
    };

    static ArrayList<MobilSUV> mobilSUV = new ArrayList<>() {
        {
            add(new MobilSUV("Toyota Fortuner TRD", 2018, "Automatic", 400000));
            add(new MobilSUV("Mitsubishi Pajero Sport Daxar Ultimate", 2017, "Automatic", 350000));
            add(new MobilSUV("Toyota Land Cruiser VX-R", 2018, "Automatic", 500000));
        }
    };

    static ArrayList<Mobil> mobil = new ArrayList<>() {
        {
            addAll(mobilSedan);
            addAll(mobilSUV);

            add(new Mobil("Toyota Avanza 1.3G", 2016, "Manual", 150000));
            add(new Mobil("Daihatsu Xenia 1.3R", 2015, "Manual", 140000));
            add(new Mobil("Toyota Kijang Innova Reborn 2.4V", 2017, "Automatic", 150000));
            add(new Mobil("Toyota Avanza Veloz 1.5", 2019, "Automatic", 200000));
        }
    };

    static ArrayList<Rent> rents = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int userChoice;
        while (true) {
            userChoice = scn.nextInt();

            switch (userChoice) {
                case 1:
                    int carChoice = scn.nextInt();

                    if (carChoice == 1) {
                        printCarList(mobilSedan, "Sedan");
                    } else if (carChoice == 2) {
                        printCarList(mobilSUV, "SUV");
                    } else if (carChoice == 3) {
                        printCarList(mobil, "Lainnya");
                    } else {
                        System.out.println("Pilihan tidak valid");
                    }

                    break;

                case 2:
                    scn.nextLine();

                    String customerName = scn.nextLine();
                    String PhoneNum = scn.nextLine();

                    Driver driver = new Driver(customerName, PhoneNum);

                    int pilihanMobil = scn.nextInt();
                    scn.nextLine();

                    if (pilihanMobil < 1 || pilihanMobil > mobil.size()) {
                        System.out.println("Pilihan mobil tidak valid");
                        break;
                    }

                    Mobil mobilDisewa = mobil.get(pilihanMobil - 1);
                    if (!mobilDisewa.isTersedia()) {
                        System.out.println("Mobil tidak tersedia");
                        break;
                    }
                    int durasiSewa = scn.nextInt();

                    Rent rent = new Rent(driver, mobilDisewa, durasiSewa);
                    rents.add(rent);

                    mobilDisewa.setTersedia(false);

                    printRentalInfo(rent);
                    break;

                case 3:
                    scn.nextLine();
                    String password = scn.nextLine();

                    if (!password.equals(ACCESS_PASSWD)) {
                        System.out.println("Password salah");
                        break;
                    }

                    if (rents.isEmpty()) {
                        System.out.println("Tidak ada data sewa");
                    } else {
                        printRentalList();
                    }
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }

    private static void printCarList(ArrayList<? extends Mobil> carList, String category) {
        spacer();
        System.out.println("Daftar Mobil " + category + ":");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println((i + 1) + ". " + carList.get(i));
        }
        spacer();
    }

    private static void printRentalInfo(Rent rent) {
        spacer();
        System.out.println("Berhasil menyewa Mobil");
        System.out.println("====[Detail Sewa]====");
        System.out.println("Mobil\t: " + rent.getRentedCar().getMerk() + " " + rent.getRentedCar().getTahun());
        System.out.println("Durasi\t: " + rent.getLamaSewa() + " hari");
        System.out.printf("Total\t: Rp %,.2f\n", (double) rent.calculateTotalRent());
        spacer();
    }

    private static void printRentalList() {
        spacer();
        System.out.println("Daftar Sewa:");
        for (int i = 0; i < rents.size(); i++) {
            Rent r = rents.get(i);
            System.out.printf("%d. %s\n", i + 1, r);
        }
        spacer();
    }

    private static void spacer() {
        System.out.println("==========================================================");
    }
}

class Mobil {
    private String merk;
    private int tahun;
    private String transmission;
    private double hargaSewa;
    private boolean tersedia = true;
    private Driver driver;

    private static final double DISKON_SEWA = 0.1;

    public Mobil(String merk, int tahun, String transmission, double hargaSewa) {
        this.merk = merk;
        this.tahun = tahun;
        this.transmission = transmission;
        this.hargaSewa = hargaSewa;
    }

    public int hitungTotalSewa(int lamaSewa) {
        double totalSewa = hargaSewa * lamaSewa;
        totalSewa -= (totalSewa * DISKON_SEWA);
        return (int) totalSewa;
    }

    @Override
    public String toString() {
        String status = tersedia ? "Tersedia" : "Disewa oleh " + driver.getName();
        return String.format("%s %d, %s, Rp %.0f/hari (%s)", merk, tahun, transmission, hargaSewa, status);
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun() {
        return tahun;
    }
}

class MobilSedan extends Mobil {
    public MobilSedan(String merk, int tahun, String transmission, double hargaSewa) {
        super(merk, tahun, transmission, hargaSewa);
    }

    @Override
    public int hitungTotalSewa(int lamaSewa) {
        int totalSewa = super.hitungTotalSewa(lamaSewa) + 100_000;
        return totalSewa;
    }
}

class MobilSUV extends Mobil {
    public MobilSUV(String merk, int tahun, String transmission, double hargaSewa) {
        super(merk, tahun, transmission, hargaSewa);
    }

    @Override
    public int hitungTotalSewa(int lamaSewa) {
        int totalSewa = super.hitungTotalSewa(lamaSewa) + 50_000;
        return totalSewa;
    }
}

class Driver {
    private String name;
    private String phoneNum;

    public Driver(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
}

class Rent {
    private Driver driver;
    private Mobil rentedCar;
    private int lamaSewa;

    public Rent(Driver driver, Mobil rentedCar, int lamaSewa) {
        this.driver = driver;
        this.rentedCar = rentedCar;
        this.lamaSewa = lamaSewa;
        startRental();
    }

    public void startRental() {
        rentedCar.setTersedia(false);
        rentedCar.setDriver(driver);
    }

    public int calculateTotalRent() {
        return rentedCar.hitungTotalSewa(lamaSewa);
    }

    @Override
    public String toString() {
        String info = String.format("%s - %s %d - %d hari - Rp %,.2f",
                driver.getName(),
                rentedCar.getMerk(),
                rentedCar.getTahun(),
                lamaSewa,
                (double) calculateTotalRent());
        return info;
    }

    public Mobil getRentedCar() {
        return rentedCar;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }
}
