public class NakedCowboys extends Enemies {
    public NakedCowboys() {
        super(110, 15);
        this.hp = 110;
        this.damage = 15;
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
