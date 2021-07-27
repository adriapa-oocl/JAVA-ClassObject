import model.Student;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        //Creating objects using the constructor for Student//
        Student student = new Student("Patrick Cedie Adriano", 27, "Male", 001);

        //Invoking the objects created to the methods created in Student model//
        student.setStudentName(student.studentName);
        student.setStudentAge(student.studentAge);
        student.setStudentGender(student.studentGender);
        student.setStudentIdNum(student.studentIdNum);
        student.printStudent();

        //Display the attributes of Student model
        System.out.println("\nStudent Attribute Names:");
        for (Field attributeName: Student.class.getDeclaredFields())
        {
            System.out.println(attributeName.getName());
        }
    }
}
