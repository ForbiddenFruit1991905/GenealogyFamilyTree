package HW.familyTree.FamilyTree.FamilyTree.view.commands;

import HW.familyTree.FamilyTree.FamilyTree.view.ConsoleUI;

public class SortByName extends Command{

    public SortByName(ConsoleUI consoleUI) {
        super("отсортировать по имени", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByName();
    }
}
