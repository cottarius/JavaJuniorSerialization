package homework;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Student> students = createStudents();
        StudentApp.saveStudentsToFile(StudentApp.FILE_JSON, students);
        StudentApp.saveStudentsToFile(StudentApp.FILE_XML, students);
        StudentApp.saveStudentsToFile(StudentApp.FILE_BIN, students);

        List<Student> studentsFromJson = StudentApp.loadStudentsFromFile(StudentApp.FILE_JSON);
        System.out.println("Students from JSON");
        studentsFromJson.forEach(System.out::println);
        System.out.println();

        List<Student> studentsFromXML = StudentApp.loadStudentsFromFile(StudentApp.FILE_XML);
        System.out.println("Students from XML");
        studentsFromXML.forEach(System.out::println);
        System.out.println();

        List<Student> studentsFromBin = StudentApp.loadStudentsFromFile(StudentApp.FILE_BIN);
        System.out.println("Students from Bin");
        studentsFromBin.forEach(System.out::println);
    }

    static ArrayList<Student> createStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 20, 2.2));
        students.add(new Student("Oleg", 18, 2.6));
        students.add(new Student("Anna", 25, 2.1));
        return students;
    }
}
