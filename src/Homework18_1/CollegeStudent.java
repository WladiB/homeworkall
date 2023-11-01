package Homework18_1;

    public class CollegeStudent extends Student {

        private String major;
        private String year;

        public CollegeStudent(String name, int age, double gpa, String major, String year) {
            super(name, age, gpa);
            this.major = major;
            this.year = year;
        }

        public String getMajor() {
            return major;
        }

        public String getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "CollegeStudent{" +
                    "name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", gpa=" + getGpa() +
                    ", status='" + getStatus() + '\'' +
                    ", major='" + major + '\'' +
                    ", year='" + year + '\'' +
                    '}';
        }

    }