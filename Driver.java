import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        Scanner scanner = new Scanner(System.in);

        Locations locations = new Locations();

        TheWarden warden = new TheWarden();
        mrBowlin bowlin = new mrBowlin();
        Guards guard = new Guards();
        Chefs chef = new Chefs();
        Prisoner prisoner = new Prisoner();
        NakedCowboys nakedcowboy = new NakedCowboys();

        Combat combat = new Combat();

        combat.addEnemies(prisoner);        // 0
        combat.addEnemies(guard);           // 1
        combat.addEnemies(chef);            // 2
        combat.addEnemies(nakedcowboy);     // 3
        combat.addEnemies(warden);          // 4
        combat.addEnemies(bowlin);          // 5

        Weapon cellkeycard = new Weapon("Cell Keycard", "It's a little bit sharp. Not really though. Good luck.");
        cellkeycard.setDamage(5); //obtained as starting weapon
        Weapon spork = new Weapon("Spork", "Arguably worse than your fists in combat but now you can eat salad and still look civilized.");
        spork.setDamage(10); //obtained from winning a fight in any of the blocks
        Weapon shampoobottle = new Weapon("Shampoo Bottle", "Who filled this with hydrochloric acid? No idea but it's useful");
        shampoobottle.setDamage(15); //obtained on entering showers and before your fight in the showers
        Weapon hardenedsteak = new Weapon("Hardened Steak", "Ready to meat your opponents");
        hardenedsteak.setDamage(15); //obtained from winning a fight in the dining hall
        Weapon gun = new Weapon("Gun", "Jesus Christ, what have you come to Jeff? A lethal weapon? What are you doing man, what are you doing?");
        gun.setDamage(999); //obtained from winning a fight in the gourd office
        Weapon bowlinball = new Weapon("Bowlin Ball", "Hauntingly handsome, perhaps it resembles it's previous owner?");
        bowlinball.setDamage(500); //obtained before your fight with Mr. Bowlin

        Area centerblock = new Area("Center Block");
        centerblock.areas.add("North Block");
        centerblock.areas.add("South Block");
        centerblock.areas.add("West Block");
        centerblock.areas.add("East Block");
        locations.addArea("Center Block", centerblock);

        Area northblock = new Area("North Block");
        northblock.areas.add("Center Block");
        northblock.areas.add("The Bowlin Arena");
        northblock.areas.add("Dining Hall");
        locations.addArea("North Block", northblock);

        Area southblock = new Area("South Block");
        southblock.areas.add("Center Block");
        southblock.areas.add("Gourd Office");
        southblock.areas.add("Showers");
        locations.addArea("South Block", southblock);

        Area westblock = new Area("West Block");
        westblock.areas.add("Center Block");
        westblock.areas.add("Gourd Office");
        locations.addArea("West Block", westblock);

        Area eastblock = new Area("East Block");
        eastblock.areas.add("Center Block");
        eastblock.areas.add("Dining Hall");
        eastblock.areas.add("Showers");
        locations.addArea("East Block", eastblock);

        Area showers = new Area("Showers");
        showers.areas.add("East Block");
        showers.areas.add("South Block");
        locations.addArea("Showers", showers);

        Area dininghall = new Area("Dining Hall");
        dininghall.areas.add("North Block");
        dininghall.areas.add("East Block");
        dininghall.areas.add("Kitchen");
        locations.addArea("Dining Hall", dininghall);

        Area kitchen = new Area("Kitchen");
        kitchen.areas.add("Dining Hall");
        locations.addArea("Showers", showers);

        Area bowlinarena = new Area("The Bowlin Arena");
        bowlinarena.areas.add("North Block");
        locations.addArea("The Bowlin Arena", bowlinarena);

        Area gourdoffice = new Area("Gourd Office");
        gourdoffice.areas.add("South Block");
        gourdoffice.areas.add("West Block");
        gourdoffice.areas.add("Warden Hall");
        locations.addArea("Gourd Office", gourdoffice);

        Area wardenhall = new Area("Warden Hall");
        wardenhall.areas.add("Gourd Office");
        locations.addArea("Warden Hall", wardenhall);

        Dialogue dialogue = new Dialogue();

        int currentWeapon = cellkeycard.getDamage();

        System.out.println(dialogue.introduction);

        System.out.println(dialogue.mainstorydialogue[0]);

        System.out.println(centerblock);

        String direction = scanner.nextLine();

        dialogue.directionDialogue(direction);

        boolean bool = true;

        while(bool) {

            if (direction.equalsIgnoreCase("center block")) {
                System.out.println(centerblock);

            } else if (direction.equalsIgnoreCase("north block")) {
                dialogue.cmbDialogue("Prisoner #468", "Hey! You! Let me out!", "No? Why lol? Sucks for you I guess.");
                System.out.println("\n" + ANSI_RED + "Prisoner #468 " + ANSI_RESET + "becomes so angry he bends the cell bars with his mind and crawls out. Get ready.");
                combat.enterCombat(Character.player, combat.enemies.get(0), currentWeapon);
                System.out.println("\nJeff stands victorious.\n");
                System.out.println(northblock);
                currentWeapon = spork.getDamage();
                System.out.println(spork);

            } else if (direction.equalsIgnoreCase("south block")) {
                dialogue.cmbDialogue("Patrick Bateman", "Out of my way, I have to return some videotapes.", "I'll be taking those.");
                combat.enterCombat(Character.player, combat.enemies.get(0), currentWeapon);
                System.out.println("\nJeff stands victorious.\n");
                System.out.println(southblock);
                currentWeapon = spork.getDamage();
                System.out.println(spork);

            } else if (direction.equalsIgnoreCase("west block")) {
                dialogue.cmbDialogue("Ex", "Hey, I really miss you, I was thi-", "Seriously? How'd you get up here? Why? It's been seven year Melanie! Give me peace!");
                combat.enterCombat(Character.player, combat.enemies.get(0), currentWeapon);
                System.out.println("\nJeff stands victorious.\n");
                System.out.println(westblock);
                currentWeapon = spork.getDamage();
                System.out.println(spork);

            } else if (direction.equalsIgnoreCase("east block")) {
                dialogue.cmbDialogue("Space Crab", "*clickclick clackclick*", "I'm feeling a bit crabby today.");
                combat.enterCombat(Character.player, combat.enemies.get(0), currentWeapon);
                System.out.println("\nJeff stands victorious.\n");
                System.out.println(eastblock);
                currentWeapon = spork.getDamage();
                System.out.println(spork);

            } else if (direction.equalsIgnoreCase("showers")) {
                currentWeapon = shampoobottle.getDamage();
                System.out.println(shampoobottle);
                dialogue.cmbDialogue("Naked Cowboy", "Cowboys in the showers at Ram Ranch!", "Ram Ranch really rocks!");
                combat.enterCombat(Character.player, combat.enemies.get(3), currentWeapon);
                System.out.println(dialogue.mainstorydialogue[2]);
                System.exit(0);

            } else if (direction.equalsIgnoreCase("dining hall")) {
                dialogue.cmbDialogue("CONSUMER", "CONSUUUUUUMMMMEEEEE", "Jesus Christ");
                combat.enterCombat(Character.player, combat.enemies.get(3), currentWeapon);
                System.out.println("\nJeff stands victorious.\n");
                System.out.println(dininghall);
                currentWeapon = hardenedsteak.getDamage();
                System.out.println(shampoobottle);

            } else if (direction.equalsIgnoreCase("kitchen")) {
                dialogue.cmbDialogue("Le Chef", "Hon hon hon baguette eiffel tower *brandishes wine bottle*", "I gotta get out of here.");
                combat.enterCombat(Character.player, combat.enemies.get(2), currentWeapon);
                System.out.println("\nJeff stands victorious.\n");
                System.out.println(dialogue.mainstorydialogue[1]);
                System.exit(0);

            } else if (direction.equalsIgnoreCase("the bowlin arena")) {
                currentWeapon = bowlinball.getDamage();
                System.out.println(bowlinball);
                dialogue.cmbDialogue("Mister Bowlin", "My name is Edgar Bowlin III. I'm 26 years old. My house is in Kingsport, where all the houses are, and I am not married. I work as an employee for the \nEast Tennessee State University, and I get home every day by 8 PM at the latest. I don't smoke, but I occasionally drink. I'm in bed by 11 PM, and make sure I get eight \nhours of sleep, no matter what. After having a glass of warm milk and doing about twenty minutes of stretches before going to bed, I usually have no problems sleeping \nuntil morning. Just like a baby, I wake up without any fatigue or stress in the morning. I was told there were no issues at my last check-up. I'm trying to explain that \nI'm a person who wishes to live a very quiet life. I take care not to trouble myself with any enemies, like winning and losing, that would cause me to lose sleep at night. \nThat is how I deal with society, and I know that is what brings me happiness. Although, if I were to fight I wouldn't lose to anyone.", "Yes.");
                combat.enterCombat(Character.player, combat.enemies.get(5), currentWeapon);
                System.out.println("\nAs Mister Bowlin walked up to the lane, jeff struck him on the head from behind with a bowlin ball. All is fair in war.\n");
                System.out.println(dialogue.mainstorydialogue[3]);
                System.exit(0);

            } else if (direction.equalsIgnoreCase("gourd office")) {
                dialogue.cmbDialogue("Gourd Officer", "Oi oi oi, yew hav a license for thaht??", "God save the queen");
                combat.enterCombat(Character.player, combat.enemies.get(1), currentWeapon);
                System.out.println("\nJeff stands victorious.\n");
                System.out.println(gourdoffice);
                currentWeapon = gun.getDamage();
                System.out.println(gun);

            } else if (direction.equalsIgnoreCase("warden hall")) {
                dialogue.cmbDialogue("The Warden, Hall", "I'm so tired. Let's get this over with.", "You were a good warden. The best.");
                combat.enterCombat(Character.player, combat.enemies.get(4), currentWeapon);
                System.out.println(dialogue.mainstorydialogue[4]);
                System.exit(0);
            }

            direction = scanner.nextLine();

            dialogue.directionDialogue(direction);
        }
    }
}
