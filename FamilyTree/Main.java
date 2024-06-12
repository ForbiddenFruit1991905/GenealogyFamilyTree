package HW.familyTree.FamilyTree.FamilyTree;

import HW.familyTree.FamilyTree.FamilyTree.human.Human;
import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTree;
import HW.familyTree.FamilyTree.FamilyTree.view.ConsoleUI;
import HW.familyTree.FamilyTree.FamilyTree.view.View;
import HW.familyTree.FamilyTree.FamilyTree.writer.FileHandlerFamilyTree;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }

    static FamilyTree readFile(String fileName){
        // Создаем экземпляр класса FileHandler
        FileHandlerFamilyTree fileHandler = new FileHandlerFamilyTree();
        return fileHandler.readFile(fileName);
    }

    static void writeToFile(FamilyTree<Human> familyTree, String fileName){
        FileHandlerFamilyTree fileHandler = new FileHandlerFamilyTree();
        fileHandler.writeToFile(familyTree, fileName);
    }
}



