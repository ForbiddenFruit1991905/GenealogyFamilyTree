package HW.familyTree.FamilyTree.FamilyTree.model.service;

import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTree;
import HW.familyTree.FamilyTree.FamilyTree.human.Human;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Gender;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Relation;
import HW.familyTree.FamilyTree.FamilyTree.model.builder.FamilyTreeBuilder;
import HW.familyTree.FamilyTree.FamilyTree.writer.FileIO;

import java.time.LocalDate;

public class FamilyTreeService {
    private FileIO fileIO;
    private FamilyTree<Human> familyTree;
    private FamilyTreeBuilder familyTreeBuilder;

    public FamilyTreeService() {
        this.familyTree = new FamilyTree<>();
        this.familyTreeBuilder = new FamilyTreeBuilder();
    }

    public void setWritable(FileIO fileIO) {
        this.fileIO = fileIO;
    }

    public Human findHumanById(int idHuman) {
        return familyTree.findHumanById(idHuman);
    }

    public Human removeHuman(int idHuman) {
        return familyTree.removeHuman(idHuman);
    }

    public Human addHuman(String firstname, String middlename, String lastname, LocalDate birthDate, LocalDate deathDate, Gender gender, Relation.Type relation){
        Human human = familyTreeBuilder.build(firstname, middlename, lastname, birthDate, deathDate, gender, relation);
        familyTree.addHuman(human);
        return human;
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

    public void getAge() {
        familyTree.getAge();
    }

}