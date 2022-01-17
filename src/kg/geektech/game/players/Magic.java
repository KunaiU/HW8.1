package kg.geektech.game.players;

import kg.geektech.game.general.RPG_gAME;

public class Magic extends Hero{
    public Magic(int health, int damage, String names) {
        super(health, damage, SuperAbility.BOOST, names);
    }


    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int number = RPG_gAME.random.nextInt(5) + 1;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i])
            heroes[i].setDamage(heroes[i].getDamage() + number);

        }

    }
}
