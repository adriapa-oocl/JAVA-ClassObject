import model.Student;

public class Main {
    public static void main(String[] args) {
        //Creating objects using the constructor for Student//
        Student studentOne = new Student("Patrick Cedie Adriano", 27, "Male", 001);
        Student studentTwo = new Student("Jesse Bryan Dy", 24, "Male", 002);

        //Invoking the objects created to the methods created in Student model//
        studentOne.setStudentName(studentOne.studentName);
        studentOne.setStudentAge(studentOne.studentAge);
        studentOne.setStudentGender(studentOne.studentGender);
        studentOne.setStudentIdNum(studentOne.studentIdNum);
        studentTwo.setStudentName(studentTwo.studentName);
        studentTwo.setStudentAge(studentTwo.studentAge);
        studentTwo.setStudentGender(studentTwo.studentGender);
        studentTwo.setStudentIdNum(studentTwo.studentIdNum);

        studentOne.printStudent();
        studentTwo.printStudent();
    }
}
