public class Prisoner extends Enemies
{
    public Prisoner(int hp, int damage) {
        super(100, 10);
        this.hp = 100;
        this.damage = 10;
    }
    public int getHealth() {
        return hp;
    }
    public void setHp(int hp){
        this.hp =hp;
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
