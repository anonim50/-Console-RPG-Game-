package Entities;

import java.util.Random;

/**
 * Created by Catalin on 01.01.2017.
 */
public class Character implements IActions {
    private int healthPoints;
    private int attackPoints;
    private int attackStrengthPoints = 0;
    private int defensePoints = 0;


    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getAttackStrengthPoints() {
        return attackStrengthPoints;
    }

    public void setAttackStrengthPoints(int attackStrengthPoints) {
        this.attackStrengthPoints += attackStrengthPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints += defensePoints;
    }

    @Override
    public void Attack(Character enemy){}

    @Override
    public boolean isAlive() {
        if (this.getHealthPoints() > 0)
            return true;
        return false;
    }

}
