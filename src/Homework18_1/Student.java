package Homework18_1;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }

    public double getGpa() {

        return gpa;
    }

    public String getStatus() {
        if (gpa >= 4.5) {
            return "Excellent";
        } else if (gpa >= 3.0 && gpa < 4.5) {
            return "Good";
        } else if (gpa >= 2.0 && gpa < 3.0) {
            return "Satisfactory";
        } else {
            return "Unsatisfactory";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", status='" + getStatus() + '\'' +
                '}';
    }
}



