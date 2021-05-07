package java设计模式.迭代器模式;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<College> collegeArrayList = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeArrayList.add(computerCollege);
        collegeArrayList.add(infoCollege);
        OutPutImpl outPut = new OutPutImpl(collegeArrayList);
        outPut.printCollege();
    }
}
