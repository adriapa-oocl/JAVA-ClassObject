package model;

public class Student {
    public String studentName;
    public int studentAge;
    public String studentGender;
    public int studentIdNum;

    public Student(String studentName, int studentAge, String studentGender, int studentIdNum) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentIdNum = studentIdNum;
    }

    public Student() {

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public int getStudentIdNum() {
        return studentIdNum;
    }

    public void setStudentIdNum(int studentIdNum) {
        this.studentIdNum = studentIdNum;
    }

    public void printStudent(){
        System.out.println("Name: "+studentName);
        System.out.println("Age: "+studentAge);
        System.out.println("Gender: "+studentGender);
        System.out.println("ID NO.: "+studentIdNum);
    }
}
