package kg.geeks.game.plays;

import kg.geeks.logic.RPG_Game;

import java.util.Arrays;

public class Boss extends GameEntity {
    private SuperAbility defence;

    public Boss(int health, int damage, String name) {
        super(health, damage, name);
    }

    public void chooseDefence() {
        SuperAbility[] variants = SuperAbility.values();
        System.out.println(Arrays.toString(variants));

        int randIndex = RPG_Game.random.nextInt(variants.length);
        this.defence = variants[randIndex];
    }

    public void attack(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                if (heroes[i] instanceof Berserk) {
                    boolean bigChance = RPG_Game.random.nextBoolean();
                    ((Berserk) heroes[i]).setBlockedDamage(this.getDamage() /
                            (bigChance ? 5 : 10));
                    heroes[i].setHealth(heroes[i].getHealth() -
                            (this.getDamage() - ((Berserk) heroes[i]).getBlockedDamage()));

                } else {
                    heroes[i].setHealth(heroes[i].getHealth() - this.getDamage());

                }
            }
        }
    }
        public SuperAbility getDefence () {
            return defence;
        }

        public String toString(){
        return "BOSS " + super.toString() + " DEFENCE: " + this.defence;

        }
    }
