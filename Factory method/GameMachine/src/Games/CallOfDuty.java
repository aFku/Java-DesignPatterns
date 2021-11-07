package Games;

import java.util.Random;

public class CallOfDuty implements IGame {
    private final String name = "CallOfDuty";
    private final String category = "Shooter";
    private final int ageLimit = 18;

    private int enemyHealth = 10;
    private final int yourDamage = 1;
    private final double criticalChance = 0.3;
    private final int criticalMultiplier = 3;

    private boolean isFinished = false;
    private Random rngGenerator = new Random();

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public int getAgeLimitation(){
        return ageLimit;
    }

    public int getEnemyHealth(){
        return enemyHealth;
    }

    public boolean isFinished(){
        return isFinished;
    }

    public void hitEnemy(){
        if(!isFinished) {
            double rngCritChance = rngGenerator.nextDouble();
            if (rngCritChance < criticalChance) {
                enemyHealth -= yourDamage * criticalMultiplier;
            } else {
                enemyHealth -= yourDamage;
            }
            if (enemyHealth <= 0) {
                isFinished = true;
            }
        }
    }
}
