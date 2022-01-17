package kg.geektech.game.players;

public class Medic extends Hero{
    private int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public Medic(int health, int damage, int healPoints, String names) {
        super(health, damage, SuperAbility.HEAL, names);
        this.healPoints = healPoints;
    }


    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() < 0 && heroes[i].getNames() != this.getNames()){
            heroes[i].setHealth(heroes[i].getHealth() + this.healPoints);
            //19:45
        }

    }
}
}
