package Entities;

import java.util.Random;

/**
 * Created by Catalin on 01.01.2017.
 */
public class HeroCharacter extends Character implements IActions{
    private String name;
    private int experiencePoints = 0;

    private int year, month, day;

    public HeroCharacter(String name, int year, int month, int day) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        setHealthPoints(100);
        setAttackPoints(10);
        System.out.println("\tWelcome " + getName() + " | Birthday: " + getBirthday() + "\n*STATS: HP="
                + getHealthPoints() + " Attack=" + getHealthPoints() + "\n*Attributes: Strength=" + getAttackStrengthPoints()
                + " Defense=" + getDefensePoints() + "\n[EXP: " + getExperiencePoints() + " ]" + "\n\n");
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints += experiencePoints;
        System.out.println("Now you have "+getExperiencePoints()+" EXP!");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getBirthday() {
        return year + "/" + month + "/" + day + "\n";
    }

    @Override
    public void Attack(Character enemy) {
        Random rand = new Random();
        int testRand = rand.nextInt(1);
        if (testRand == 1) {
            setAttackStrengthPoints(1);
            System.out.println("Your strength increase by 1.");
        }
        else {
            enemy.setDefensePoints(1);
            System.out.println("\nEnemy's strength increase by 1.");
        }
        int enemyHealthPoints = enemy.getHealthPoints();
        int damage = rand.nextInt(getAttackPoints() + getAttackStrengthPoints())+getAttackPoints()-4;
        int currentDefense = enemyHealthPoints + getDefensePoints();
        enemy.setHealthPoints(currentDefense - damage);
        System.out.println("\n==> "+getName()+" deal "+damage+"DMG | Enemy health: "+enemy.getHealthPoints()+"\n");
    }
}
