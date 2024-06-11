package HW.familyTree.FamilyTree.FamilyTree.view;

import HW.familyTree.FamilyTree.FamilyTree.view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commands;

    public MainMenu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new AddHuman(consoleUI));
        commands.add(new GetFamilyListInfo(consoleUI));
        commands.add(new FindHumanById(consoleUI));
        commands.add(new RemoveHuman(consoleUI));
        commands.add(new SortByName(consoleUI));
        commands.add(new SortByAge(consoleUI));
        commands.add(new Finish(consoleUI));
        commands.add(new Save(consoleUI));
        commands.add(new Load(consoleUI));
    }

    public String getMenu() {
        StringBuilder strMenu = new StringBuilder();
        strMenu.append("Выберите из списка необходимую комманду: \n");
        for (int i = 0; i < commands.size(); i++) {
            strMenu.append(i + 1);
            strMenu.append(". ");
            strMenu.append(commands.get(i).getDescription());
            strMenu.append("\n");
        }
        return strMenu.toString();
    }

    public void execute(int choice) {
       Command command = commands.get(choice - 1);
       command.execute();
    }

    public int getSize(){
        return commands.size();
    }
}
