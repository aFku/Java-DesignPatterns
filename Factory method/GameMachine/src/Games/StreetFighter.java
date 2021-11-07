package Games;

import java.util.Random;

public class StreetFighter implements IGame{
    private final String name = "StreetFighter";
    private final String category = "Fight";
    private final int ageLimit = 16;

    private int enemyHealth = 20;
    private final int yourDamage = 1;
    private final double criticalChance = 0.4;
    private final double doubleDamageChance = 0.1;
    private final int criticalMultiplier = 2;

    private boolean isFinished = false;
    private Random rngGenerator = new Random();

    public String getName(){
        return "Super " + name;
    }

    public String getCategory(){
        return "Super " + category;
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
            double damage = yourDamage;
            double rngCritChance = rngGenerator.nextDouble();
            if (rngCritChance < criticalChance) {
                damage *= criticalMultiplier;
            }
            double rngDoubleHitChance = rngGenerator.nextDouble();
            if(rngDoubleHitChance < doubleDamageChance){
                damage *= 2;
            }
            enemyHealth -= damage;
            if (enemyHealth <= 0) {
                isFinished = true;
            }
        }
    }
}
