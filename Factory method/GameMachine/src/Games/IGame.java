package Games;

public interface IGame {
    public String getName();
    public int getAgeLimitation();
    public String getCategory();
    public void hitEnemy();
    public int getEnemyHealth();
    public boolean isFinished();
}
