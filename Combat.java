import java.util.ArrayList;
import java.util.Scanner;

public class Combat
{

    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_BLACK = "\u001B[30m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_YELLOW = "\u001B[33m";
    final String ANSI_BLUE = "\u001B[34m";
    final String ANSI_PURPLE = "\u001B[35m";
    final String ANSI_CYAN = "\u001B[36m";
    final String ANSI_WHITE = "\u001B[37m";

    public int playerHp;
    public int enemyHp;
    public int playDmg;
    public int enemyDmg;
    public String playerText;
    public int checkP;
    public boolean looping;

    public Combat() {
        playerHp = 0;
        enemyHp = 0;
        playDmg = 0;
        enemyDmg = 0;
        playerText = "";
        checkP = 0;
    }
    public void enterCombat(Character cha, Enemies mo, int currentWeapon) {
        looping = false;
        playerHp = cha.getHp();
        enemyHp = mo.getHp();
        playDmg = cha.getDamage();
        enemyDmg = mo.getDamage();
        while (!looping) {
            if (checkP == 0) {
                System.out.println("\nPlayer's HP: " + playerHp + ". Opponent's HP: " + enemyHp + "\n");
                System.out.println("Type " + ANSI_PURPLE + "A" + ANSI_RESET + " to attack");
                playerText = k.nextLine().toLowerCase();

                if(playerText.equalsIgnoreCase("A"))
                {
                    int hit = enemyHp;
                    Roll dice = new Roll();
                    if (checkP == 0) {
                        enemyHp = enemyHp - (dice.Dice(playDmg) + currentWeapon);
                        checkP = 1;
                    } else {
                        playerHp = playerHp - dice.Dice(enemyDmg);;
                        checkP = 0;
                    }
                    System.out.println("\nHit for " + (hit - enemyHp));
                }
                else if(playerText.equalsIgnoreCase("instakill"))
                {
                    instakill();
                }
                else{
                    System.out.println("That's not a very valid action!");
                }
            } else
            {
                attack();
            }

            looping = die();
        }

    }
    private void attack() {
        Roll dice = new Roll();
        if (checkP == 0) {
            enemyHp = enemyHp - dice.Dice(playDmg);
            checkP = 1;
        } else {
            playerHp = playerHp - dice.Dice(enemyDmg);;
            checkP = 0;
        }
    }
    public boolean die() {
        if (enemyHp <= 0) {
            checkP = 0;
            return true;
        } else if (playerHp <= 0) {
            System.out.println("\nYou Dieded");
            System.exit(0);
        }
        return false;
    }

    public void instakill() {
        enemyHp = 0;
        playDmg = 1000;
        playerHp = 1000;
        System.out.println("Basically like nuking an ant");
    }

    public void addEnemies(Enemies enemy)
    {
        enemies.add(enemy);
    }

    public ArrayList<Enemies> enemies = new ArrayList<>();
    Scanner k = new Scanner(System.in);


}