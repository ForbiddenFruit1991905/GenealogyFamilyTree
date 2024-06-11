package HW.familyTree.FamilyTree.FamilyTree;

import HW.familyTree.FamilyTree.FamilyTree.human.Human;
import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTree;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Gender;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Relation;
import HW.familyTree.FamilyTree.FamilyTree.model.service.FamilyTreeService;
import HW.familyTree.FamilyTree.FamilyTree.view.ConsoleUI;
import HW.familyTree.FamilyTree.FamilyTree.view.View;
import HW.familyTree.FamilyTree.FamilyTree.writer.FileHandlerFamilyTree;

public class Main {

    public static void main(String[] args) {
        String fileName = "tree.txt";
//        Чтение из файла
//        FamilyTree familyTree = readFile(fileName);
//        Сохраняем данные в файл
        FamilyTree<Human> familyTree = new FamilyTree();
        FamilyTreeService service = new FamilyTreeService();

        service.addHuman("Firstname_4", "Middlename_1_1", "Lastname_1", 37, Gender.Male, Relation.Type.Spouses);
        service.addHuman("Firstname_1_2", "Middlename_1_2", "Lastname_1", 35, Gender.Female, Relation.Type.Spouses);
        service.addKinder("Firstname_2_1", "Middlename_2_1", "Lastname_2", 7, Gender.Male, Relation.Type.Child);
        service.addKinder("Firstname_2_2", "Middlename_2_2", "Lastname_2", 5, Gender.Female, Relation.Type.Child);
        service.addKinder("Firstname_3", "Middlename_3", "Lastname_3", 9, Gender.Male, Relation.Type.Child);

        System.out.println(service.getFamilyListInfo());
        service.removeHuman(2);
        System.out.println(service.getFamilyListInfo());
        service.setWritable(new FileHandlerFamilyTree());
        service.writeToFile();
        service.sortByName();
        System.out.println(service.getFamilyListInfo());
        service.sortByAge();
        System.out.println(service.getFamilyListInfo());
        service.findHumanById(4);
        System.out.println(service.findHumanById(4));

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



