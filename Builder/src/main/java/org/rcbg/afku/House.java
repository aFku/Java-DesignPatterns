package org.rcbg.afku;


public class House {
    private String walls;
    private String roof;
    private String swimmingPool;
    private String garden;

    public House(String walls, String roof, String swimmingPool, String garden){
        this.walls = walls;
        this.roof = roof;
        this.swimmingPool = swimmingPool;
        this.garden = garden;
    }

    public House(){}

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

    public String getHouseSpecification(){
        String specTemplate = "Walls: %s, Roof: %s, SwimmingPool: %s, Garden: %s";
        return String.format(specTemplate, this.walls, this.roof, this.swimmingPool, this.garden);
    }
}
