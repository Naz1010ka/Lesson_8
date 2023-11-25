package kg.geeks.game.plays;

public abstract class Hero extends GameEntity
        implements HavingSuperAbility {
    private SuperAbility ability;

    public void attack(Boss boss){
        boss.setHealth(boss.getHealth()- this.getDamage());
    }


    public SuperAbility getAbility() {
        return ability;
    }

    public Hero(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, name);
        this.ability = ability;
    }
}
