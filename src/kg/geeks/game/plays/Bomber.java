package kg.geeks.game.plays;

public class Bomber extends Hero{
    public Bomber(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOMB, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() <= 0){
            boss.setHealth(boss.getHealth() - 100);
            System.out.println("Bomber died, but damaged BOSS");

        }

    }
}
