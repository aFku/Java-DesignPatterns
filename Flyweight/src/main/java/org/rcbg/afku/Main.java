package org.rcbg.afku;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 9mm data
        String caliber_9mm = "9mm";
        String texture_9mm = "<random bytes for 9mm texture>";
        String mesh_9mm = "<random bytes for 9mm mesh>";

        // .50cal
        String caliber_50cal = ".50cal";
        String texture_50cal = "<random bytes for .50cal texture>";
        String mesh_50cal = "<random bytes for .50cal mesh>";

        // 223. rem
        String caliber_223 = "223. REM";
        String texture_223 = "<random bytes for 223. REM texture>";
        String mesh_223 = "<random bytes for 223. REM mesh>";

        ShootingRange shootingRange = new ShootingRange();
        Random random = new Random();

        shootingRange.shootBullet(random.nextInt(0, 255),
                random.nextInt(0, 255),
                random.nextFloat(300.0f, 900.0f),
                "SW",
                caliber_9mm,
                texture_9mm,
                mesh_9mm);

        shootingRange.shootBullet(random.nextInt(0, 255),
                random.nextInt(0, 255),
                random.nextFloat(300.0f, 900.0f),
                "NW",
                caliber_50cal,
                texture_50cal,
                mesh_50cal);

        shootingRange.shootBullet(random.nextInt(0, 255),
                random.nextInt(0, 255),
                random.nextFloat(300.0f, 900.0f),
                "N",
                caliber_223,
                texture_223,
                mesh_223);

        shootingRange.shootBullet(random.nextInt(0, 255),
                random.nextInt(0, 255),
                random.nextFloat(300.0f, 900.0f),
                "S",
                caliber_9mm,
                texture_9mm,
                mesh_9mm);

        shootingRange.shootBullet(random.nextInt(0, 255),
                random.nextInt(0, 255),
                random.nextFloat(300.0f, 900.0f),
                "S",
                caliber_9mm,
                texture_9mm,
                mesh_9mm);

        shootingRange.shootBullet(random.nextInt(0, 255),
                random.nextInt(0, 255),
                random.nextFloat(300.0f, 900.0f),
                "E",
                caliber_9mm,
                texture_9mm,
                mesh_9mm);

        shootingRange.shootBullet(random.nextInt(0, 255),
                random.nextInt(0, 255),
                random.nextFloat(300.0f, 900.0f),
                "E",
                caliber_223,
                texture_223,
                mesh_223);

        shootingRange.shootBullet(random.nextInt(0, 255),
                random.nextInt(0, 255),
                random.nextFloat(300.0f, 900.0f),
                "S",
                caliber_223,
                texture_223,
                mesh_223);

        shootingRange.shootBullet(random.nextInt(0, 255),
                random.nextInt(0, 255),
                random.nextFloat(300.0f, 900.0f),
                "SE",
                caliber_50cal,
                texture_50cal,
                mesh_50cal);

        shootingRange.listLunchedBullets();
    }
}