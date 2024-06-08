package HW.familyTree.FamilyTree.FamilyTree.service;

import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTree;
import HW.familyTree.FamilyTree.FamilyTree.human.Human;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Gender;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Relation;
import HW.familyTree.FamilyTree.FamilyTree.writer.FileIO;
import java.util.Iterator;


public class FamilyTreeService {
    private FileIO fileIO;
    private FamilyTree<Human> familyTree;
    private FamilyTreeBuilder familyTreeBuilder;

    public FamilyTreeService(FamilyTree<Human> tree) {
        this.familyTree = new FamilyTree<>();
        this.familyTreeBuilder = new FamilyTreeBuilder();
    }

    public void setWritable(FileIO fileIO) {
        this.fileIO = fileIO;
    }

    public Human findHumanById(int idHuman) {
        return familyTree.findHumanById(idHuman);
    }

    public Human removeHuman(int id) {
        return familyTree.removeHuman(id);
    }

    public Iterator<Human> getFamilyIterator() {
        return familyTree.iterator();
    }

    public void addHuman(String firstname, String middlename, String lastname, int age, Gender gender, Relation.Type relation){
        Human human = familyTreeBuilder.build(firstname, middlename, lastname, age, gender, relation);
        familyTree.addHuman(human);
    }

    public void addKinder(String firstname, String middlename, String lastname, int age, Gender gender, Relation.Type relation){
        Human human = familyTreeBuilder.addKinder(firstname, middlename, lastname, age, gender, relation);
        familyTree.addHuman(human);
    }

    public String getFamilyListInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи:\n");
        for (Human human: familyTree) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void writeToFile() {
        if (fileIO == null){
            return;
        }
        fileIO.writeToFile(familyTree);
    }

    public boolean readFile(){
        if (fileIO == null){
            return false;
        }
        familyTree = fileIO.readFile();
        return true;
    }

    public void sortByName(){
        familyTree.sortByName();
    }

    public void sortByAge(){
        familyTree.sortByAge();
    }
}