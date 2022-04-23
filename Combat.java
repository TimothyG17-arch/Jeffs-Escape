
import java.util.ArrayList;
import java.util.Scanner;

public class Combat
{
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


    public void enterCombat(Character cha, Enemies mo) {
        playerHp = cha.getHp();
        enemyHp = mo.getHp();
        playDmg = cha.getDamage();
        enemyDmg =mo.getDamage();
        while (!looping) {
            if (checkP == 0) {
                System.out.println("\n Current Player HP " + playerHp + ". Enemy is a chonky " + enemyHp + " HP well shit.\n");
                System.out.println("This guy built diff on god\nToo bad god hall says you have to fight");
                System.out.println("Type gluten to attack or quit to end game");
                playerText = k.nextLine().toLowerCase();

                if(playerText.equals("gluten"))
                {
                    int hit = enemyHp;
                    attack();
                    System.out.println("Hit for " + (hit - enemyHp));
                }
                else if(playerText.equals("instakill"))
                {
                    instakill();
                }
                else{
                    System.out.println("HIT HIMMMMMM");
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
            System.out.println("\n You got shit on RIP ig *insert wilhiem scream*");
            System.exit(0);
        } else {
            System.out.println(" HIT HIM AGAIN, I SAID HIT HIM AGAIN");
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
