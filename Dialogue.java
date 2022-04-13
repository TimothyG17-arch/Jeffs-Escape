public class Dialogue
{

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // USAGE: In driver put System.out.println(dialogue.introduction);
    String introduction = "\nA long time ago in a galaxy far, far away.... \nImprisoned for gourd larcency, Jeff is given a second chance.\nNot by the heavens nor earthly justice, but a very silly prison guard. \nThis is his story.\n\n--------------------------------------------------------------------------------------------------------";

    // USAGE: In driver put System.out.println(dialogue.storydialogue[1]);
    String[] mainstorydialogue = {
            ANSI_BLUE + "\ndrip...drip...drip..." + ANSI_CYAN + "drop?" + ANSI_RESET + "\nJeff gazes at the ground just outside of his cell, and spots a key left in the wake of retreating footsteps.\nNot one for missed opportunities, Jeff waits for silence before grabbing for the key and unlocking his cell.\n\n--------------------------------------------------------------------------------------------------------\n",
            "inserteventhere",
            "inserteventhere",
            "inserteventhere"
    };

    // USAGE: In driver call dialogue.cmbDialogue("Tony", "Maidenless?", "Yeah");
    public void cmbDialogue(String enemyName, String enemyDialogue, String jeffDialogue){
        System.out.println(ANSI_RED + enemyName + ANSI_RESET + ": " + enemyDialogue);
        System.out.println(ANSI_GREEN + "Jeff" + ANSI_RESET + ": " + jeffDialogue);
    }
    public void directionDialogue(String direction){
        System.out.println("\nYou've decided to go to the " + ANSI_YELLOW + direction);
    }
}