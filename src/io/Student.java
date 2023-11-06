package io;

public class Student {
        private String name;
        private int age;
        private String studentId;

        // Constructors
        public Student(String name, int age, String studentId) {
            this.name = name;
            this.age = age;
            this.studentId = studentId;
        }

        // Getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        // toString method to represent student information as a string
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", studentId='" + studentId + '\'' +
                    '}';
        }

        // Example usage in main method
        public static void main(String[] args) {
            Student student = new Student("Alice", 20, "12345");
            System.out.println(student);
        }



}
