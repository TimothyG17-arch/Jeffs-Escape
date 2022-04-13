public class Guards extends Enemies{
    public Guards(int hp, int damage) {
        super(125, 20);
        this.hp = 125;
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
