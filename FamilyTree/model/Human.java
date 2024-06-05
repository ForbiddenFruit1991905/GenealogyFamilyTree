package HW.familyTree.FamilyTree.FamilyTree.model;

import HW.familyTree.FamilyTree.FamilyTree.model.enums.Gender;
import HW.familyTree.FamilyTree.FamilyTree.model.enums.Relation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable{

    private String firstname;
    private String lastname;
    private String middlename;
    private Gender gender;
    private Relation.Type relation;
    private int id;
    private List<Human> kinder;


    public Human(Gender gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Human(int id, String firstname, String middlename, String lastname, Gender gender, Relation.Type relation) {
        this.id = id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.gender = gender;
        this.relation = relation;
        this.kinder = new ArrayList<>();
    }

    public void addKinder(Human child) {
        kinder.add(child);
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public List<Human> getKinder() {
        return kinder;
    }

    @Override
    public String toString() {
        return " id: " + id + ", имя: " + firstname + ", отчество: " + middlename + ", фамилия: " + lastname + ", пол: " + gender + ", семейная связь: " + relation;
    }
}

