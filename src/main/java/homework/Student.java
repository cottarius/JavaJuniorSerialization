package homework;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {

    private String name;
    private int age;
    @JsonIgnore
    private transient double GPA;

    public Student() {
    }

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//   // @JsonIgnore
//    public double getGPA() {
//        return GPA;
//    }
//
//    public void setGPA(double GPA) {
//        this.GPA = GPA;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", GPA=" + GPA +
//                '}';
//    }
}
