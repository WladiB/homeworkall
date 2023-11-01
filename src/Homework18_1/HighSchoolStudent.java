package Homework18_1;
    public class HighSchoolStudent extends Student {

        private String school;
        private String gradeLevel;

        public HighSchoolStudent(String name, int age, double gpa, String school, String gradeLevel) {
            super(name, age, gpa);
            this.school = school;
            this.gradeLevel = gradeLevel;
        }

        public String getSchool() {
            return school;
}

        public String getGradeLevel() {
            return gradeLevel;
        }

        @Override
        public String toString() {
            return "HighSchoolStudent{" +
                    "name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", gpa=" + getGpa() +
                    ", status='" + getStatus() + '\'' +
                    ", school='" + school + '\'' +
                    ", gradeLevel='" + gradeLevel + '\'' +
                    '}';
        }
    }
