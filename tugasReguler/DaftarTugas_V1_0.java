package tugasReguler;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Task<T, U> {
    private T id;
    private U description;

    public Task(T id, U description) {
        this.id = id;
        this.description = description;
    }

    public T getId() {
        return id;
    }

    public U getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Deskripsi: " + description;
    }
}

public class DaftarTugas_V1_0 {
    private static ArrayList<Task<Integer, String>> tasks = new ArrayList<>();
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nSelamat datang di Manajer Tugas!");
        System.out.println("oleh Rahman Zaky");
        while (true) {
            System.out.println("\n=== Manajer Tugas ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Hapus Tugas");
            System.out.println("3. Tampilkan Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            
            int choice = getInput();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:
                    System.out.println("Keluar...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static int getInput() {
        while (true) {
            try {
                return scn.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scn.next();
            }
        }
    }

    private static void addTask() {
        scn.nextLine(); 
        System.out.print("\nMasukkan ID tugas (integer): ");
        int id = getInput();
        scn.nextLine(); 
        System.out.print("Masukkan deskripsi tugas: ");
        String description = scn.nextLine();

        tasks.add(new Task<>(id, description));
        System.out.println("\nTugas berhasil ditambahkan.");
    }

    private static void removeTask() {
        System.out.print("Masukkan ID tugas yang ingin dihapus: ");
        int id = getInput();
        
        boolean found = false;
        for (Task<Integer, String> task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                System.out.println("\nTugas berhasil dihapus.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nID tugas tidak ditemukan.");
        }
    }

    private static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("\nTidak ada tugas yang tersedia.");
        } else {
            System.out.println("\n=== Daftar Tugas ===");
            for (Task<Integer, String> task : tasks) {
                System.out.println(task);
            }
        }
    }
}
