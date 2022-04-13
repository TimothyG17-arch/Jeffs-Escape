public class TheWarden extends Enemies
{
    public TheWarden(int hp, int damage) {
        super(300, 30);
        this.hp = 300;
        this.damage = 30;
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
