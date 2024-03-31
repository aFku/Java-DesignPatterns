package org.rcbg.afku;

public class RegroupCommand extends BaseCommand{

    public RegroupCommand(ArmyManager receiver, String param) {
        super(receiver, param);
    }

    @Override
    public void executeOrder() {
        System.out.println("[Executing Regroup]");
        this.receiver.armyRegroup(this.param);
    }

    public String toString(){
        return String.format("[CommandType: %s, CommandParam: %s]", "Regroup", this.param);
    }
}
