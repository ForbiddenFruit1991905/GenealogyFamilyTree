package HW.familyTree.FamilyTree.FamilyTree.model;

import HW.familyTree.FamilyTree.FamilyTree.human.Human;

import java.io.Serializable;
import java.util.List;

public interface FamilyTreeItem<T> extends Serializable, Comparable<T>{

    int getId();
    String getFirstname();
    int getAge();
    Human addHuman(T human);
    T findHumanById(int idHuman);
    T removeHuman(int id);
    List<T> getAllPeople();

}
