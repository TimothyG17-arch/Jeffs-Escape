
import java.util.Scanner;
public class Combat
{
    private int playerHp;
    private int enemyHp;
    private int playDmg;
    private int enemyDmg;
    private String playerText;
    private int checkP;
    private boolean looping;
    Scanner k = new Scanner(System.in);
    private Combat()
    {
        playerHp = 0;
        enemyHp = 0;
        playDmg = 0;
        enemyDmg = 0;
        playerText= "";
        checkP = 0;
        looping = true;
    }
    public void enterCombat(Character cha,Enemies mo){
        playerHp = cha.getHp();
        enemyHp = mo.getHp();
        playDmg = cha.getDamage();
        while(!looping)
        {
            if (checkP == 0)
            {
                System.out.println("\n Current Player HP " + playerHp + ". Enemy is a chonky " + enemyHp + "well shit.\n");
                System.out.println("This guy built diff on god\n Too bad god hall says you have to fight");
                System.out.println("Type Thwomp to attack or quit to end game");
                playerText = k.nextLine().toLowerCase();
                if (playerText.equals("Thwomp")) {
                    attack();
                    System.out.println("\nYou Thwomped him for " + (enemyHp - playDmg) + " damage.\n");
                }
                else if (playerText.equals("quit"))
                {
                    System.exit(0);
                }
                else if(playerText.equals("bonk"))
                {
                    instakill();
                }
            }
            else
            {
                attack();
            }
            looping = die();
        }

    }
    private void attack()
    {
        Roll Dice = new Roll();
        if(checkP == 0)
        {
            enemyHp = enemyHp - Dice.val;
            checkP = 1;
        }
        else
        {
            playerHp =playerHp - Dice.val;
            checkP = 0;
        }

    }
    public boolean die()
    {
        if(enemyHp <= 0)
        {
            checkP = 0;
            return true;
        }
        else if(playerHp <= 0)
        {
            System.out.println("\n You got shit on RIP ig *insert wilhiem scream*");
            System.exit(0);
        }
        else
        {
            System.out.println(" HIT HIM AGAIN, I SAID HIT HIM AGAIN");
        }
        return false;
    }
    public void instakill()
    {
        enemyHp = 0;
        playDmg=1000;
        playerHp=1000;
        System.out.println("Basically like nuking an ant");
    }
}
