package HW.familyTree.FamilyTree.FamilyTree;

import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTree;
import HW.familyTree.FamilyTree.FamilyTree.model.Human;
import HW.familyTree.FamilyTree.FamilyTree.model.enums.Gender;
import HW.familyTree.FamilyTree.FamilyTree.model.enums.Relation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName = "Homework/FamilyTree/tree.txt";
//        Чтение из файла
//        FamilyTree tree = readFile(fileName);
//        FamilyTreeService tree = familyTestTree();
//        Сохраняем данные в файл
        FamilyTree tree = new FamilyTree();
        FamilyTreeService service = new FamilyTreeService(tree);

        service.addHuman("Firstname_1_1", "Middlename_1_1", "Lastname_1", Gender.Male, Relation.Type.Spouses);
        service.addHuman("Firstname_1_2", "Middlename_1_2", "Lastname_1", Gender.Female, Relation.Type.Spouses);
        service.addHuman("Firstname_2_1", "Middlename_2_1", "Lastname_2", Gender.Male, Relation.Type.Spouses);
        service.addHuman("Firstname_2_2", "Middlename_2_2", "Lastname_2", Gender.Female, Relation.Type.Spouses);
        service.addHuman("Firstname_3", "Middlename_3", "Lastname_3", Gender.Male, Relation.Type.Divorced);

        System.out.println(service.getFamilyListInfo());

        service.setWritable(new FileHandlerFamilyTree());
        service.writeToFile();

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            getCommands();
//            String command = scanner.nextLine();
//            if (command.equals("1")) {
//                System.out.println("Укажете имя:");
//                String firstname = scanner.nextLine();
//                System.out.println("Укажете отчество:");
//                String middlename = scanner.nextLine();
//                System.out.println("Укажете фамилию:");
//                String lastname = scanner.nextLine();
//                System.out.println("Введите Male или Female");
//                Gender gender = Gender.valueOf(scanner.nextLine());
//                System.out.println("Укажите тип родственной связи Spouses/Child/Divorced:");
//                Relation.Type relation = Relation.Type.valueOf(scanner.nextLine());
//                System.out.println("Запись внесена в семейное древо ---> " +  "имя: " + firstname + ", отчество: " + middlename + ", фамилия: " + lastname + ", пол: " + gender + ", семейная связь: " + relation);
//                tree.addHuman(new Human(firstname, middlename, lastname, gender, relation));
//
//            } else if (command.equals("2")) {
//                System.out.println(tree);
//            } else if (command.equals("3")) {
//                System.out.println("Введите ID: ");
//                int input = scanner.nextInt();
//                System.out.println(tree.findHumanById(input));
//            } else if (command.equals("4")) {
//                System.out.println("Введите ID для удаления: ");
//                int del_human = scanner.nextInt();
//                tree.removeHuman(del_human);
//                System.out.println("Запись удалена");
//            } else if (command.equals("quit")) {
//                break;
//            } else {
//                System.out.println("Такой команды нет");
//            }
//        }
//        scanner.close();
    }

//    static FamilyTreeService familyTestTree(){
//        FamilyTree familyTree = new FamilyTree();
//        FamilyTreeService service = new FamilyTreeService(familyTree);
////        service.setWritable((FileIO) new FileHandler());
//        service.writeToFile();
//
//        service.addHuman("Firstname_1_1", "Middlename_1_1", "Lastname_1", Gender.Male, Relation.Type.Spouses);
//        service.addHuman("Firstname_1_2", "Middlename_1_2", "Lastname_1", Gender.Female, Relation.Type.Spouses);
//        service.addHuman("Firstname_2_1", "Middlename_2_1", "Lastname_2", Gender.Male, Relation.Type.Spouses);
//        service.addHuman("Firstname_2_2", "Middlename_2_2", "Lastname_2", Gender.Female, Relation.Type.Spouses);
//        service.addHuman("Firstname_3", "Middlename_3", "Lastname_3", Gender.Male, Relation.Type.Divorced);
//
//
////        Human person1 = new Human("Firstname_1_1", "Middlename_1_1", "Lastname_1", Gender.Male, Relation.Type.Spouses);
////        familyTree.addHuman(person1);
////        Human person2 = new Human("Firstname_1_2", "Middlename_1_2", "Lastname_1", Gender.Female, Relation.Type.Spouses);
////        familyTree.addHuman(person2);
////        Human person3 = new Human("Firstname_2_1", "Middlename_2_1", "Lastname_2", Gender.Male, Relation.Type.Spouses);
////        familyTree.addHuman(person3);
////        Human person4 = new Human("Firstname_2_2", "Middlename_2_2", "Lastname_2", Gender.Female, Relation.Type.Spouses);
////        familyTree.addHuman(person4);
////        Human person5 = new Human("Firstname_3", "Middlename_3", "Lastname_3", Gender.Male, Relation.Type.Divorced);
////        familyTree.addHuman(person5);
////        Human person6 = new Human("Firstname_4", "Middlename_1_1", "Lastname_1", Gender.Female, Relation.Type.Child);
////        familyTree.addHuman(person6);
////        Human person7 = new Human("Firstname_5", "Middlename_1_1", "Lastname_1", Gender.Female, Relation.Type.Child);
////        familyTree.addHuman(person7);
////        Human person8 = new Human("Firstname_6", "Middlename_1_1", "Lastname_1", Gender.Male, Relation.Type.Child);
////        familyTree.addHuman(person8);
////        Human person9 = new Human("Firstname_7", "Middlename_2_1", "Lastname_2", Gender.Male, Relation.Type.Child);
////        familyTree.addHuman(person9);
////        Human person10 = new Human("Firstname_8", "Middlename_3", "Lastname_3", Gender.Male, Relation.Type.Child);
////        familyTree.addHuman(person10);
////
////        person2.addKinder(person6);
////        person4.addKinder(person7);
////        person4.addKinder(person8);
////        person4.addKinder(person9);
////        person6.addKinder(person10);
//
////        return familyTree;
//        return service;
//    }

//    static FamilyTree readFile(String fileName){
//        // Создаем экземпляр класса FileHandler
//        FileHandlerFamilyTree fileHandler = new FileHandlerFamilyTree();
//        return (FamilyTree) fileHandler.readFile();
//    }
//
//    static void writeToFile(FamilyTree familyTree, String fileName){
//        FileHandlerFamilyTree fileHandler = new FileHandlerFamilyTree();
//        fileHandler.writeToFile(familyTree, fileName);
//    }

//    private static void getCommands() {
//        System.out.println("Выберите из списка необходимую комманду: ");
//        System.out.println("1 - добавить запись в семейное древо");
//        System.out.println("2 - показать весь список");
//        System.out.println("3 - найти человека по ID");
//        System.out.println("4 - удалить запись из семейного древа");
//        System.out.println("quit - выход из приложения");
//    }
}



