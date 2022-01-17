package kg.geektech.game.players;

import kg.geektech.game.general.RPG_gAME;

public class Golem extends Hero{
    private int absorbedDamage;
    public Golem(int health, int damage, String names, int absorbedDamage) {
        super(health, damage, SuperAbility.DAMAGE_ABSORBING, names);
        this.absorbedDamage = absorbedDamage;
    }
//19:10

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
if (RPG_gAME.random.nextInt(100)>75){
    boss.setDamage(boss.getDamage() - absorbedDamage);
}
    }
}
