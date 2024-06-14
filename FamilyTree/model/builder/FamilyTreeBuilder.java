package HW.familyTree.FamilyTree.FamilyTree.model.builder;

import HW.familyTree.FamilyTree.FamilyTree.human.Human;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Gender;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Relation;

import java.time.LocalDate;
import java.util.List;

public class FamilyTreeBuilder {
    private int count_id = 1;
    private Human human;
    private List<Human> kinder;

    public Human build(String firstname, String middlename, String lastname, LocalDate birthDate, LocalDate deathDate, Gender gender, Relation.Type relation){
//        human.setId(count_id++);
        return new Human(count_id++, firstname, middlename, lastname, birthDate, deathDate, gender, relation);
    }

}
