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
            "Free to roam the now empty kitchen, Jeff notices an " + ANSI_BLACK + "unlabelled door. " + ANSI_RESET + "Taking his chance, he walks in and sees... " + ANSI_RED + "meat. meat. infinite meat. \n" + ANSI_RESET + "This seems as good a place as any to settle down and live the rest of his life.",
            "After Jeff found a " + ANSI_PURPLE + "loving " + ANSI_RESET + "and " + ANSI_YELLOW + "caring " + ANSI_RESET + "community in the showers of "+ANSI_WHITE+"Ram Ranch "+ANSI_RESET+"he was quickly "+ ANSI_YELLOW+"indoctrinated"+ANSI_RESET+"\nin to the Council of Cowboys and  became the 19th Naked Cowboy" + ANSI_RESET,
            "Filled with " + ANSI_BLACK + "crushing regret" + ANSI_RESET + " over his unlawful " + ANSI_RED + "murder " + ANSI_RESET +  "of an honest man, Jeff decides to throw himself down that big hole at the end of the bowlin lane." + ANSI_RED + " Instant" + ANSI_BLACK + " Death." + ANSI_RESET,
            "In his " + ANSI_BLACK + "dying breath " + ANSI_RESET + "Warden Hall looks up at you. He " + ANSI_YELLOW + "smiles " + ANSI_RESET + "for the first time in years. Jeff hops in the " + ANSI_BLUE + "launch pod to escape " + ANSI_CYAN + "home."
    };

    // USAGE: In driver call dialogue.cmbDialogue("Tony", "Wanna fight?", "Yeah");
    public void cmbDialogue(String enemyName, String enemyDialogue, String jeffDialogue){
        System.out.println(ANSI_RED + enemyName + ANSI_RESET + ": " + enemyDialogue);
        System.out.println(ANSI_GREEN + "Jeff" + ANSI_RESET + ": " + jeffDialogue);
    }
    public void directionDialogue(String direction){
        System.out.println("\nYou've decided to go to the " + ANSI_YELLOW + direction + ANSI_RESET + "\n");
    }
}