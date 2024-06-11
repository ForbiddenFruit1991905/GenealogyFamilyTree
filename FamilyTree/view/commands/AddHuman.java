package HW.familyTree.FamilyTree.FamilyTree.view.commands;

import HW.familyTree.FamilyTree.FamilyTree.view.ConsoleUI;

public class AddHuman extends Command{

    public AddHuman(ConsoleUI consoleUI) {
        super("добавить запись в семейное древо", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addHuman();
    }
}
