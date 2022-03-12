public abstract class Enemies extends Entity
{
    int damage;
    int hp;

    public Enemies(int hp, int damage) // Sets up the super for HP and damage
    {
        super(hp, damage);
    }
    public int getHp() // Gets hp for the enemies
    {
        return hp;
    }
    public void setHp(int hp) // Sets HP for a enemy
    {
        this.hp = hp;
    }
    public int getDamage() // Receives damage input for an enemy
    {
        return damage;
    }
    public void setDamage(int damage) // Sets damage for the enemy
    {
        this.damage = damage;
    }
}
