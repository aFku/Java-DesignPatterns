package org.rcbg.afku;

import java.util.ArrayList;
import java.util.List;

public class ShootingRange {
    private List<Bullet> lunchedBullets = new ArrayList<>();

    public void shootBullet(int x, int y, float velocity, String direction, String caliber, String texture, String mesh){
        BulletType bulletType = BulletFactory.getTypeObjectByCaliber(caliber, texture, mesh);
        lunchedBullets.add(new Bullet(x, y, velocity,direction, bulletType));
    }

    public void listLunchedBullets(){
        for(Bullet bullet: this.lunchedBullets){
            bullet.inspect();
            System.out.println("\n");
        }
    }
}
