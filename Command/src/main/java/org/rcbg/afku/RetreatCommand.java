package org.rcbg.afku;

public class RetreatCommand extends BaseCommand{
    public RetreatCommand(ArmyManager receiver, String param) {
        super(receiver, param);
    }

    @Override
    public void executeOrder() {
        System.out.println("[Executing Retreat]");
        this.receiver.armyRetreat(this.param);
    }

    public String toString(){
        return String.format("[CommandType: %s, CommandParam: %s]", "Regroup", this.param);
    }
}
