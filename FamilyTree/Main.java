package HW.familyTree.FamilyTree.FamilyTree;

import HW.familyTree.FamilyTree.FamilyTree.human.Human;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Gender;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Relation;
import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTree;
import HW.familyTree.FamilyTree.FamilyTree.view.ConsoleUI;
import HW.familyTree.FamilyTree.FamilyTree.view.View;
import HW.familyTree.FamilyTree.FamilyTree.writer.FileHandler;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // V.1
        String fileName = "tree1.txt";
        FamilyTree<Human> familyTree = new FamilyTree<>();
        
        Human person1 = new Human( "Vika", "M", "L", LocalDate.of(1991, 5, 19), null, Gender.Female, Relation.Type.Mother);
        Human child1 = new Human( "Sonya", "D", "L", LocalDate.of(2022, 9, 26), null, Gender.Female, Relation.Type.Child);
        Human person2 = new Human( "Dima", "S", "L", LocalDate.of(1990, 7, 31), null, Gender.Male, Relation.Type.Father);

        familyTree.addHumanInTree(person1);
        familyTree.addHumanInTree(child1);
        familyTree.addHumanInTree(person2);

        person1.getKinder(child1);
        person2.getKinder(child1);
        System.out.println(familyTree);
        writeToFile(familyTree, fileName);

        familyTree.sortByAge();
        System.out.println(familyTree);

        // V.2
        View view = new ConsoleUI();
        view.start();
    }
    static FamilyTree readFile(String fileName){
        // Создаем экземпляр класса FileHandler
        FileHandler fileHandler = new FileHandler();
        return (FamilyTree) fileHandler.readFile(fileName);
    }

    static void writeToFile(FamilyTree familyTree, String fileName){
        FileHandler fileHandler = new FileHandler();
        fileHandler.writeToFile(familyTree, fileName);
    }
}



