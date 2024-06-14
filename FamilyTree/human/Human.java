package HW.familyTree.FamilyTree.FamilyTree.human;

import HW.familyTree.FamilyTree.FamilyTree.human.enums.Gender;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Relation;
import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTreeItem;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable, FamilyTreeItem<Human> {

    private String firstname;
    private String lastname;
    private String middlename;
    private Gender gender;
    private Relation.Type relation;
    private int id;
    private List<Human> kinder;
    private LocalDate birthDate;
    private LocalDate deathDate;

    public Human(int id, String firstname, String middlename, String lastname, LocalDate birthDate, LocalDate deathDate, Gender gender, Relation.Type relation) {
        this.id = id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.gender = gender;
        this.relation = relation;
        this.kinder = new ArrayList<>();
    }

    public Human(String firstname, String middlename, String lastname, LocalDate birthDate, LocalDate deathDate, Gender gender, Relation.Type relation) {

        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.gender = gender;
        this.relation = relation;
        this.kinder = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
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

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public int getHumanAge(){
        if (deathDate == null){
            return getPeriod(birthDate, LocalDate.now());
        } else {
            return getPeriod(birthDate, deathDate);
        }
    }

    private int getPeriod(LocalDate birthDate, LocalDate deathDate){
        Period diff = Period.between(birthDate, deathDate);
        return diff.getYears();
    }

    public int getAge() {
        return getHumanAge();
    }

    @Override
    public Human addHuman(Human human) {
        return human;
    }

    @Override
    public Human findHumanById(int idHuman) {
        return null;
    }

    @Override
    public Human removeHuman(int id) {
        return null;
    }

    @Override
    public List<Human> getAllPeople() {
        return List.of();
    }

    @Override
    public Human addKinder(Human child) {
        return null;
    }

    public Relation.Type getRelation() {
        return relation;
    }

    public Gender getGender() {
        return gender;
    }

    public List<Human> getKinder() {
        return kinder;
    }

    @Override
    public String toString() {
        return " id: " + id + ", имя: " + firstname + ", отчество: " + middlename + ", фамилия: " + lastname + ", возраст:" + getAge() + ", пол: " + gender + ", семейная связь: " + relation;
    }

    @Override
    public int compareTo(Human o) {
        return firstname.compareTo(o.firstname);
    }
}

