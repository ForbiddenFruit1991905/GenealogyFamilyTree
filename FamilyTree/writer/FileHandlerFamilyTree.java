package HW.familyTree.FamilyTree.FamilyTree.writer;

import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTree;
import HW.familyTree.FamilyTree.FamilyTree.human.Human;

import java.io.Serializable;
import java.util.List;

public class FileHandlerFamilyTree extends FileHandler implements FileIO {
    private String fileName = "tree.txt";

    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean writeToFile(List<Human> familyTree) {
        return super.writeToFile((Serializable)familyTree, fileName);
    }

    @Override
    public boolean writeToFile(FamilyTree familyTree) {
        return false;
    }

    @Override
    public FamilyTree readFile() {
        return null;
    }

    @Override
    public FamilyTree readFile(String fileName) {
        return super.readFile(this.fileName);
    }
}