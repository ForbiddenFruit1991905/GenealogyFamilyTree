package HW.familyTree.FamilyTree.FamilyTree.model;

import HW.familyTree.FamilyTree.FamilyTree.human.Human;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }
}
