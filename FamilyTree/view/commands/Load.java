package HW.familyTree.FamilyTree.FamilyTree.view.commands;

import HW.familyTree.FamilyTree.FamilyTree.view.ConsoleUI;

public class Load extends Command{
    public Load(ConsoleUI consoleUI) {
        super("чтение из файла", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().load();
    }
}
