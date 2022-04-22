import java.util.ArrayList;

public class Area {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    String name;
    ArrayList<String> areas = new ArrayList<String>();

    public Area(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "You are currently in the " + ANSI_GREEN + name + ANSI_RESET + ", type an area name to go there: " + ANSI_YELLOW + areas + ANSI_RESET + "\n";
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getExits() {
        return areas;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExits(ArrayList<String> exits) {
        this.areas = exits;
    }
}
