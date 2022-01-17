package kg.geektech.game.players;

import kg.geektech.game.general.RPG_gAME;

public class Witcher extends Hero {
    public Witcher(int health, int damage, String names) {
        super(health, damage, SuperAbility.REHABILITATION, names);
    }


    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() == 0) {
                heroes[i].setHealth(heroes[i].getHealth() + 150);
                heroes[7].setHealth(0);
                break;
            }
if (heroes[7].getDamage() > 0){
    heroes[i].setDamage(0);
}
        }
    }
}