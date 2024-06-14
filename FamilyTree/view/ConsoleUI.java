package HW.familyTree.FamilyTree.FamilyTree.view;

import HW.familyTree.FamilyTree.FamilyTree.human.enums.Gender;
import HW.familyTree.FamilyTree.FamilyTree.human.enums.Relation;
import HW.familyTree.FamilyTree.FamilyTree.presenter.Presenter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean flag;
    private MainMenu mainMenu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        flag = true;
        mainMenu = new MainMenu(this);
    }

    @Override
    public void start() {

        while (flag) {
            System.out.println(mainMenu.getMenu());
            String command = scanner.nextLine();
            if(checkChoice(command)){
                if (checkChoice(command)){
                    mainMenu.execute(Integer.parseInt(command));
                }
            } else {
                System.out.println("Такой команды нет. \nПопробуйте еще раз ввести данные");
            }
        }
    }

    public void addHuman() {
        System.out.println("Укажете имя:");
        String firstname = scanner.nextLine();
        System.out.println("Укажете отчество:");
        String middlename = scanner.nextLine();
        System.out.println("Укажете фамилию:");
        String lastname = scanner.nextLine();
        System.out.println("Укажите год рождения:");

//        String bDay = scanner.nextLine();
        LocalDate birthDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd. MMM. yyyy");
        System.out.println(birthDate.format(dtf));
        LocalDate deathDate = null;

//        String ageStr = scanner.nextLine();
//        int age = Integer.parseInt(ageStr);
        System.out.println(scanner.nextLine());
        System.out.println("Введите Male или Female");
        Gender gender = Gender.valueOf(scanner.nextLine());
        System.out.println("Укажите тип родственной связи Spouses/Child/Divorced:");
        Relation.Type relation = Relation.Type.valueOf(scanner.nextLine());
        System.out.println("Запись внесена в семейное древо ---> " +  "имя: " + firstname + ", отчество: " + middlename + ", фамилия: " + lastname + ", дата рождения: " + birthDate + ", пол: " + gender + ", семейная связь: " + relation);
        presenter.addHuman(firstname, middlename, lastname, birthDate, deathDate, gender, relation);
    }

    private Object getAge() {
        return presenter;
    }

    public void getFamilyListInfo() {
        presenter.getFamilyListInfo();
    }

    public void findHumanById() {
        System.out.println("Введите ID: ");
        String strID  = scanner.nextLine();
        int idHuman = Integer.parseInt(strID);
        System.out.println(presenter.findHumanById(idHuman));
    }

    public void removeHuman() {
        System.out.println("Введите ID для удаления: ");
        String strID = scanner.nextLine();
        int id = Integer.parseInt(strID);
        presenter.removeHuman(id);
        System.out.println("Запись удалена");
        presenter.getFamilyListInfo();
    }

    public void sortByName() {
        presenter.sortByName();
        presenter.getFamilyListInfo();
    }

    public void sortByAge() {
        presenter.sortByAge();
        presenter.getFamilyListInfo();
    }

    public void finish() {
        System.out.println("Quit");
        flag = false;
    }

    public void save() {
        presenter.writeToFile();
    }

    public void load() {
        presenter.readFile();
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    public boolean checkChoice(String choiceStr) {
        if (choiceStr.matches("[0-9]*")) {
            int choice = Integer.parseInt(choiceStr);
            return (choice >= 1  && choice <= mainMenu.getSize());
        }
        return false;
    }
}
