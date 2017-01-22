package Entities.Monster;

import Entities.Character;
import Entities.IActions;

import java.util.Random;

/**
 * Created by Catalin on 01.01.2017.
 */
public class WizardMonster extends MonsterCharacter implements IActions {

    public WizardMonster() {
        Random rand = new Random();
        setRaceName("Lil' Wizard");
        setHealthPoints(rand.nextInt(10) + 5);
        int randomPoints = rand.nextInt((int) (0.80 * getHealthPoints())) + 5;
        setAttackPoints(randomPoints);
        setSkills(MagicalSkills.FIRE_ATTACK);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\t New monster appear! It's a " + getRaceName()
                + "\n\t*STATS: HP=" + getHealthPoints() + " Attack=" + getAttackPoints() + "\n\t*Attributes: Strength="
                + getAttackStrengthPoints() + " Defense=" + getDefensePoints() + "\n\t Watch out on " + getSkills());
    }

    @Override
    public void Attack(Character enemy) {
        Random rand = new Random();
        int testRand = rand.nextInt(1) + 0;
        if (testRand == 1){
            setAttackStrengthPoints(2);
            System.out.println(getRaceName()+"'s strength increase by 2.");
        }
        int enemyHealthPoints = enemy.getHealthPoints();
        int damage;
        testRand = rand.nextInt(4) + 0;
        if (testRand == 0)
            damage = rand.nextInt(getAttackPoints() + getAttackStrengthPoints()) + getAttackPoints() - 4;
        else {
            int fireAttack = rand.nextInt(4) + 1;
            System.out.println("[FIRE ATTACK]: " + fireAttack + "DMG");
            damage = (rand.nextInt(getAttackPoints() + getAttackStrengthPoints()) + getAttackPoints() - 4) + fireAttack;
        }
        int currentDefense = enemyHealthPoints + getDefensePoints();
        enemy.setHealthPoints(currentDefense - damage);
        System.out.println("\n==> " + getRaceName() + " deal " + damage + "DMG | Your health: " + enemy.getHealthPoints() + "\n");
    }
}
