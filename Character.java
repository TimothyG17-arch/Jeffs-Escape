public class Character extends Entity
{
    private int damage;
    private int hp; // This value is intended to stay constant. Idea is to heal to full after combat is over.

    public Character() // Character constructor
    {
        super(200, 20);
        this.hp = 200;
        this.damage = 20;
    }
    public static Character player = new Character();
    public int getDamage() // Gets the damage that character is able to deal
    {
        return damage;
    }
    public void setDamage(int damage) // Sets the Character's default damage
    {
        this.damage = damage;
    }
    public int getHp() // Gets the HP for character
    {
        return hp;
    }
    public void setHp(int hp) // Sets the Character's default HP
    {
        this.hp = hp;
    }
}