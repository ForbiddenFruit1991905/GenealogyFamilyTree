package HW.familyTree.FamilyTree.FamilyTree.writer;

import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTree;
import HW.familyTree.FamilyTree.FamilyTree.human.Human;

import java.io.Serializable;
import java.util.List;

public interface FileIO {
    boolean writeToFile(Serializable serializable, String fileName);

    void setFileName(String fileName);

    boolean writeToFile(List<Human> familyTree);

    boolean writeToFile(FamilyTree<Human> familyTree);

    FamilyTree<Human> readFile();
}
