public class Chefs extends Enemies
{
    public Chefs(int hp, int damage) {
        super(150, 20);
        this.hp = 150;
        this.damage = 20;
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
