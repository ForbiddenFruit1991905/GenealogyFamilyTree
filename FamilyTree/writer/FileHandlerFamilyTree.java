package HW.familyTree.FamilyTree.FamilyTree.writer;

import HW.familyTree.FamilyTree.FamilyTree.model.FamilyTree;
import HW.familyTree.FamilyTree.FamilyTree.human.Human;

import java.util.List;

public class FileHandlerFamilyTree extends FileHandler implements FileIO {
    private String fileName = "FamilyTree/writer/tree1.txt";

    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean writeToFile(List<Human> familyTree) {
        return false;
    }

    @Override
    public boolean writeToFile(FamilyTree<Human> tree) {
        return super.writeToFile(tree, fileName);
    }

   @Override
    public FamilyTree<Human> readFile() {
        return null;
    }

    @Override
    public FamilyTree<Human> readFile(String fileName) {
        return super.readFile(this.fileName);
    }
}
