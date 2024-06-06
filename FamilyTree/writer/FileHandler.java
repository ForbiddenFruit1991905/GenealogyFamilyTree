package HW.familyTree.FamilyTree.FamilyTree.writer;

import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTree;


import java.io.*;


public abstract class FileHandler{
    public boolean writeToFile(Serializable serializable, String fileName) {
        // Сохранение дерева в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(serializable);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public FamilyTree readFile(String fileName) {
        // Загрузка дерева из файла
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (FamilyTree) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
