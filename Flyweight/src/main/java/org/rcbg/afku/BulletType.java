package org.rcbg.afku;

import java.util.UUID;

public class BulletType {
    private String caliber;
    private String texture;
    private String mesh;
    private String uuid;

    public BulletType(String caliber, String texture, String mesh) {
        this.caliber = caliber;
        this.texture = texture;
        this.mesh = mesh;
        this.uuid = UUID.randomUUID().toString();
    }

    public void inspect(int x, int y, float velocity, String direction){
        String messageTemplate = """
                BulletType: %s
                Texture: %s
                Mesh: %s
                Type UUID: %s
                Starting point X: %d
                Starting point Y: %d
                Starting velocity: %f
                Direction: %s
                """;
        System.out.println(String.format(messageTemplate, this.caliber, this.texture, this.mesh, this.uuid,
                x, y, velocity, direction));
    }
}
