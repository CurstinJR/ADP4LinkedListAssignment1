package za.ac.cput;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Student> studentList = new SinglyLinkedList<>();

        studentList.add(new Student("John Doe", 123456789L, "Information Technology", new Mark(80, 75, 60, 70)));
        studentList.add(new Student("Jane Doe", 987654321L, "Business Administration", new Mark(70, 65, 80, 75)));
        studentList.add(new Student("Alice Smith", 456789123L, "Accounting", new Mark(85, 90, 95, 100)));
        studentList.add(new Student("Bob Smith", 654123789L, "Economics", new Mark(60, 55, 50, 45)));

        StudentTablePrinter.printStudentList(studentList);
    }
}