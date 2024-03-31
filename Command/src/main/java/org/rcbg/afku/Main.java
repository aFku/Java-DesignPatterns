package org.rcbg.afku;

public class Main {
    public static void main(String[] args) {
        // Create general and army
        General armyGeneral = new General();
        ArmyManager army = new ArmyManager();

        // Start battle with grouping
        BaseCommand command1 = new RegroupCommand(army, "Falanga");
        armyGeneral.setCommand(command1);
        armyGeneral.executeCommand();

        // Attack enemy
        BaseCommand command2 = new AttackCommand(army, "Rush");
        armyGeneral.setCommand(command2);
        armyGeneral.executeCommand();

        // Slow down
        BaseCommand command3 = new AttackCommand(army, "Slow");
        armyGeneral.setCommand(command3);
        armyGeneral.executeCommand();

        // Regroup
        BaseCommand command4 = new RegroupCommand(army, "Testudo");
        armyGeneral.setCommand(command4);
        armyGeneral.executeCommand();

        // Advance
        BaseCommand command5 = new AttackCommand(army, "Medium");
        armyGeneral.setCommand(command5);
        armyGeneral.executeCommand();

        // Retreat
        BaseCommand command6 = new RetreatCommand(army, "100 meters");
        armyGeneral.setCommand(command6);
        armyGeneral.executeCommand();


        // Check history of battle
        armyGeneral.listCommandHistory();
    }
}