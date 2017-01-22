package Entities.Monster;

import Entities.Character;


public class MonsterCharacter extends Character {
    private String raceName;
    private MagicalSkills skills;

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }


    public MagicalSkills getSkills() {
        return skills;
    }

    public void setSkills(MagicalSkills firstSkill) {
        this.skills = firstSkill;
    }

}
