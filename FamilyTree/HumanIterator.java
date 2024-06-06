package HW.familyTree.FamilyTree.FamilyTree;

import HW.familyTree.FamilyTree.FamilyTree.human.Human;

import java.util.Iterator;
import java.util.List;

public class HumanIterator implements Iterator<Human> {
    private int index;
    private List<Human> familyList;

    public HumanIterator(List<Human> familyList) {
        this.familyList = familyList;
    }

    @Override
    public boolean hasNext() {
        return familyList.size() > index;
    }

    @Override
    public Human next() {
        return familyList.get(index++);
    }
}
