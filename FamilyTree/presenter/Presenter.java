package HW.familyTree.FamilyTree.FamilyTree.presenter;

import HW.familyTree.FamilyTree.FamilyTree.human.Human;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Gender;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Relation;
import HW.familyTree.FamilyTree.FamilyTree.model.service.FamilyTreeService;
import HW.familyTree.FamilyTree.FamilyTree.view.View;

public class Presenter {
    private FamilyTreeService familyTreeService;
    private View view;

    public Presenter(View view) {
        this.view = view;
        familyTreeService = new FamilyTreeService();
    }

    public void addHuman(String firstname, String middlename, String lastname, int age, Gender gender, Relation.Type relation) {
        familyTreeService.addHuman(firstname, middlename, lastname, age, gender, relation);
        //TODO добавить дейтсиве для отображения результата
        getFamilyListInfo();
    }

    public void getFamilyListInfo() {
        String answer = familyTreeService.getFamilyListInfo();
        view.printAnswer(answer);
    }

    public void sortByName() {
        familyTreeService.sortByName();
    }

    public void sortByAge() {
        familyTreeService.sortByAge();
    }

    public Human removeHuman(int idHuman) {
        return familyTreeService.removeHuman(idHuman);
    }

    public Human findHumanById(int idHuman) {
        return familyTreeService.findHumanById(idHuman);
    }

    public void writeToFile() {
        familyTreeService.writeToFile();
    }

    public void readFile() {
        familyTreeService.readFile();
    }
}
