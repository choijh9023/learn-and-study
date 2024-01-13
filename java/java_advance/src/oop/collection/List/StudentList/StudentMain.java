package oop.collection.List.StudentList;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
                studentDao.stuList();
                studentDao.studentExamInsert();
                studentDao.studentUpdate();
                studentDao.studentPrintAll();
                studentDao.studentRecordpPrint();
                studentDao.studentPickPrint();


     //여기서는 다오를 불러오는 객체만 가져오면 된다.
    }
}
