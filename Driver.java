import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Combat combat = new Combat();
        Locations locations = new Locations();
        Character cha = new Character();

        TheWarden ward = new TheWarden();
        mrBowlin bowl = new mrBowlin();
        Guards guard = new Guards();
        Chefs chef = new Chefs();
        Prisoner prison = new Prisoner();
        NakedCowboys nakedCowboys = new NakedCowboys();

        Item diningkeycard = new Item("Dining Hall Keycard", "This lets you into the dining hall. Vegan options included.");
        combat.addEnemies(bowl);
        combat.addEnemies(ward);
        combat.addEnemies(guard);
        combat.addEnemies(prison);
        combat.addEnemies(chef);
        combat.addEnemies(nakedCowboys);


        Weapon cellkeycard = new Weapon("Cell Keycard", "It's a little bit sharp. Not really though. Good luck.");
        cellkeycard.setDamage(5); //obtained as starting weapon
        Weapon spork = new Weapon("Spork", "Arguably worse than your fists in combat but now you can eat salad and still look civilized.");
        spork.setDamage(10); //obtained from winning a fight in any of the blocks
        Weapon shampoobottle = new Weapon("Shampoo Bottle", "Who filled this with hydrochloric acid? No idea but it's useful");
        shampoobottle.setDamage(15); //obtained on entering showers and before your fight in the showers
        Weapon hardenedsteak = new Weapon("Hardened Steak", "Ready to meat your opponents");
        hardenedsteak.setDamage(15); //obtained from winning a fight in the dining hall
        Weapon gun = new Weapon("Gun", "Jesus Christ, what have you come to Jeff? A lethal weapon? What are you doing man, what are you doing?");
        gun.setDamage(999); //obtained from winning a fight in the guard office
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

        System.out.println(dialogue.introduction);

        System.out.println(dialogue.mainstorydialogue[0]);

        System.out.println(centerblock);


        String direction = scanner.nextLine();

        dialogue.directionDialogue(direction);
        boolean bool = true;
        while (bool) {
            if (direction.equalsIgnoreCase("center block")) {
                System.out.println("Center Block");
                combat.enterCombat(Character.player, combat.enemies.get(3));
            } else if (direction.equalsIgnoreCase("north block")) {
                System.out.println(northblock);
            } else if (direction.equalsIgnoreCase("south block")) {
                System.out.println(southblock);
            } else if (direction.equalsIgnoreCase("west block")) {
                System.out.println(westblock);
            } else if (direction.equalsIgnoreCase("east block")) {
                System.out.println(eastblock);
            } else if (direction.equalsIgnoreCase("showers")) {
                System.out.println(showers);
            } else if (direction.equalsIgnoreCase("dining hall")) {
                System.out.println(dininghall);
            } else if (direction.equalsIgnoreCase("kitchen")) {
                System.out.println(kitchen);
            } else if (direction.equalsIgnoreCase("the bowlin arena")) {
                System.out.println(bowlinarena);
            } else if (direction.equalsIgnoreCase("gourd office")) {
                System.out.println(gourdoffice);
            } else if (direction.equalsIgnoreCase("warden hall")) {
                System.out.println(wardenhall);
                bool = false;
            }
            direction = scanner.nextLine();
            dialogue.directionDialogue(direction);

        }
        //dialogue.cmbDialogue("Prisoner #468", "Hey! You! Let me out!", "THIS DIALOGUE LINE IS TESTING");

        //System.out.println(cellkeycard.getDamage());
        //System.out.println(cellkeycard.getDescription());

    }
}
