package HW.familyTree.FamilyTree.FamilyTree;

import HW.familyTree.FamilyTree.FamilyTree.human.Human;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Gender;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Relation;
import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTree;
import HW.familyTree.FamilyTree.FamilyTree.view.ConsoleUI;
import HW.familyTree.FamilyTree.FamilyTree.view.View;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        FamilyTree<Human> familyTree = new FamilyTree<>();

        Human person1 = new Human( "Vika", "M", "L", LocalDate.of(1991, 5, 19), null, Gender.Female, Relation.Type.Spouses);
        Human child1 = new Human( "Sonya", "D", "L", LocalDate.of(2022, 9, 26), null, Gender.Female, Relation.Type.Child);
        Human person2 = new Human( "Dima", "S", "L", LocalDate.of(1990, 7, 31), null, Gender.Male, Relation.Type.Spouses);

        familyTree.addHumanInTree(person1);
        familyTree.addHumanInTree(child1);
        familyTree.addHumanInTree(person2);

        person1.addKinder(child1);
        System.out.println(familyTree);
        familyTree.sortByAge();
        System.out.println(familyTree);

        View view = new ConsoleUI();
        view.start();
    }

}



