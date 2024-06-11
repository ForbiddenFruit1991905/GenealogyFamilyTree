package HW.familyTree.FamilyTree.FamilyTree.model.comparators;

import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTreeItem;

import java.util.Comparator;

public class ComparatorByAge<T extends FamilyTreeItem<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
