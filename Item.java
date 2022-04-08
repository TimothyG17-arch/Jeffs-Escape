public class Item
{
    protected String name;
    protected String description;
    protected int stats;

    public Item(String name, String description, int stats)
    {
        this.name = name;
        this.description = description;
        this.stats = stats;
    }

    // Getters and Setters for name, description, and stats
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStats() {
        return stats;
    }

    public void setStats(int stats) {
        this.stats = stats;
    }

    // toString method to print out name and description
    public String toString()
    {
        String displayString = "";

        displayString += "\nItem Name: " + name + "\n";
        displayString += "Description: " + description + "\n";
        displayString += "Stats: " + stats;

        return displayString;
    }
}
