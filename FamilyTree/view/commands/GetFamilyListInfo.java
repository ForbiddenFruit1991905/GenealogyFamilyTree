package HW.familyTree.FamilyTree.FamilyTree.view.commands;

import HW.familyTree.FamilyTree.FamilyTree.view.ConsoleUI;

public class GetFamilyListInfo extends Command{

    public GetFamilyListInfo(ConsoleUI consoleUI) {
        super("показать весь список", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().getFamilyListInfo();
    }
}
