public class Weapon extends Item
{
    int damage;

    public Weapon(String name, String description) {
        super(name, description);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
