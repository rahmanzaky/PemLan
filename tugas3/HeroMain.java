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
                System.out.print("Nama hero         : ");
                hero1.setName(scn.nextLine());
            } catch (Exception e) {
                System.out.println("\nERROR: Input tidak valid");
                continue;
            }
            
            try {
                System.out.print("Health hero       : ");
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
                System.out.print("Attack hero       : ");
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
                System.out.print("Defense hero      : ");
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

        Hero hero2 = new Hero();
        playerLoop = true;

        do {
            System.out.println("\n==============================================================");
            System.out.println("Player 2: Silahkan masukkan hero Anda!");
            System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
            System.out.println("==============================================================");

            try {
                System.out.print("Nama hero         : ");
                hero2.setName(scn.nextLine());
            } catch (Exception e) {
                System.out.println("\n==============================");
                System.out.println("ERROR: Input tidak valid");
                System.out.println("==============================");
                continue;
            }
            
            try {
                System.out.print("Health hero       : ");
                int health2 = scn.nextInt();
                scn.nextLine();
                if (health2 >= 0 && health2 <= 500) {
                    hero2.setHealth(health2);
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
                System.out.print("Attack hero       : ");
                int power2 = scn.nextInt();
                if (power2 >= 0 && power2 <= 500) {
                    hero2.setAttackPower(power2);
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
                System.out.print("Defense hero      : ");
                int defense2 = scn.nextInt();
                if (defense2 >= 0 && defense2 <= 500) {
                    hero2.setDefensePower(defense2);
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
