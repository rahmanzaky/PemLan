/*
 * Nama file: HeroMain.java
 * Fungsi: Main class untuk permainan adu hero
 * Pemrogram: Rahman Zaky
 * NIM: 235150401111030
 * 
 */
package tugas3;

import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean playerLoop = true;
        System.out.println("\n===================");
        System.out.println("Permainan adu hero");
        System.out.println("by Rahman Zaky");
        System.out.println("===================");

        Hero hero1 = new Hero();
        do {
            System.out.println("\n==============================================================");
            System.out.println("Player 1: Silahkan masukkan hero Anda!");
            System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
            System.out.println("==============================================================");

            try {
                System.out.print("Nama Hero           : ");
                hero1.setName(scn.nextLine());
            } catch (Exception e) {
                System.out.println("\nERROR: Input tidak valid");
                continue;
            }
            
            try {
                System.out.print("Health Point        : ");
                int health1 = scn.nextInt();
                if (health1 >= 0 && health1 <= 500) {
                    hero1.setHealth(health1);
                } else {
                    System.out.println("ERROR: Input tidak valid");
                    scn.nextLine();
                    continue;
                }
            } catch (Exception e) {
                System.out.println("ERROR: Input tidak valid");
                scn.nextLine();
                continue;
            }
            
            try {
                System.out.print("Attack Power        : ");
                int power1 = scn.nextInt();
                if (power1 >= 0 && power1 <= 500) {
                    hero1.setAttackPower(power1);
                } else {
                    System.out.println("ERROR: Input tidak valid");
                    scn.nextLine();
                    continue;
                }
            } catch (Exception e) {
                System.out.println("ERROR: Input tidak valid");
                scn.nextLine();
                continue;
            }

            try {
                System.out.print("Defense Point       : ");
                int defense1 = scn.nextInt();
                scn.nextLine();
                if (defense1 >= 0 && defense1 <= 500) {
                    hero1.setDefensePower(defense1);
                } else {
                    System.out.println("ERROR: Input tidak valid");
                    scn.nextLine();
                    continue;
                }

            } catch (Exception e) {
                System.out.println("ERROR: Input tidak valid");
                scn.nextLine();
                continue;
            }
            System.out.println("==============================================================");

            playerLoop = false;
        } while (playerLoop);


        String name2 = "";
        int inputHealth2 = 0;
        int inputPower2 = 0;
        int inputDefense2 = 0;

        int health2 = 0;
        int power2 = 0;
        int defense2 = 0;

        playerLoop = true;

        do {
            System.out.println("\n==============================================================");
            System.out.println("Player 2: Silahkan masukkan hero Anda!");
            System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
            System.out.println("==============================================================");

            try {
                System.out.print("Nama Hero           : ");
                name2 = scn.nextLine();
            } catch (Exception e) {
                System.out.println("\n==============================");
                System.out.println("ERROR: Input tidak valid");
                System.out.println("==============================");
                continue;
            }
            
            try {
                System.out.print("Health Point        : ");
                inputHealth2 = scn.nextInt();
                scn.nextLine();
                if (inputHealth2 >= 0 && inputHealth2 <= 500) {
                    health2 = inputHealth2;
                } else {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input tidak valid");
                    System.out.println("==============================");
                    scn.nextLine();
                    continue;
                }
            } catch (Exception e) {
                System.out.println("\n==============================");
                System.out.println("ERROR: Input tidak valid");
                System.out.println("==============================");
                scn.nextLine();
                continue;
            }
            
            try {
                System.out.print("Attack Power        : ");
                inputPower2 = scn.nextInt();
                if (inputPower2 >= 0 && inputPower2 <= 500) {
                    power2 = inputPower2;
                } else {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input tidak valid");
                    System.out.println("==============================");
                    scn.nextLine();
                    continue;
                }
            } catch (Exception e) {
                System.out.println("\n==============================");
                System.out.println("ERROR: Input tidak valid");
                System.out.println("==============================");
                scn.nextLine();
                continue;
            }

            try {
                System.out.print("Defense Point       : ");
                inputDefense2 = scn.nextInt();
                if (inputDefense2 >= 0 && inputDefense2 <= 500) {
                    defense2 = inputDefense2;
                } else {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input tidak valid");
                    System.out.println("==============================");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("==============================");
                System.out.println("ERROR: Input tidak valid");
                System.out.println("==============================");
                scn.nextLine();
                continue;
            }
            System.out.println("==============================================================");

            playerLoop = false;
        } while (playerLoop);

        Hero hero2 = new Hero(name2, health2, power2, defense2);
        
        System.out.println("\n==============================================================");
        System.out.println("Pertarungan dimulai!");
        System.out.println("==============================================================");

        int round = 1;
        int hero1Health = 0;
        int hero2Health = 0;
        while (hero1.getHealth() >= 0 && hero2.getHealth() >= 0) {
            System.out.println("\n====================================");
            System.out.println("Ronde " + round++);
            System.out.println("====================================");
            System.out.println("====================================");
            System.out.println(hero1.getName() + " menyerang " + hero2.getName() + "!\n");
    
            System.out.printf("%-30s: %3d\n", hero1.getName() + " menyerang sebesar", hero1.getAttackPower());
            System.out.printf("%-30s: %3d\n", hero2.getName() + " bertahan sebesar", hero2.getDefensePower());
            hero1.attack(hero2);

            hero2Health = Math.max(hero2.getHealth(), 0);
            System.out.printf("%-30s: %3d\n", "Health " + hero2.getName() + " tersisa", hero2Health);
        
            System.out.println();
            System.out.println(hero2.getName() + " menyerang " + hero1.getName() + "!\n");
        
            System.out.printf("%-30s: %3d\n", hero2.getName() + " menyerang sebesar", hero2.getAttackPower());
            System.out.printf("%-30s: %3d\n", hero1.getName() + " bertahan sebesar", hero1.getDefensePower());
            hero2.attack(hero1);

            hero1Health = Math.max(hero1.getHealth(), 0);
            System.out.printf("%-30s: %3d\n", "Health " + hero1.getName() + " tersisa", hero1Health);
            System.out.println("====================================\n");

            if (hero1.getHealth() <= 0 || hero2.getHealth() <= 0) {
                break;
            }
        }
        

        System.out.println("\n==============================================================");
        System.out.println("Hasil pertarungan:");
        System.out.println("==============================================================");
        if (hero1.getHealth() > 0) {
            System.out.println("Pemenang: " + hero1.getName());
            System.out.println("Sisa health: " + hero1Health);
        } else {
            System.out.println("Pemenang: " + hero2.getName());
            System.out.println("Sisa health: " + hero2Health);
        }
        System.out.println("==============================================================");

        scn.close();


    }
}
