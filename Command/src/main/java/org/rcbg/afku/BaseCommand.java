package org.rcbg.afku;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCommand {

    protected ArmyManager receiver;
    protected String param;

    public BaseCommand(ArmyManager receiver, String param) {
        this.receiver = receiver;
        this.param = param;
    }

    public abstract void executeOrder();

    public abstract String toString();
}
