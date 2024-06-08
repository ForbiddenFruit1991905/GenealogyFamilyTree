package HW.familyTree.FamilyTree.FamilyTree.service;

import HW.familyTree.FamilyTree.FamilyTree.human.Human;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Gender;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Relation;

import java.util.List;

public class FamilyTreeBuilder {
    private int count_id = 1;
    private Human human;
    private List<Human> kinder;

    public Human build(String firstname, String middlename, String lastname, int age, Gender gender, Relation.Type relation){
        return new Human(count_id++, firstname, middlename, lastname, age, gender, relation);
    }

    public Human addKinder(String firstname, String middlename, String lastname, int age, Gender gender, Relation.Type relation) {
        return new Human(count_id++, firstname, middlename, lastname, age, gender, relation);
    }
}
