import java.util.Random;

public class Roll // the purpose of roll is for the randomized attack damage done by you and your opponent
{

    public int Dice(int val) // the dice will have values from 1-20 and have breakpoints at 1-5, 6-10, 11-15, 16-20 that determine how much damage you or the enemy will do on your attack
    {
        int low = 1;
        int high = 21;

        Random dice = new Random();

        val = dice.nextInt(high-low) + low;

        //switch (val) {
        //case 1: case 2: case 3: case 4: case 5: System.out.println("Breakpoint #1"); break;
        //case 6: case 7: case 8: case 9: case 10: System.out.println("Breakpoint #2"); break;
        //case 11: case 12: case 13: case 14: case 15: System.out.println("Breakpoint #3"); break;
        //case 16: case 17: case 18: case 19: case 20: System.out.println("Breakpoint #4"); break;
        //}
        return val;
    }
}