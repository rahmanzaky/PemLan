/*
 * Nama file: Hero.java
 * Fungsi: class Hero untuk attributes dari HeroMain
 * Pemrogram: Rahman Zaky
 * NIM: 235150401111030
 * 
 */
package tugas3;

public class Hero {
    private String name;
    private int health;
    private int attackPower;
    private int defensePower;

    public Hero(){
        this.name = "Hero";
        this.health = 100;
        this.attackPower = 10;
        this.defensePower = 5;
    }

    public Hero(String name, int health, int attackPower, int defensePower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void attack(Hero enemy) {
        enemy.setHealth(enemy.getHealth() - (this.attackPower - enemy.getDefensePower()));
    }
    
    public void display() {
        System.out.println("Name            : " + this.name);
        System.out.println("Health          : " + this.health);
        System.out.println("Attack Power    : " + this.attackPower);
        System.out.println("Defense Power   : " + this.defensePower);
    }
}
