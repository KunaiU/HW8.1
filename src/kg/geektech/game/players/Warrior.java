package kg.geektech.game.players;

import kg.geektech.game.general.RPG_gAME;

public class Warrior extends Hero{
    private int dopDamage;
    public Warrior(int health, int damage, String names, int dopDamage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, names);
        this.dopDamage = dopDamage;
    }
//19:10

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        heroes[0].setDamage(heroes[0].getDamage() + dopDamage);

    }
}
