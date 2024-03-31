package org.rcbg.afku;

public class AttackCommand extends BaseCommand{

    public AttackCommand(ArmyManager receiver, String param) {
        super(receiver, param);
    }

    @Override
    public void executeOrder() {
        System.out.println("[Executing Attack]");
        this.receiver.armyAttack(this.param);
    }

    public String toString(){
        return String.format("[CommandType: %s, CommandParam: %s]", "Attack", this.param);
    }
}
