package za.ac.cput;

public class StudentTablePrinter {
    public static void printStudentList(SinglyLinkedList<Student> studentList) {
        // Define the format for the header and the rows
        String headerFormat = "| %-20s | %-15s | %-25s | %-10s | %-10s | %-10s | %-10s | %-10s |%n";
        String rowFormat = "| %-20s | %-15d | %-25s | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-10.2f |%n";

        // Print the table header
        System.out.format("+----------------------+-----------------+---------------------------+------------+------------+------------+------------+------------+%n");
        System.out.format(headerFormat, "Student Name", "Student Number", "Course", "T1", "T2", "T3", "T4", "Final Mark");
        System.out.format("+----------------------+-----------------+---------------------------+------------+------------+------------+------------+------------+%n");

        // Iterate over the linked list and print each student's details
        SinglyLinkedList.Node<Student> current = studentList.getHead();
        while (current != null) {
            Student student = current.getData();
            Mark mark = student.getMark();
            double finalMark = mark != null ? mark.calculateFinalMark() : 0.0;
            System.out.format(
                    rowFormat, student.getName(),
                    student.getStudentNumber(),
                    student.getCourse(),
                    mark != null ? mark.getT1() : 0.0,
                    mark != null ? mark.getT2() : 0.0,
                    mark != null ? mark.getT3() : 0.0,
                    mark != null ? mark.getT4() : 0.0,
                    finalMark
            );
            current = current.getNext();
        }

        // Print the table footer
        System.out.format("+----------------------+-----------------+---------------------------+------------+------------+------------+------------+------------+%n");
    }
}
