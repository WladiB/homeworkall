package Homework18_1;

public class StudentApp {

    public static void main(String[] args) {

        Student student1 = new Student("Peter", 17, 4.5);
        HighSchoolStudent student2 = new HighSchoolStudent("Leila", 16,
                3.5, "School No. 1", "11th grade");
        CollegeStudent student3 = new CollegeStudent("Sascha", 19,
                2.5, "Computer Science", "1st year");

        System.out.println(student1.getName() + " grade is " + student1.getStatus());
        System.out.println(student2.getName() + " grade is " + student2.getStatus());
        System.out.println(student3.getName() + " grade is " + student3.getStatus());
    }
}







