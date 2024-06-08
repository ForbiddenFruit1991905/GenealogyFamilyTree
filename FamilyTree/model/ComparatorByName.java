package HW.familyTree.FamilyTree.FamilyTree.model;

import java.util.Comparator;

public class ComparatorByName<T extends FamilyTreeItem<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }

}
