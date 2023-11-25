package kg.geeks.game.plays;

public class Wither extends Hero{

    private int numbOfLives;

    public int getNumbOfLives() {
        return numbOfLives;
    }

    public Wither(int health, int damage, String name) {
        super(health, damage, SuperAbility.REVAVE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0 && this != heroes[i]){
                heroes[i].setHealth(heroes[i].getHealth() + this.getHealth());
                this.setHealth(0);

            }
        }

    }
}
