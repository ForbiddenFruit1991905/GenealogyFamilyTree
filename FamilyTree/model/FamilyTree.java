package HW.familyTree.FamilyTree.FamilyTree.model;

import HW.familyTree.FamilyTree.FamilyTree.human.Human;
import HW.familyTree.FamilyTree.FamilyTree.model.comparators.ComparatorByAge;
import HW.familyTree.FamilyTree.FamilyTree.model.comparators.ComparatorByName;
import HW.familyTree.FamilyTree.FamilyTree.model.iterator.HumanIterator;

import java.io.*;
import java.util.*;

public class FamilyTree<T extends FamilyTreeItem<T>> implements Serializable, Iterable<T>{

    private Human human;
    private List<T> familyList;
    private List<T> kinder;
    private int count_id = 1;

    public FamilyTree() {
        this.familyList = new ArrayList<>();
    }

    public void addKinder(T child) {
        kinder.add(child);
    }

//    Запись о новом члене семьи
    public void addHuman(T human) {
        human.setId(count_id++);
        familyList.add(human);
    }

//    Поиск человека по ID
    public T findHumanById(int idHuman) {
        for (T human: familyList) {
            if(Objects.equals(human.getId(), idHuman)) {
                return human;
            }
        }
        return null;
    }

//    Удаление записи в древе
    public T removeHuman(int idHuman) {
        for (T human: familyList) {
            if (Objects.equals(human.getId(), idHuman)) {
                return familyList.remove(idHuman - 1);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи: \n");
        for (T human: familyList) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new HumanIterator<>(familyList);
    }

    public void sortByName(){
        familyList.sort(new ComparatorByName<>());
    }

    public void sortByAge(){
        familyList.sort(new ComparatorByAge<>());
    }

    public int getAge() {
        return human.getAge();
    }

}
