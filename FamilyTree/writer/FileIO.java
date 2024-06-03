package HW.familyTree.FamilyTree.FamilyTree.writer;

import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTree;

import java.io.Serializable;

public interface FileIO {
    boolean writeToFile(Serializable serializable, String fileName);
    FamilyTree readFile(String fileName);
}
