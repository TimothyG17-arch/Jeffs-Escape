public class Item
{
    protected String name;
    protected String description;

    public Item(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    // Getters and Setters for name and description
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

    // toString method to print out name and description
    public String toString()
    {
        String displayString = "";

        displayString += "\nItem Name: " + name + "\n";
        displayString += "Description: " + description + "\n";

        return displayString;
    }
}
