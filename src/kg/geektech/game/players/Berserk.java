package kg.geektech.game.players;

public class Berserk extends Hero{
    public Berserk(int health, int damage, String names) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, names);
    }


    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
boss.setHealth(boss.getHealth() - boss.getDamage());
    }
}
