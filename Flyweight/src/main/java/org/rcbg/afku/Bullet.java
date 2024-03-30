package org.rcbg.afku;

public class Bullet {
    private int positionX;
    private int positionY;
    private float velocity;
    private String direction;
    private BulletType bulletType;

    public Bullet(int positionX, int positionY, float velocity, String direction, BulletType bulletType) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.velocity = velocity;
        this.direction = direction;
        this.bulletType = bulletType;
    }

    public void inspect(){
        bulletType.inspect(this.positionX, this.positionY, this.velocity, this.direction);
    }
}
