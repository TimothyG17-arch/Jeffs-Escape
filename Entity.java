public abstract class Entity // Abstract so child classes can use the data
{
    protected int hp;
    protected int damage;

    public Entity (int hp, int damage) // Declares the HP and Damage
    {
        this.hp = hp;
        this.damage = damage;
    }
}
