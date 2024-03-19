package org.rcbg.afku;

public class HouseBrochure {
    private String walls;
    private String roof;
    private String swimmingPool;
    private String garden;

    public HouseBrochure(String walls, String roof, String swimmingPool, String garden){
        this.walls = walls;
        this.roof = roof;
        this.swimmingPool = swimmingPool;
        this.garden = garden;
    }

    public HouseBrochure(){}

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public String getGarden() {
        return garden;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }

    public String getBrochure(){
        String specTemplate = "Has a %s walls made with bricks. The roof is made of %s. There is a garden %s with %s swimming pool";
        return String.format(specTemplate, this.walls, this.roof, this.garden, this.swimmingPool);
    }
}
