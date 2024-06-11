package HW.familyTree.FamilyTree.FamilyTree.view.commands;

import HW.familyTree.FamilyTree.FamilyTree.view.ConsoleUI;

public class FindHumanById extends Command{

    public FindHumanById(ConsoleUI consoleUI) {
        super("найти человека по ID", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().findHumanById();
    }
}
