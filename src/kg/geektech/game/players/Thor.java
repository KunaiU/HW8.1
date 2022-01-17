package kg.geektech.game.players;

import kg.geektech.game.general.RPG_gAME;

public class Thor extends Hero{
    public Thor(int health, int damage, String names) {
        super(health, damage, SuperAbility.STUN, names);
    }


    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int stunChance = RPG_gAME.random.nextInt(100) ;
        if (stunChance > 70){
            boss.setDamage(0);
            System.out.println("***Stunned***");
        }else {
            this.setDamage(getDamage());
        }
    }
}

