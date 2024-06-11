package HW.familyTree.FamilyTree.FamilyTree.view.commands;

import HW.familyTree.FamilyTree.FamilyTree.view.ConsoleUI;

public class RemoveHuman extends Command{

    public RemoveHuman(ConsoleUI consoleUI) {
        super("удалить запись из семейного древа", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().removeHuman();
    }
}
