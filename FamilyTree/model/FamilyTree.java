package HW.familyTree.FamilyTree.FamilyTree.model;

import HW.familyTree.FamilyTree.FamilyTree.human.Human;

import java.io.*;
import java.util.*;

public class FamilyTree<T extends FamilyTreeItem<T>> implements Serializable, Iterable<T>{

    private Human human;
    private List<T> familyList;

    public FamilyTree() {
        this.familyList = new ArrayList<>();
    }

//    Запись о новом члене семьи
    public void addHuman(T human) {
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
    public T removeHuman(int id) {
       return familyList.remove(id-1);
//       return human;
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
//        Collections.sort(familyList, new ComparatorByAge());
        familyList.sort(new ComparatorByAge<>());
    }
}
