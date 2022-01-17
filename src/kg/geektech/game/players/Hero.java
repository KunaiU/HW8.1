package kg.geektech.game.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {

    private SuperAbility ability; //Enum нуЖен чтобы отказатся от String
    private String names;

    public Hero(int health, int damage, SuperAbility ability, String names) {
        super(health, damage); //сначало идет родительский коснтруктор ОБЯЗАТЕЛЬНО!!!
        this.ability = ability;
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void setAbility(SuperAbility ability) {
        this.ability = ability;
    }
}
