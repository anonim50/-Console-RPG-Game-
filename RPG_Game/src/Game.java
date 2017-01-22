import Entities.HeroCharacter;
import Entities.Monster.CyclopMonster;
import Entities.Monster.WizardMonster;

/**
 * Created by Catalin on 01.01.2017.
 */
public class Game {
    public static void main(String[] args) {
        HeroCharacter newPlayer = new HeroCharacter("Bucky", 1996, 9, 30);
        int killedMonsters = 0;
        while (newPlayer.isAlive()) {
            WizardMonster newWizard = new WizardMonster();
            while (newWizard.isAlive() && newPlayer.isAlive()) {
                newPlayer.Attack(newWizard);
                if (newWizard.getHealthPoints() <= 0)
                    break;
                newWizard.Attack(newPlayer);
            }
            if (newPlayer.getHealthPoints() <= 0)
                break;
            ++killedMonsters;
            newPlayer.setExperiencePoints(5);
            CyclopMonster newCyclop = new CyclopMonster();
            while (newCyclop.isAlive() && newPlayer.isAlive()) {
                newPlayer.Attack(newCyclop);
                if (newCyclop.getHealthPoints() <= 0)
                    break;
                newCyclop.Attack(newPlayer);
            }
            if (newPlayer.getHealthPoints() <= 0)
                break;
            ++killedMonsters;
            newPlayer.setExperiencePoints(10);
        }
        System.out.println("\n GAME OVER! You killed " + killedMonsters + " monsters. Well done!\n  EXP: "
                + newPlayer.getExperiencePoints());
    }

}
