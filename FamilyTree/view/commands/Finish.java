package HW.familyTree.FamilyTree.FamilyTree.view.commands;

import HW.familyTree.FamilyTree.FamilyTree.view.ConsoleUI;

public class Finish extends Command{

    public Finish(ConsoleUI consoleUI) {
        super("выход из приложения", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().finish();
    }
}
