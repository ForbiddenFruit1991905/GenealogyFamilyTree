package HW.familyTree.FamilyTree.FamilyTree.view.commands;

import HW.familyTree.FamilyTree.FamilyTree.view.ConsoleUI;

public class Save extends Command{

    public Save(ConsoleUI consoleUI) {
        super("сохранение в файл", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().save();
    }
}
