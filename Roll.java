import java.util.Random;

public class Roll // the purpose of roll is for the randomized attack damage done by you and your opponent
{
    int val = 0;

    public int Dice() // the dice will have values from 1-20 and have breakpoints at 1-5, 6-10, 11-15, 16-20 that determine how much damage you or the enemy will do on your attack
    {
        int low = 1;
        int high = 21;

        Random dice = new Random();

        val = dice.nextInt(high-low) + low;

        return val;
    }
}