package HW.familyTree.FamilyTree.FamilyTree.model;

import HW.familyTree.FamilyTree.FamilyTree.HumanIterator;
import HW.familyTree.FamilyTree.FamilyTree.human.Human;

import java.io.*;
import java.util.*;

public class FamilyTree implements Serializable, Iterable<Human>{

    private Human human;
    private List<Human> familyList;
//    private int count_id = 1;

    public FamilyTree() {
        this.familyList = new ArrayList<>();
    }

//    Запись о новом члене семьи
    public void addHuman(Human human) {
//        human.setId(count_id++);
        familyList.add(human);
    }

//    Поиск человека по ID
    public Human findHumanById(int idHuman) {
        for (Human human: familyList) {
            if(Objects.equals(human.getId(), idHuman)) {
                return human;
            }
        }
        return null;
    }

//    Удаление записи в древе
    public Human removeHuman(int id) {
        familyList.remove(id-1);
        return human;
    }

//    Возвращаем список персон
public List<Human> getAllPeople() {
    return (List<Human>) human;
}

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи: \n");
        for (Human human: familyList) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(familyList);
    }

    public void sortByName(){
        familyList.sort(new ComparatorByName());
    }

    public void sortByAge(){
//        Collections.sort(familyList, new ComparatorByAge());
        familyList.sort(new ComparatorByAge());
    }
}
