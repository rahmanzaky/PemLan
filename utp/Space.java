import java.util.Scanner;

public class Space {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Ship player = new Ship(scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextBoolean());
        Ship enemy = new Ship(scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextBoolean());
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            String action = scn.next();
            switch (action) {
                case "shoot":
                    System.out.println(player.fireTorpedo(enemy));
                    break;
                case "shield":
                    System.out.println(player.createShield());
                    break;
                case "regen":
                    System.out.println(player.regenEnergy());
                    break;
                case "status":
                    player.showStatus();
                    break;
                default:
                    System.out.println("Invalid action, you lose your chance.");
            }

            if (enemy.getHp() <= 0) {
                System.out.println("You win!");
            } else if (player.getHp() <= 0) {
                System.out.println("You lose...");
            }
        }
    }
}

class Andromeda {
      //Isi dari class ini tidak boleh dirubah sama sekali
    private int hp;
    private int energy;

    public Andromeda(int hp, int energy) {
        this.hp = hp;
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHp() {
        return hp;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
class Ship extends Andromeda {
      //Isi dari class ini boleh dirubah penuh
    private final int torpedoCount;
    private final boolean shieldStatus;

    public Ship(int hp, int energy, int torpedoCount, boolean shieldStatus) {
        super(hp, energy);
        this.torpedoCount = torpedoCount;
        this.shieldStatus = shieldStatus;
    }

    public String fireTorpedo(Ship target) {
        if (getEnergy() >= 20 && torpedoCount > 0) {
            target.setHp(target.getHp() - 100);
            setEnergy(getEnergy() - 20);
            return "Shooting torpedo success. Torpedo left: " + (torpedoCount - 1) + ". Energy: " + getEnergy();
        } else if (torpedoCount == 0) {
            return "Shooting torpedo failed. Make sure you have enough torpedo.";
        } else {
            return "Shooting torpedo failed. Make sure you have enough energy.";
        }
    }

    public String createShield() {
        if (!shieldStatus) {
            return "Creating shield success";
        } else {
            return "Shield already active.";
        }
    }

    public String regenEnergy() {
        setEnergy(getEnergy() + 30);
        setHp(getHp() + 50);
        return "Regenerate energy success, your energy " + getEnergy();
    }

    public void showStatus() {
        System.out.println("Hp:" + getHp() + ", Energy:" + getEnergy() + ", Torpedo:" + torpedoCount + ", Shield:" + shieldStatus);
    }
}