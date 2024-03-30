package org.rcbg.afku;

import java.util.HashMap;

public class BulletFactory {
    private static HashMap<String, BulletType> types = new HashMap<>();

    public static BulletType getTypeObjectByCaliber(String caliber, String texture, String mesh) {
        BulletType bulletType = types.get(caliber);
        if(bulletType == null){
            bulletType = new BulletType(caliber, texture, mesh);
            types.put(caliber, bulletType);
        }
        return bulletType;
    }
}
