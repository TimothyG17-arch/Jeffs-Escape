public class mrBowlin extends Enemies
{
    public mrBowlin() {
        super(500, 50);
        this.hp = 500;
        this.damage = 50;
    }
    public int getHealth() {
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public int getDamage()
    {
        return damage;
    }
    public void setDamage(int damage)
    {
        this.damage = damage;
    }
}
