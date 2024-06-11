package HW.familyTree.FamilyTree.FamilyTree.model.iterator;

import java.util.Iterator;
import java.util.List;

public class HumanIterator<T> implements Iterator<T> {
    private int index;
    private List<T> familyList;

    public HumanIterator(List<T> familyList) {
        this.familyList = familyList;
    }

    @Override
    public boolean hasNext() {
        return familyList.size() > index;
    }

    @Override
    public T next() {
        return familyList.get(index++);
    }
}
